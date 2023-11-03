package Assignment1

import org._
import org.scalatest.funsuite.AnyFunSuite

class CalculatorTest extends AnyFunSuite {
  test("BasicTest") {
    val obj = new Calculator();
    assert(obj.add(2,3)===5)
  }
  test("Add0") {
    val obj = new Calculator();
    assert(obj.add(0,0) === 0)
  }
  test("TestNegative") {
    val obj = new Calculator();
    assert(obj.add(-1, -3) === -4)
  }
  test("BasicTestSubtraction") {
    val obj = new Calculator();
    assert(obj.subtract(3, 2) === 1)
  }
  test("Sub0") {
    val obj = new Calculator();
    assert(obj.subtract(8, 0) === 8)
  }
  test("TestNegativeSubtraction") {
    val obj = new Calculator();
    assert(obj.subtract(-1, -3) === 2)
  }

  test("BasicTestMultiplication") {
    val obj = new Calculator();
    assert(obj.multiply(3, 8) === 24)
  }
  test("Mul0") {
    val obj = new Calculator();
    assert(obj.multiply(8, 0) === 0)
  }
  test("TestNegativeMultiplication") {
    val obj = new Calculator();
    assert(obj.multiply(-4,-5) === 20)
  }
  test("BasicTestDivision") {
    val obj = new Calculator();
    assert(obj.divide(36,12) === 3)
  }
  test("Div0") {
    val obj = new Calculator();
    assert(obj.divide(0,9) === 0)
  }
  test("TestNegativeDivision") {
    val obj = new Calculator();
    assert(obj.divide(-45, -5) === 9)
  }

}




