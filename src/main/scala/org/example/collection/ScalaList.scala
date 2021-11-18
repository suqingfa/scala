package org.example.collection

import scala.collection.mutable.ListBuffer

object ScalaList {
  def main(args: Array[String]): Unit = {
    // 不可变List
    var list = List(1, 2, 3, 4)
    println(list(1))

    list = 1 :: 2 :: 3 :: 4 :: Nil
    println(list)
    println(list ::: list)

    // 可变List
    val listBuffer = new ListBuffer[Int]
    listBuffer += 1
    2 +=: listBuffer
    println(listBuffer)
  }
}
