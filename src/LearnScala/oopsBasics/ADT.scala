package LearnScala.oopsBasics

object ADT extends App {

  //declare abstract class
  abstract class Automobile{
    val wheel_type:String
    def run:Unit

  }

  class Car extends Automobile{
    override val wheel_type: String = "four wheeler"

    override def run: Unit = println("car runs on road")
  }

  class Bike extends Automobile{
    override val wheel_type: String = "two wheeler"

    override def run: Unit = println("bike runs on road")
  }

  //traits
  trait Auto{
    def run(automobile : Automobile)

  }

  class Truck extends Automobile with Auto{
    override val wheel_type: String = "four wheeler"

    override def run: Unit = println("Truck runs")

    override def run(automobile: Automobile): Unit = println(s"truck runs along with a ${automobile.wheel_type}")
  }

  val car = new Car
  val truck = new Truck
  truck.run(car)

  // traits vs abstract classes
  // 1 - traits do not have constructor parameters
  // 2 - multiple traits may be  inherited by the same class
  // 3 - traits = behavior, abstract class = "thing"

}