package org.example

import org.scalatest.funsuite.AnyFunSuite

class SetSuite extends AnyFunSuite {

  test("An empty Set should is empty") {
    info("test Set.empty.isEmpty")
    assert(Set.empty.isEmpty)
  }

  test("Invoking head on an empty Set should produce NoSuchElementException") {
    assertThrows[NoSuchElementException] {
      info("test Set.empty.head")
      Set.empty.head
    }
  }
}