package org.example.`var`

object ScalaString {
  def main(args: Array[String]): Unit = {
    val str = "abc"
    val d = 1.23456

    println(str + "def")
    println(str * 5)
    println(s"aaa bbb $str ccc")
    println(f"d = $d%2.2f")
    println(raw"a\tb\n")
    println(
      """
        |select *
        |from user
        |""".stripMargin)
  }
}
