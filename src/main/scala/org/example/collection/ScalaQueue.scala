package org.example.collection

import scala.collection.mutable

object ScalaQueue {
  def main(args: Array[String]): Unit = {
    val queue = new mutable.Queue[Int]()
    queue.enqueue(2, 1, 3)
    println(queue.dequeue())
    println(queue.dequeue())
    println(queue.dequeue())
  }
}
