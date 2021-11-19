package org.example.matching

object ScalaMatching {
  def main(args: Array[String]): Unit = {
    matching(1)
    matching(2)
    matching(3.0)

    matching(Set(1, 2, 3))
    matching(Set("a", "b", "c"))

    matching(Array(1, 2, 3))
    matching(Array("a", "b", "c"))

    matching(Seq(0, 1, 2))
    matching(Seq(0, 1, 2, 3))

    matching(new User(1, "a"))
  }

  private def matching(x: Any): Unit = x match {
    case 1 =>
      println("match value 1")
    case i: Int =>
      println(s"match int $i")
    case d: Double if d > 0 =>
      println(s"positive double $d")

    // 泛型会有类型擦除
    case set: Set[Int] =>
      println(s"int set ${set.mkString(",")}")
    case set: Set[String] =>
      println(s"string set ${set.mkString(",")}")

    case array: Array[Int] =>
      println(s"int array ${array.mkString(",")}")
    case array: Array[String] =>
      println(s"string array ${array.mkString(",")}")

    case Seq(0, i: Int, _) =>
      println(s"seq 0, $i, _")
    case Seq(0, i: Int, _*) =>
      println(s"seq 0, $i, _*")

    case User(id, username) =>
      println(s"user($id, $username)")

    case _ =>
      println("_")
  }

  // case User(id: Int, username: String)
  class User(val id: Int, val username: String)

  object User {
    def unapply(user: User): Option[(Int, String)] = {
      if (user == null)
        None
      else
        Some((user.id, user.username))
    }
  }
}
