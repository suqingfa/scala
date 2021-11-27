package org.example

import org.scalatest.freespec.AnyFreeSpec

class SetFreeSpec extends AnyFreeSpec {
  "A Set" - {
    "when empty" - {
      "should is empty" in {
        info("test Set.empty.isEmpty")
        assert(Set.empty.isEmpty)
      }

      "should produce NoSuchElementException when head is invoked" in {
        assertThrows[NoSuchElementException] {
          info("test Set.empty.head")
          Set.empty.head
        }
      }
    }
  }
}