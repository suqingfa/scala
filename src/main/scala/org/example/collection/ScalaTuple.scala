package org.example.collection

object ScalaTuple {
  def main(args: Array[String]): Unit = {
    val tuple2 = (1, 2)
    println(tuple2._1)
    println(tuple2._2)
    println(tuple2)
    println(tuple2.swap)

    val tuple3 = (1, "a", true)
    println(tuple3.productElement(1))
    println(tuple3.productElementName(1))
    println(tuple3)
  }
}
