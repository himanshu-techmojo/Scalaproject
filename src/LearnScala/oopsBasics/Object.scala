package LearnScala.oopsBasics

object Object extends App {

  // Scala does not have class-level functionality("static")

  object Employee{
    val SALARY = 20000
    val GENDER = "Male"
    val DEPARTMENT = "Finance"
    def isManager = false

    // factory Method to create Employee
    def apply(gender : String, department:String) = new Employee("Himanshu",24)
  }

  // Companions classes

  class Employee(val name: String, age : Int = 0){
    //to implement instance level functionality
  }
  println(Employee.DEPARTMENT)
  println(Employee.SALARY)
  println(Employee.GENDER)

  // scala objects are singleton classes

  val yash = new Employee("yash")
  val abhay = new Employee("abhay")

  println( yash==abhay) // returns false

  val employee1 = Employee
  val employee2 = Employee
  println( employee1 == employee2)  // returns true

  // calls appy Method
  val himanshu = Employee("male", "Finance")
  println(himanshu.name) // converted parameter to field



}
