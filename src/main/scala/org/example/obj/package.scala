package org.example

import java.time.LocalTime

/**
 * 包对象
 *
 * 定义当前包共享的属性和方法
 */
package object obj {
  val time: LocalTime = LocalTime.now()
}
