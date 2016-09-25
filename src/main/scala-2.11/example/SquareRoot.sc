object Session {
  val a = 1

  def abs(x: Double) = if (x < 0) -x else x

  abs(10)
  abs(-10)

  def sqrIter(x: Double, guess: Double): Double =
    if (isGoodEnough(x, guess)) {
      guess
    }
    else
      sqrIter(x, improve(x, guess))

  def isGoodEnough(x: Double, guess: Double) ={
    val absoluteValue: Double = abs(guess * guess - x)
    absoluteValue/x < 0.001
  }

  def improve(x: Double, guess: Double) =
    (guess + x / guess) / 2

  def sqrt(x: Double) =
    sqrIter(x, 1)


  sqrt(1e60)
}