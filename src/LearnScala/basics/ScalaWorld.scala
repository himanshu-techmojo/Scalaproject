package LearnScala.basics

object ScalaWorld extends App {
  def calledByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("by name: " + x)  // same as  x-> System.nanoTime()
    println("by name: " + x)  // same as  x-> System.nanoTime()
  }

  calledByValue(1234567891234L)
  calledByName(System.nanoTime())

  def infiniteFunction(): Int = 1 + infiniteFunction()
  def printFirst(x: Int, y: => Int) = println(x)

  //  printFirst(infinite(), 34)
  // evaluated at runtime alone. Since y is never used in the implementation, the function is not evaluated.
  printFirst(34, infiniteFunction())
}
