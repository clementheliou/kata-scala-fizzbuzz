package fr.xebia.kata.fizzbuzz.scala

import fr.xebia.kata.fizzbuzz.scala.FizzBuzz.{computeFizzBuzz, computeFizzBuzzWoof}
import org.scalatest.{FlatSpec, Matchers}

class FizzBuzzSpec extends FlatSpec with Matchers {

  "FizzBuzz" should "compute FizzBuzz variant" in {
    computeFizzBuzz shouldEqual "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, 17, " +
      "Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, FizzBuzz, 31, 32, Fizz, 34, Buzz, Fizz, 37, 38, " +
      "Fizz, Buzz, 41, Fizz, 43, 44, FizzBuzz, 46, 47, Fizz, 49, Buzz, Fizz, 52, 53, Fizz, Buzz, 56, Fizz, 58, 59, " +
      "FizzBuzz, 61, 62, Fizz, 64, Buzz, Fizz, 67, 68, Fizz, Buzz, 71, Fizz, 73, 74, FizzBuzz, 76, 77, Fizz, 79, " +
      "Buzz, Fizz, 82, 83, Fizz, Buzz, 86, Fizz, 88, 89, FizzBuzz, 91, 92, Fizz, 94, Buzz, Fizz, 97, 98, Fizz, Buzz"
  }

  it should "compute FizzBuzzWoof variant" in {
    computeFizzBuzzWoof shouldEqual "1, 2, FizzFizz, 4, BuzzBuzz, Fizz, WoofWoof, 8, Fizz, Buzz, 11, Fizz, Fizz, " +
      "Woof, FizzBuzzBuzz, 16, Woof, Fizz, 19, Buzz, FizzWoof, 22, Fizz, Fizz, BuzzBuzz, 26, FizzWoof, Woof, 29," +
      " FizzFizzBuzz, Fizz, Fizz, FizzFizzFizz, Fizz, FizzBuzzBuzzWoof, FizzFizz, FizzWoof, Fizz, FizzFizz, Buzz, 41," +
      " FizzWoof, Fizz, 44, FizzBuzzBuzz, 46, Woof, Fizz, Woof, BuzzBuzz, FizzBuzz, Buzz, FizzBuzz, FizzBuzz, " +
      "BuzzBuzzBuzz, BuzzWoof, FizzBuzzWoof, Buzz, Buzz, FizzBuzz, 61, 62, FizzFizzWoof, 64, BuzzBuzz, Fizz, Woof, " +
      "68, Fizz, BuzzWoofWoof, Woof, FizzWoof, FizzWoof, Woof, FizzBuzzBuzzWoof, Woof, WoofWoofWoof, FizzWoof, Woof, " +
      "Buzz, Fizz, 82, Fizz, FizzWoof, BuzzBuzz, 86, FizzWoof, 88, 89, FizzBuzz, Woof, 92, FizzFizz, 94, BuzzBuzz, " +
      "Fizz, Woof, Woof, Fizz, Buzz"
  }
}
