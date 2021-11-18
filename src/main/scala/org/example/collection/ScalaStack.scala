package org.example.collection

import scala.collection.mutable

object ScalaStack {
  def main(args: Array[String]): Unit = {
    val stack = new mutable.Stack[Int]()
    stack.push(2, 1, 3)
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
  }
}
