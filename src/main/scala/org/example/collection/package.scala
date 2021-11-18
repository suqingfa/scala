package org.example

import scala.collection.mutable

/**
 * Scala集合三大类 Seq、Set、Map，都扩展自 Iterable
 *
 * 几乎所有集合都提供了可变和不可变版本,
 * scala.collection.immutable
 * scala.collection.mutable
 */
package object collection {
  val seq: Seq[Int] = Seq(1, 2, 3)
  val set: Set[Int] = Set(1, 2, 3)
  val map: Map[String, Int] = Map("a" -> 1, "b" -> 2)

  val mutableSed: mutable.Seq[Int] = mutable.Seq(1, 2, 3)
  val mutableSet: mutable.Set[Int] = mutable.Set(1, 2, 3)
  val mutableMap: mutable.Map[String, Int] = mutable.Map("a" -> 1, "b" -> 2)
}
