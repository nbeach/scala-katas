package com.nicholasbeach.fizzbuzz

import org.scalatest.FunSpec


class FizzBuzzSpec extends FunSpec {

  describe("FizzBuzz") {

    it("returns numbers") {
      assert(FizzBuzz.execute(1) === "1")
    }

  }

}
