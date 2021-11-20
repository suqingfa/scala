package org.example.slick

import slick.jdbc.MySQLProfile.api._

import scala.concurrent.Await
import scala.concurrent.duration.DurationInt
import scala.language.postfixOps

/**
 * Slick (Scala Language-Integrated Connection Kit)
 */
object ScalaSlick extends App {
  val database = Database.forConfig("mysql_db")
  val timeout = 10 second

  // define table
  class User(tag: Tag) extends Table[(Int, String, String)](tag, "user") {
    def id = column[Int]("id", O.PrimaryKey)

    def username = column[String]("username", O.Unique, O.Length(255))

    def password = column[String]("password")

    override def * = (id, username, password)
  }

  val users = TableQuery[User]

  val setup = DBIO.seq(
    // drop scheme
    users.schema.dropIfExists,
    // create scheme
    users.schema.createIfNotExists,

    // insert
    users += (0, "username", "password"),

    // insert all
    users ++= Seq(
      (1, "username1", "password"),
      (2, "username2", "password"),
      (3, "username3", "password"),
    )
  )

  // run setup
  Await.result(database.run(setup), timeout)

  // select * from user where id = 0
  Await.result(database.run(users.filter(_.id === 0).result), timeout).foreach(println)

  // select username from user
  Await.result(database.run(users.map(_.username).result), timeout).foreach(println)
}
