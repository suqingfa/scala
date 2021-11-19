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

    val (x, y) = (1, 2)
    println(s"($x, $y)")

    for ((x, y) <- Seq((1, 'a'), (2, 'b'), (3, 'c'))) {
      println(s"for($x, $y)")
    }
  }
}
