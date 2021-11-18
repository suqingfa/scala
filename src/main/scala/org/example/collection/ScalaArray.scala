package org.example.collection

import scala.collection.mutable.ArrayBuffer

object ScalaArray {
  def main(args: Array[String]): Unit = {
    // Array 容量不可变的数组
    val array = new Array[Int](5)
    array(0) = 1
    println(array(0))
    println((array :+ 5).mkString(","))
    println((5 +: array).mkString(","))
    println((array ++ array).mkString(","))
    println(array.mkString(","))

    // 容量可变的数组
    val arrayBuffer = new ArrayBuffer[Int]()
    arrayBuffer += 10
    arrayBuffer += 20
    arrayBuffer ++= array
    arrayBuffer -= 0
    println(arrayBuffer(0))
    println(arrayBuffer)

    // 相互转换
    array.toBuffer
    arrayBuffer.toArray

    // 多维数组
    Array.ofDim[Int](2, 3)
  }
}
