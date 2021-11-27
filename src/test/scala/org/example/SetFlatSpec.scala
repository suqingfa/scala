package org.example

import org.scalatest.flatspec.AnyFlatSpec

class SetFlatSpec extends AnyFlatSpec {

  "An empty Set" should "is empty" in {
    info("test Set.empty.isEmpty")
    assert(Set.empty.isEmpty)
  }

  it should "produce NoSuchElementException when head is invoked" in {
    assertThrows[NoSuchElementException] {
      info("test Set.empty.head")
      Set.empty.head
    }
  }
}