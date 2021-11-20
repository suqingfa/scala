package org.example.slick

import slick.jdbc.MySQLProfile.api._

object ScalaSlickDatabase extends App {
  var database: Database = _

  database = Database.forConfig("mysql_db")

  database = Database.forURL(
    url = "jdbc:mysql://127.0.0.1:3306/slick",
    user = "root",
    password = "root",
  )

  //  database = Database.forDataSource()
  //  Database.forSource()
}
