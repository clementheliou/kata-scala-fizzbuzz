package fr.xebia.kata.fizzbuzz.scala

object FizzBuzz {

  def computeFizzBuzz(): String = {
    (1 to 100) map { case i if i % 15 == 0 => "FizzBuzz"
    case i if i % 5 == 0 => "Buzz"
    case i if i % 3 == 0 => "Fizz"
    case i => i toString
    } mkString ", "
  }

  def computeFizzBuzzWoof(): String = (1 to 100) map intToFizzBuzzWoof mkString ", "

  private def intToFizzBuzzWoof(i: Int) = {
    var res = ""
    val digits = extractDigitsOf(i)

    if (i % 3 == 0) res += "Fizz"
    res += "Fizz" * digits.count(_ == 3)

    if (i % 5 == 0) res += "Buzz"
    res += "Buzz" * digits.count(_ == 5)

    if (i % 7 == 0) res += "Woof"
    res += "Woof" * digits.count(_ == 7)

    if (res.isEmpty) res = i.toString

    res
  }

  private def /%(numerator: Int, divider: Int) = (numerator / divider, numerator % divider)

  // Non-recursive method; be aware of stack overflow...
  private def extractDigitsOf(i: Int): List[Int] = /%(i, 10) match {
    case (0, remainder) => remainder :: Nil
    case (divisor, remainder) => remainder :: extractDigitsOf(divisor)
  }

}
