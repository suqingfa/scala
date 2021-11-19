package org.example.implicitly

import scala.language.implicitConversions

object ScalaImplicitFunction {
  def main(args: Array[String]): Unit = {
    val s: String = 10
    println(s)
    println(10.charAt(0))
  }

  /**
   * 隐式函数 实现将Int类型转换成String类型
   *
   * 当Int类型调用String类型的方法时，编译器会在当前环境中调用intConvertToBinaryString将Int类型转换为String类型
   */
  private implicit def intConvertToBinaryString(i: Int): String = java.lang.Integer.toBinaryString(i)
}
