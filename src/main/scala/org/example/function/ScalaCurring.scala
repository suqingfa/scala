package org.example.function

object ScalaCurring {
  def main(args: Array[String]): Unit = {
    println(curringFunction(1)(2)(3))
  }

  /**
   * 柯里化函数
   */
  def curringFunction(x: Int)(y: Int)(z: Int): Int = x + y + z
}
