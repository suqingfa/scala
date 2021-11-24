package org.example.slick

import org.slf4j.LoggerFactory
import slick.jdbc.MySQLProfile.api._

import scala.concurrent.Await
import scala.concurrent.duration.DurationInt
import scala.language.postfixOps

/**
 * Slick (Scala Language-Integrated Connection Kit)
 */
object ScalaSlick extends App {
  val log = LoggerFactory.getLogger(this.getClass)
  val database = Database.forConfig("mysql_db")
  val timeout = 10 second

  // define table
  case class User(id: Int, username: String, password: Option[String])

  class Users(tag: Tag) extends Table[User](tag, "user") {
    def id = column[Int]("id", O.PrimaryKey)

    def username = column[String]("username", O.Unique, O.Length(255))

    def password = column[Option[String]]("password", O.Length(255))

    override def * = (id, username, password) <> (User.tupled, User.unapply)
  }

  val users = TableQuery[Users]

  val setup = DBIO.seq(
    // drop scheme
    users.schema.dropIfExists,
    // create scheme
    users.schema.createIfNotExists,

    // insert
    users += User(0, "username", Option("password")),

    // insert all
    users ++= Seq(
      User(1, "username1", None),
      User(2, "username2", None),
      User(3, "username3", None),
      User(4, "username4", None)
    ),
  )

  // run setup
  Await.result(database.run(setup), timeout)

  // select * from user
  log.info("select * from user")
  Await.result(database.run(users.result), timeout).map(_.toString).foreach(log.info)

  // delete from user where id = 4
  log.info("delete from user where id = 4")
  Await.result(database.run(users.filter(_.id === 4).delete), timeout)

  // update user set username = 'aaa' where id = 3
  log.info(s"update user set username = 'aaa' where id = 3 ${users.filter(_.id === 3).map(_.username).update("aaa").statements}")
  Await.result(database.run(users.filter(_.id === 3).map(_.username).update("aaa")), timeout)

  // select * from user where id = 0
  log.info("select * from user where id = 1")
  Await.result(database.run(users.filter(_.id === 1).result), timeout).map(_.toString).foreach(log.info)

  // select username from user
  log.info("select username from user")
  Await.result(database.run(users.map(_.username).result), timeout).foreach(log.info)
}
