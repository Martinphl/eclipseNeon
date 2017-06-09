import scala.actors._


class Dispatcher(maxN: Int, actorC: Int, assemler: Actor) extends Actor {
  var currentN = 2
  var actors = actorC

  def act() {
    while (true) {
      receive {
        case Give_me_a_new_one => if (currentN <= maxN) {
          sender ! currentN
          currentN += 1
        } else { sender ! No_more_N }
        case I_am_done =>
          actors -= 1
          if (actors == 0)
            assemler ! Stop
          exit()

      }
    }
  }
}