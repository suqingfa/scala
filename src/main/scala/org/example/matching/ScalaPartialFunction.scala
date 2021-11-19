package org.example.matching

object ScalaPartialFunction {
  def main(args: Array[String]): Unit = {
    val positiveAbs: PartialFunction[Int, Int] = {
      case i: Int if i > 0 => i
    }

    val zeroAbs: PartialFunction[Int, Int] = {
      case 0 => 0
    }

    val negativeAbs: PartialFunction[Int, Int] = {
      case i: Int if i < 0 => -i
    }

    val abs = (i: Int) => (positiveAbs orElse zeroAbs orElse negativeAbs) (i)

    println(abs(1))
    println(abs(0))
    println(abs(-1))
  }
}
