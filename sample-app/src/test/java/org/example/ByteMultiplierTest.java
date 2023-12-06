package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ByteMultiplierTest {

  ByteMultiplier multiplier = new ByteMultiplier();

  @Test
  void testMultiplyZero() {
    Assertions.assertAll(
        () -> Assertions.assertEquals(0, multiplier.multiply(7, 0)),
        () -> Assertions.assertEquals(0, multiplier.multiply(0, 7))
    );
  }

  @Test
  void testMultiplyOutOfRangeValue() {
    Assertions.assertAll(
        () -> Assertions.assertThrows(IllegalArgumentException.class, () -> multiplier.multiply(7, 456)),
        () -> Assertions.assertThrows(IllegalArgumentException.class, () -> multiplier.multiply(857, 7))
    );
  }

  @Test
  void testMultiplyCorrectness() {
    Assertions.assertEquals(1024, multiplier.multiply(32, 32));
  }
}