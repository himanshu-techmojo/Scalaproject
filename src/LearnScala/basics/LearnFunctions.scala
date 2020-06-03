package LearnScala.basics

object LearnFunctions extends App{
  def aSimpleFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aSimpleFunction("himanshu", 1326))

  // 1. parameterless Function
  def call(): Int = 1001
  println(call())
  println(call)

  // 2. a repeated Function
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("himanshu ",2))

  // WHEN YOU NEED LOOPS, USE RECURSION.

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)
 // 3. auxillary functions
  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }

  // examples

  def printNameAndAge(name: String, age: Int): String =
    "Hi, my name is " + name + " and I am " + age + " years old."
  println(printNameAndAge("Himanshu", 24))

  // factorial function

  def factorial(n: Int): Int =
    if (n <= 0) 1
    else n * factorial(n-1)

  println(factorial(5))

  // fibonacci series

  def fibonacci(n: Int): Int =
    if (n <= 2) 1
    else fibonacci(n-1) + fibonacci(n-2)

  // 1 1 2 3 5 8 13
  println(fibonacci(7))

  // prime number

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)
  }
  println(isPrime(73))
  println(isPrime(2003))
  println(isPrime(11 * 13 * 17))
}
