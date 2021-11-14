package org.example.function

object ScalaFunctionSimplify {
  /**
   * Scala函数简化
   * <li> return省略，最后一行代码作为返回值
   * <li> 函数只有一行时，可以省略大括号
   * <li> 返回类型可推断时，可以省略。如果有return，不能省略返回类型
   * <li> 返回类型为Unit时，即使有return返回值，函数也不返回值
   * <li> 如果函数无返回类型，可以省略等号
   * <li> 函数无参数，申明了参数列表，调用时可以加括号，也可以不加
   * <li> 函数无参数，申明时不加括号，调用时也不能加括号
   */
  def function(): Unit = ()
}
