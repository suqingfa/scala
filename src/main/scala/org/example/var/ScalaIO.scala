package org.example.`var`

import java.io.File
import scala.io.{BufferedSource, Source}

object ScalaIO {
  def main(args: Array[String]): Unit = {
    // 从控制台读取一行数据
    //    val str: String = StdIn.readLine()
    // Console.in.readLine()
    //    println(str)

    // 从文件读取数据
    val source: BufferedSource = Source.fromFile(new File("/proc/self/status"))
    source.getLines().foreach(println)
    System.out.println("Hello Scala")
  }
}
