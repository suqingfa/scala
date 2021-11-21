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
  case class User(id: Int, username: String, password: String)

  class Users(tag: Tag) extends Table[User](tag, "user") {
    def id = column[Int]("id", O.PrimaryKey)

    def username = column[String]("username", O.Unique, O.Length(255))

    def password = column[String]("password")

    override def * = (id, username, password) <> (User.tupled, User.unapply)
  }

  val users = TableQuery[Users]

  val setup = DBIO.seq(
    // drop scheme
    users.schema.dropIfExists,
    // create scheme
    users.schema.createIfNotExists,

    // insert
    users += User(0, "username", "password"),

    // insert all
    users ++= Seq(
      User(1, "username1", "password"),
      User(2, "username2", "password"),
      User(3, "username3", "password"),
    ),
  )

  // run setup
  Await.result(database.run(setup), timeout)

  // delete from user where id = 4
  Await.result(database.run(users.filter(_.id === 4).delete), timeout)

  // update user set username = 'aaa' where id = 3
  println(users.filter(_.id === 3).map(_.username).update("aaa").statements)
  Await.result(database.run(users.filter(_.id === 3).map(_.username).update("aaa")), timeout)

  // select * from user where id = 0
  Await.result(database.run(users.filter(_.id === 0).result), timeout).foreach(println)

  // select username from user
  Await.result(database.run(users.map(_.username).result), timeout).foreach(println)
}
