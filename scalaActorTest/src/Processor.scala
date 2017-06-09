import scala.actors._

class Processor(dispatcher: Actor, assembler: Actor) extends Actor {
  var PrimeNCc = 0

  def act() {
    dispatcher ! Give_me_a_new_one

    while (true) {
      receive {
        case No_more_N =>
          assembler ! PrimeNCc
          sender ! I_am_done
          exit()
        case num: Int =>
          if (isPrime(num)) {
            PrimeNCc += 1
          }
          sender ! Give_me_a_new_one
      }
    }
  }

  def isPrime(num: Int): Boolean = {
    var flag = true
    for (i <- 2 to num - 1) {
      if (num % i == 0)
        flag = false
    }
    flag
  }
}