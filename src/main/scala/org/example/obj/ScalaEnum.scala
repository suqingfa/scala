package org.example.obj

object WeekDay extends Enumeration {
  val MON, TUE, WED, THU, FRI, SAT, SUN = Value
}

object ScalaEnumApp {
  def main(args: Array[String]): Unit = {
    WeekDay.values.foreach(println)

    println(WeekDay(0))
    println(WeekDay.withName("MON"))
  }
}