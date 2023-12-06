package org.example;

class SimpleMultiplier implements Multiplier {
  @Override
  public int multiply(int left, int right) {
    return left * right;
  }
}
