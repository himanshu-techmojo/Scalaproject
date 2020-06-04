package LearnScala.oopsBasics
import scala.language.postfixOps
object Methods extends App{

  class Employee(val name: String, department: String, val salary: Int = 0) {
    def worksAs(department: String): Boolean = this.department == department
    def +(employee: Employee): String = s"${this.name} works with ${employee.name}"
    def +(nickname: String): Employee = new Employee(s"$name ($nickname)", department)
    def unary_! : String = s"$name, this code is really complex!"
    def unary_+ : Employee = new Employee(name, department, salary*12)
    def onLeave: Boolean = false
    def apply(): String = s"Hi, my name is $name and I work in $department"
    def apply(n: Int): String = s"$name worked in $department for $n years "
    def codes(language: String) = s"$name is conding in  $language"
    def code = this codes "Scala"
  }

  val himanshu = new Employee("himanshu", "Information Technology", 50000)

  // infix notation = operator notation (syntactic sugar)
  println(himanshu.worksAs("Software Developer"))
  println(himanshu worksAs "Software Developer") // equivalent


  // "operators" in Scala
  val yash = new Employee("Yash", "Finance")
  println(himanshu + yash)
  println(himanshu.+(yash))

  // All operators are methods

  // prefix notation

  println(!himanshu)
  println(himanshu.unary_!)

  // postfix notation
  println(himanshu.onLeave)
  println(himanshu onLeave)


  // apply
  println(himanshu.apply())
  println(himanshu()) // equivalent

  println((himanshu + "the Software Developer").apply())
  println((+himanshu).salary)
  println(himanshu code)
  println(himanshu(3)) // val can be used as a function

}
