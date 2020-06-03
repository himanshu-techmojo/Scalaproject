package LearnScala.basics
import scala.annotation.tailrec
object Recursion extends App {
  // simple factorial function
  def simpleFactorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n-1))
      val result = n * simpleFactorial(n-1)
      println("Computed factorial of " + n)

      result
    }

  println(simpleFactorial(7))
  /*
  * produce stack overflow error
  * println(simpleFactorial(2000))
  */

 // refractor Factorial
  def complexFactorial(n: Int): BigInt = {
    @tailrec
    def calFactorial(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else calFactorial(x - 1, x * accumulator) // TAIL RECURSION = use recursive call as the LAST expression

    calFactorial(n, 1)
  }

  /*
    complexFactorial(10) = calFactorial(10, 1)
    = calFactorial(9, 10 * 1)
    = calFactorial(8, 9 * 10 * 1)
    = calFactorial(7, 8 * 9 * 10 * 1)
    = ...
    = calFactorial(2, 3 * 4 * ... * 10 * 1)
    = calFactorial(1, 1 * 2 * 3 * 4 * ... * 10)
    = 1 * 2 * 3 * 4 * ... * 10
   */
    val startTime : Long = System.currentTimeMillis()
  println(complexFactorial(20000))
  println("Time Taken :" + ( System.currentTimeMillis() - startTime) + " ms")

  // WHEN YOU NEED LOOPS, USE _TAIL_ RECURSION.

  /*
    1.  IsPrime function tail recursive
    2.  Fibonacci function, tail recursive.
   */

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)

    isPrimeTailrec(n / 2, true)
  }

  println(isPrime(2003))
  println(isPrime(629))

  def fibonacci(n: Int): Int = {
    def fiboTailrec(i: Int, last: Int, nextToLast: Int): Int =
      if(i >= n) last
      else fiboTailrec(i + 1, last + nextToLast, last)

    if (n <= 2) 1
    else fiboTailrec(2, 1, 1)
  }

  println(fibonacci(7)) // 1 1 2 3 5 8 13
}
