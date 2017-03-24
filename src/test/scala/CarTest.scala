
/**
  * Created by bach on 24/03/17.
  */

import org.scalatest._

class CarTest extends FreeSpec with Matchers {
  trait Case {
    val car = new Car("Bugatti Veyron", "James")
  }

  "Testing Car methods" - {
    "getModel" in new Case {
      car.getModel shouldBe "Bugatti Veyron"
    }
  }
}
