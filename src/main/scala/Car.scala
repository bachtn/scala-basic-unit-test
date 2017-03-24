
/**
  * Created by bach on 24/03/17.
  */
object Car {
  val car: Car = new Car("Bugatti Chiron", "Paul")
  val drivers: Seq[Driver] = Seq[Driver]()

}

class Car(model: String, owner: String) {
  import Car._

  def getModel: String = model
  def getOwner: String = owner
  def addDriver(driver: Driver): Unit = drivers :+ driver
  def getDriverByName(driverName: String): Option[Driver] = drivers.find(_.name == driverName)
}

case class Driver(name: String, age: Int)

