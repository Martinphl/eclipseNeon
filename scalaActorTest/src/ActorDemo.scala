
case object Stop
case object No_more_N
case object I_am_done
case object Give_me_a_new_one

object ActorDemo {
  def main(args: Array[String]) {
    val assembler = new Assembler
    assembler.start()
    val dispatcher = new Dispatcher(100000, 10, assembler)
    dispatcher.start()

    for (i <- 0 to 9) {
      new Processor(dispatcher, assembler).start()
    }

  }
}