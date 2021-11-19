package org.example.exception

object ScalaException {
  def main(args: Array[String]): Unit = {
    try {
      function(10)
      function(-10)
    } catch {
      case throwable: Throwable =>
        println(s"throwable $throwable")
    } finally {
      println("finally")
    }
  }

  @throws[Throwable]("if i is negative")
  def function(i: Int): Unit = {
    if (i < 0)
      throw new Throwable("i is negative")

    println(s"$i")
  }
}
