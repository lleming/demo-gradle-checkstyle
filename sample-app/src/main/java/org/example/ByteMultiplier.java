package org.example;

class ByteMultiplier implements Multiplier {
  @Override
  public int multiply(int left, int right) {
    return (int) multiply(tobyte(left), tobyte(right));
  }

  public long multiply(byte left, byte right) {
    return (long) left * right;
  }

  private byte tobyte(int value) {
    if (value > -128 && value < 127) {
      return (byte) value;
    }
    throw new IllegalArgumentException("Expected value between -128 and 128 but received " + value);
  }
}
