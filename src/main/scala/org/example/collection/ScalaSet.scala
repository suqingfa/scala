package org.example.collection

import scala.collection.mutable

object ScalaSet {
  def main(args: Array[String]): Unit = {
    // 不可变Set
    val set = Set(1, 2, 3, 4)
    println(set)

    // 可变Set
    val mutableSet = mutable.Set(1, 2, 3)
    println(mutableSet)
  }
}
