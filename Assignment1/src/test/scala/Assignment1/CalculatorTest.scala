package Assignment1

import org._
import org.scalatest.funsuite.AnyFunSuite

class CalculatorTest extends AnyFunSuite {
  val obj = new Calculator()
  test("BasicTest") {
    assert(obj.add(2,3)===5)
  }
  test("Add0") {
    assert(obj.add(0,0) === 0)
  }
  test("TestNegative") {
    assert(obj.add(-1, -3) === -4)
  }
  test("BasicTestSubtraction") {
    assert(obj.subtract(3, 2) === 1)
  }
  test("Sub0") {
    assert(obj.subtract(8, 0) === 8)
  }
  test("TestNegativeSubtraction") {
    assert(obj.subtract(-1, -3) === 2)
  }

  test("BasicTestMultiplication") {
    assert(obj.multiply(3, 8) === 24)
  }
  test("Mul0") {
    assert(obj.multiply(8, 0) === 0)
  }
  test("TestNegativeMultiplication") {
    assert(obj.multiply(-4,-5) === 20)
  }
  test("BasicTestDivision") {
    assert(obj.divide(36,12) === 3)
  }
  test("Div0") {
    assert(obj.divide(0,9) === 0)
  }
  test("TestNegativeDivision") {
    assert(obj.divide(-45, -5) === 9)
  }

  test("Divisionby0")
  {
    assertThrows[ArithmeticException]{
      obj.divide(6,0)
    }
  }
}




