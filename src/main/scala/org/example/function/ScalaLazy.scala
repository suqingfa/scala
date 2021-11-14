package org.example.function

import java.time.LocalTime

object ScalaLazy {
  def main(args: Array[String]): Unit = {
    /**
     * 懒加载
     *
     * 只有在使用变量时才会真正计算变量的值
     */
    lazy val time = LocalTime.now()
    println(time)
  }
}
