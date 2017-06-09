
import scala.actors._

class Assembler extends Actor {
  var primeNC = 0
  def act() {
    while (true) {
      receive {
        case count: Int =>
          primeNC += count
          println("primeNC:" + primeNC)

        case Stop =>
          println("primeNC:" + primeNC)
          exit()
      }
    }
  }
}