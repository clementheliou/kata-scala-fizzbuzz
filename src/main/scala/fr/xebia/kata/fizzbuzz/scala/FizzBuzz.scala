package fr.xebia.kata.fizzbuzz.scala

object FizzBuzz {

  def computeFizzBuzz(): String = {
    (1 to 100) map { case i if i % 15 == 0 => "FizzBuzz"
    case i if i % 5 == 0 => "Buzz"
    case i if i % 3 == 0 => "Fizz"
    case i => i toString
    } mkString ", "
  }

  def computeFizzBuzzWoof(): String = throw new UnsupportedOperationException()
}
