package example

class Lists$Test extends org.scalatest.FunSuite {

  import Lists._

  test("sum should sum all values in a list") {
    assert(sum(List(1,2,3))===6)
  }

  test("max should find max element from the list") {
    assert(max(List(1,2,3))===3)
  }
}
