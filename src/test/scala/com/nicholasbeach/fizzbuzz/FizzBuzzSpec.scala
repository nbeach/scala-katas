package com.nicholasbeach.fizzbuzz

import org.scalatest.FunSpec

class FizzBuzzSpec extends FunSpec {

  describe("FizzBuzz") {
    it("when numbers are given returns numbers") {
      assert(FizzBuzz.execute(List(1, 4)) === List("1", "4"))
    }

    it("when multiples of 3 are given returns fizz") {
      assert(FizzBuzz.execute(List(3, 9)) === List("fizz", "fizz"))
    }

    it("when multiples of 5 are given returns buzz") {
      assert(FizzBuzz.execute(List(10, 25)) === List("buzz", "buzz"))
    }

    it("when multiple of 3 and 5 are given returns fizzbuzz") {
      assert(FizzBuzz.execute(List(15, 30)) === List("fizzbuzz", "fizzbuzz"))
    }

    it("when values of mixed divisibility are given returns results in order matching the input") {
      assert(FizzBuzz.execute(List(1, 3, 10, 15)) === List("1", "fizz", "buzz", "fizzbuzz"))
    }

 }

}
