package org.example

package object generic {
  // 泛型 Generic
  class MyList[T]


  // 协变 Covariance 如果A是T的子类，则MyList[A]是MyList[T]的子类
  class MyList1[+T]

  // 逆变 Contravariance 如果A是T的父类，则MyList[A]是MyList[T]的父类
  class MyList2[-T]

  // 不变 Invariance 默认情况下，泛型既不是协变，也不是逆变
  class MyList3[T]


  // 上边界 Upper Type Bounds T必须是String的子类
  def function1[T <: String](t: T): Unit = println(t)

  // 下边界 Lower Type Bounds T必须是String的父类
  def function2[T >: String](i: String): T = i
}
