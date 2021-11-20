package org.example.slick

import slick.jdbc.MySQLProfile.api._

import scala.concurrent.Await
import scala.concurrent.duration.DurationInt
import scala.language.postfixOps

object ScalaSlickSql extends App {
  var database = Database.forConfig("mysql_db")

  // select
  Await.result(database.run(sql"select * from user where id = 0".as[(Int, String, String)]), 10 second).foreach(println)

  // delete
  val ids = Seq(0).mkString(",")
  Await.result(database.run(sqlu"delete from user where id in (#$ids)"), 10 second)

  // update
  Await.result(database.run(sqlu"update user set username = 'aaa' where id = 0"), 10 second)

  // insert
  val (id, username, password) = (0, "username", "password")
  Await.result(database.run(sqlu"insert into user(id, username, password) value ($id, $username, $password)"), 10 second)
}
