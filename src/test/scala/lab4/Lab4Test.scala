package lab4

import org.scalatest.FunSuite

class Lab4Test extends FunSuite {
    test("Typeclasses.scala ReversableString") {
        val string = "Egor"
        val result = "rogE"
        val reversableString = Typeclasses.testReversableString(string)
        assert(reversableString == result)
    }
    test("Typeclasses.scala SmashInt") {
        val a = 3
        val b = 4
        val result = 7
        val smashInt = Typeclasses.testSmashInt(a, b)
        assert(smashInt == result)
    }
    test("Typeclasses.scala SmashDouble") {
        val a = 3
        val b = 4
        val result = 12
        val smashDouble = Typeclasses.testSmashDouble(a, b)
        assert(smashDouble == result)
    }
    test("Typeclasses.scala SmashString") {
        val a = "Eg"
        val b = "or"
        val result = "Egor"
        val smashString = Typeclasses.testSmashString(a, b)
        assert(smashString == result)
    }
}