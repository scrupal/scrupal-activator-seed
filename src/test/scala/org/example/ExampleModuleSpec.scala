package org.example

import org.specs2.mutable.Specification

/** A Test Specification For The ExampleModule */
class ExampleModuleSpec extends Specification {

  "ExampleModule" should {
    "instantiate without arguments" in {
      val mod = new ExampleModule
      mod.id must beEqualTo('Example)
    }
  }
}
