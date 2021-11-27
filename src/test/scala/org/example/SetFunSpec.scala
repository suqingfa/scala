package org.example

import org.scalatest.funspec.AnyFunSpec

class SetFunSpec extends AnyFunSpec {

  describe("A Set") {
    describe("when empty") {
      it("should is empty") {
        info("test Set.empty.isEmpty")
        assert(Set.empty.isEmpty)
      }

      it("should produce NoSuchElementException when head is invoked") {
        assertThrows[NoSuchElementException] {
          info("test Set.empty.head")
          Set.empty.head
        }
      }
    }
  }
}