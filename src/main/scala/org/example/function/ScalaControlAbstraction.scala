package org.example.function

import java.time.LocalTime

object ScalaControlAbstraction {
  def main(args: Array[String]): Unit = {
    function1(LocalTime.now().getNano())

    function2(LocalTime.now().getNano())
  }

  /**
   * 传值参数
   *
   * 将参数值计算后传递给函数
   */
  def function1(a: Long): Unit = {
    println(a)
    println(a)
  }

  /**
   * 传名参数
   *
   * 将代码块传递给参数，每次使用时都调用代码块生成结果
   */
  def function2(a: => Long): Unit = {
    println(a)
    println(a)
  }
}
