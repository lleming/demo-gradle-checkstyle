package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleMultiplierTest {

  Multiplier multiplier = new SimpleMultiplier();

  @Test
  void testMultiplyZero() {
    Assertions.assertAll(
        () -> Assertions.assertEquals(0, multiplier.multiply(0, 12)),
        () -> Assertions.assertEquals(0, multiplier.multiply(12, 0))
    );
  }

  @Test
  void testMultiply() {
    Assertions.assertEquals(8, multiplier.multiply(4, 2));
  }

}