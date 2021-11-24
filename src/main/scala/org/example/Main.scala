package org.example

object Main extends App {
  val a = Rational(2, 3)
  val b = Rational(4, 5)
  val Rational(x, y) = a

  println(s"a = $a")
  println(s"b = $b")
  println(s"-a = ${-a}")
  println(s"a + b = ${a + b}")
  println(s"a - b = ${a - b}")
  println(s"a * b = ${a * b}")
  println(s"a / b = ${a / b}")
  println(s"a + 1 = ${a + 1}")
  println(s"1 + b = ${1 + b}")
}