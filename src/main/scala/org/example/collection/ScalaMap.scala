package org.example.collection

import scala.collection.mutable

object ScalaMap {
  def main(args: Array[String]): Unit = {
    // 不可变Map
    val map = Map(1 -> "a", 2 -> "b")
    println(map)
    println(map.keys)
    println(map.values)

    println(map(1))
    val mapWithDefaultValue = map.withDefaultValue(null)
    println(mapWithDefaultValue(2))
    println(mapWithDefaultValue(3))

    // 可变Map
    val mutableMap = mutable.Map(1 -> "a", 2 -> "b")
    mutableMap(2) = "bbb"
    mutableMap += 3 -> "c"
    println(mutableMap)
    mutableMap -= 3
    println(mutableMap)
  }
}
