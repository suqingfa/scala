package org.example.collection

object ScalaCollectionOps {
  def main(args: Array[String]): Unit = {
    // 集合基本操作
    val list = List(1, 2, 3, 4, 5, 6, 7, 8)
    println(s"list size ${list.size}")

    println("for (i <- list)")
    for (i <- list)
      println(i)

    println("list.foreach(println)")
    list.foreach(println)

    println("iterator")
    println(list.iterator)

    println(list.mkString("List(", ",", ")"))

    println(s"list contains 3: ${list.contains(3)}")

    // 衍生操作

    println(s"list head : ${list.head}")
    // 去除头元素剩余的部分
    println(s"list end : ${list.tail}")
    println(s"list last : ${list.last}")
    // 除去最后一个元素的剩余部分
    println(s"list init : ${list.init}")

    // 前(后)n个元素
    println(s"list take : ${list.take(2)}")
    println(s"list take right : ${list.takeRight(2)}")
    // 去掉前(后)n个的元素后的集合
    println(s"list drop : ${list.drop(2)}")
    println(s"list drop right : ${list.dropRight(2)}")

    println(s"list reverse : ${list.reverse}")

    // 并交差 zip 滑窗
    val list1 = List(1, 2, 3)
    val list2 = List(2, 3, 4)
    println(s"list concat : ${list1 concat list2}")
    println(s"list intersect : ${list1 intersect list2}")
    println(s"list diff : ${list1 diff list2}")
    println(s"list zip : ${list1 zip list2}")
    println(s"list sliding : ${list.sliding(2).mkString(",")}")
    println(s"list sliding with step : ${list.sliding(3, 2).mkString(",")}")

    // 简单计算函数
    println(s"list sum : ${list.sum}")
    println(s"list product : ${list.product}")
    println(s"list max : ${list.max}")
    println(s"list min : ${list.min}")

    // sort
    println(s"list sorted : ${list.sorted}")
    println(s"list sort by : ${list.sortBy(-_)}")
    println(s"list sort with : ${list.sortWith(_ < _)}")

    // filter
    println(s"list filter : ${list.filter(_ > 4)}")
    println(s"list filter not : ${list.filterNot(_ > 4)}")

    // map
    println(s"list map : ${list.map(_.toBinaryString)}")

    // group
    println(s"list grouped : ${list.grouped(2).mkString(",")}")
    println(s"list group by : ${list.groupBy(_ > 4)}")
    println(s"list group map : ${list.groupMap(_ > 4)(_ * 2)}")

    // flat
    println(s"list flat : ${List(List(1, 2, 3), List(2, 3, 4)).flatten}")
    println(s"list flat map : ${list.flatMap(_.toBinaryString.toList)}")

    // reduce
    println(s"list reduce : ${list.reduce(_ - _)}") // 1 - 2 - 3 - 4 + ...
    println(s"list reduce left : ${list.reduceLeft(_ - _)}") // 1 - 2 - 3 - 4 + ...
    println(s"list reduce right : ${list.reduceRight(_ - _)}") // 1 - (2 - (3 - (4 ...)))

    // fold
    println(s"list fold : ${list.fold(-1)(_ - _)}") // -1 - 1 - 2 - 3 + ...
    println(s"list fold left : ${list.foldLeft("z")(_ + _)}") // "" + 1 + 2 + 3 + ...
    println(s"list fold right : ${list.foldRight("z")(_ + _)}") // 1 + 2 + 3 + ... + ""
  }
}
