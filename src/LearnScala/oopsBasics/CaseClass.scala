package LearnScala.oopsBasics

object CaseClass extends App {

  /*
   equals, hashCode, toString
  */

  case class Person(name: String, age: Int)

  // 1. class parameters are fields
  val himanshu = new Person("himanshu", 24)
  println(himanshu.name)

  // 2. sensible toString
  // println(instance) = println(instance.toString) // syntactic sugar
  println(himanshu)

  // 3. equals and hashCode implemented OOTB
  val yash = new Person("Yash", 24)
  println(yash == himanshu)

  // 4. CCs have handy copy method
  val himanshu2 = himanshu.copy(age = 45)
  println(himanshu2)

  // 5. CCs have companion objects
  val thePerson = Person
  val abhay = Person("Abhay", 23)

  // 6. CCs are serializable
  // Akka

  // 7. CCs have extractor patterns = CCs can be used in PATTERN MATCHING

  case object India {
    def name: String = "The India"
  }



}
