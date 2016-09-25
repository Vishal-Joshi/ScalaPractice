object session {
  def factorial(n: Int): Int = {
    if (n == 0) 1
    else
      n * factorial(n - 1)
  }

  factorial(2)
  factorial(4)

  def factorialWithTailRecursion(n: Int) = {
    def loop(accumulator: Int, n: Int): Int = {
      if (n == 0) accumulator
      else
        loop(accumulator * n, n - 1)
    }

    loop(1, n)

  }

  factorialWithTailRecursion(4)
  factorialWithTailRecursion(2)
}