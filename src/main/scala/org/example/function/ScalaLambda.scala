package org.example.function

object ScalaLambda {
  val function1: Int => Int = i => i * 10
  val function2: Int => Int = _ * 10

  val function3: (Int, Int) => Int = (x, y) => x + y
  val function4: (Int, Int) => Int = _ + _
}
