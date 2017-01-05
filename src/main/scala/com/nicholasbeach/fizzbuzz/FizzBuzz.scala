package com.nicholasbeach.fizzbuzz

object FizzBuzz {

  def execute(numbers: List[Int]): List[String] = {
    numbers.map(n => {
      val isDivisibleBy3 = n % 3 == 0
      val isDivisibleBy5 = n % 5 == 0
      val isDivisibleBy3And5 = isDivisibleBy3 && isDivisibleBy5

      if(isDivisibleBy3And5)  "fizzbuzz"
      else if(isDivisibleBy3) "fizz"
      else if(isDivisibleBy5) "buzz"
      else                    n.toString
    })
  }

}
