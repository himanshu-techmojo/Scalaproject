package LearnScala.oopsBasics

object OOPSBasics extends App {
  // constructor
  class Employee(name: String, val age: Int = 0) {
    // body
    val salary = 50000

    println("Hello Employee")

    // method
    //this.name refers to the class variable name
    def callEmployee(name: String): Unit = println(s"${this.name} says: Hi, $name")

    // overloading
    def callEmployee(): Unit = println(s"Hi, I am $name and my age is $age" )

    // multiple constructors
    def this(name: String) = this(name, 0)
    def this() = this("Himanshu")
  }
  val employee = new Employee("Himanshu", 24)
  println(employee.salary)
  employee.callEmployee("Yash")
  employee.callEmployee() // overloading

  /*
  Counter class
    - receives an int value
    - method current count
    - method to increment/decrement => new Counter
    - overload inc/dec to receive an output
 */
  class Counter(val count: Int = 0) {
    def inc = {
      println("incrementing")
      new Counter(count + 1)  // immutability, produces a new Counter each time
    }

    def dec = {
      println("decrementing")
      new Counter(count - 1)
    }

    // increment n times

    def inc(n: Int): Counter = {
      if (n <= 0) this
      else inc.inc(n-1) // avoiding looping
    }
    // decrement n times
    def dec(n: Int): Counter =
      if (n <= 0) this
      else dec.dec(n-1)

    def print = println(count)
  }

  // class parameters are NOT FIELDS
}
