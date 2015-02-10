package fr.xebia.kata.fizzbuzz.scala

import scala.annotation.tailrec

object FizzBuzz {

  type BiFunctions = List[(Int, List[Int]) => String]

  val has3 = (i: Int, digits: List[Int]) => "Fizz" * digits.count(_ == 3)
  val has5 = (i: Int, digits: List[Int]) => "Buzz" * digits.count(_ == 5)
  val has7 = (i: Int, digits: List[Int]) => "Woof" * digits.count(_ == 7)
  val mod3 = (i: Int, digits: List[Int]) => if (i % 3 == 0) "Fizz" else ""
  val mod5 = (i: Int, digits: List[Int]) => if (i % 5 == 0) "Buzz" else ""
  val mod7 = (i: Int, digits: List[Int]) => if (i % 7 == 0) "Woof" else ""

  def computeFizzBuzz(): String = {
    def intToFizzBuzz(value: Int) = mappingsOf(value)(functions = List(mod3, mod5))
    1 to 100 map intToFizzBuzz mkString ", "
  }

  def computeFizzBuzzWoof(): String = {
    def intToFizzBuzzWoof(value: Int) = mappingsOf(value)(functions = List(mod3, has3, mod5, has5, mod7, has7))
    1 to 100 map intToFizzBuzzWoof mkString ", "
  }

  private def mappingsOf(value: Int)(functions: BiFunctions): String = {

    @tailrec
    def mappingsOf(value: Int, digits: List[Int], functions: BiFunctions, res: List[String]): String = functions match {
      case Nil => res.filterNot(_.isEmpty).mkString
      case f :: tail => mappingsOf(value, digits, tail, res :+ f(value, digits))
    }

    def extractDigitsOf(value: Int): List[Int] = {

      @tailrec
      def extractDigitsOf(value: Int, res: List[Int]): List[Int] = /%(value, 10) match {
        case (0, remainder) => res :+ remainder
        case (quotient, remainder) => extractDigitsOf(quotient, res :+ remainder)
      }

      def /%(numerator: Int, divider: Int) = (numerator / divider, numerator % divider)

      extractDigitsOf(value, List.empty)
    }

    val mappings = mappingsOf(value, extractDigitsOf(value), functions, List.empty)
    if (mappings.isEmpty) value.toString else mappings
  }
}
