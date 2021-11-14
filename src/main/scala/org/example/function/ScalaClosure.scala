package org.example.function

object ScalaClosure {
  def main(args: Array[String]): Unit = {
    println(function(10))
  }

  /**
   * 一个函数访问了它外部的局部变量，那么这个函数和它所处的环境称为一个闭包
   */
  def function(i: Int): Int = {
    val j = i + 10

    def closure = () => j + 10

    closure()
  }
}
