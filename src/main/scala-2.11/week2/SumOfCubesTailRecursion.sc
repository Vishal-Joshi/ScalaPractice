object Session {
  def cube(x: Int) = x * x * x

  def sumOfCubes(f: Int => Int, a: Int, b: Int): Int = {
    if (a > b) 0
    else
      f(a) + sumOfCubes(f, a + 1, b)
  }

  sumOfCubes(cube, 3, 5)


  sumOfCubes(x => x * x * x, 3, 5)

  def sumOfCubesWithTailRecursion(f: Int => Int, a: Int, b: Int): Int = {
    def loop(accumulator: Int, a: Int, b: Int): Int =
      if (a > b) accumulator
      else
        loop(accumulator + f(a), a + 1, b)
    loop(0, a, b)
  }

  sumOfCubesWithTailRecursion(x=> x*x*x, 3, 5)

}