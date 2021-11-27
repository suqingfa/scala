package org.example

import org.scalatest.wordspec.AnyWordSpec

class SetWordSpec extends AnyWordSpec {
  "A Set" when {
    "empty" should {
      "is empty" in {
        info("test Set.empty.isEmpty")
        assert(Set.empty.isEmpty)
      }

      "produce NoSuchElementException when head is invoked" in {
        assertThrows[NoSuchElementException] {
          info("test Set.empty.head")
          Set.empty.head
        }
      }
    }
  }
}