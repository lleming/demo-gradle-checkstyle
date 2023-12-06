package org.example;

public interface Multiplier {

  int multiply(int left, int right);

  static Multiplier simple() {
    return new SimpleMultiplier();
  }
}
