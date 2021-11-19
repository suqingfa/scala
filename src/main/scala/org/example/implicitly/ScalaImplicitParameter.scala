package org.example.implicitly

object ScalaImplicitParameter {
  def main(args: Array[String]): Unit = {
    println(implicitly)
    println(implicitly("a"))

    // 定义隐式值
    {
      implicit val s: String = "b"
      println(implicitly)
    }
  }

  /**
   * 调用该方法时，如果没有传入参数，编译器会在当前环境中寻找implicit定义的类型符合的隐式值对象
   *
   * 隐式参数优先于默认参数
   */
  private def implicitly(implicit string: String = "x") = string
}
