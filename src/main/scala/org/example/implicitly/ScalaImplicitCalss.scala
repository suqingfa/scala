package org.example.implicitly

object ScalaImplicitCalss {
  def main(args: Array[String]): Unit = {
    val i = 10
    println(i X 5)
  }

  /**
   * 隐式类, 主构造函数作为隐式函数
   *
   * 主构造函数只能有一个参数,隐式类只能定义在class/object/package class中
   */
  implicit class MyRichInt(self: Int) {
    def X(other: Int): Int = self * other
  }
}
