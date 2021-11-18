package org.example.obj

import scala.beans.BeanProperty

class User(
            // @BeanProperty 生成 getter 和 setter
            @BeanProperty
            id: Int,
            var username: String,
            val password: String,
          ) {
  // 主构造器
  // 主构造器参数无修饰符时，为局部变量，只能在类中访问
  // 主构造器参数使用 var 修饰符时，为类属性，可以在外部访问，可以修改值
  // 主构造器参数使用 val 修饰符时，为类属性，可以在外部访问，不可以修改值

  // 辅助构造器
  def this(username: String, password: String) = this(0, username, password)

  // 私有属性
  private var _security: String = _

  // getter
  def security: String = _security

  // setter
  def security_=(newValue: String): Unit = _security = newValue
}
