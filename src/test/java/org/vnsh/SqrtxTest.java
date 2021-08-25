package org.vnsh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SqrtxTest {
  Sqrtx classUnderTest = new Sqrtx();

  @Test
  void zero() {
    assertEquals(0, classUnderTest.mySqrt(0));
  }

  @Test
  void one() {
    assertEquals(1, classUnderTest.mySqrt(1));
  }

  @Test
  void two() {
    assertEquals(1, classUnderTest.mySqrt(2));
  }

  @Test
  void four() {
    assertEquals(2, classUnderTest.mySqrt(4));
  }

  @Test
  void eight() {
    assertEquals(2, classUnderTest.mySqrt(8));
  }

  @Test
  void negativeOne() {
    assertEquals(-1, classUnderTest.mySqrt(-1));
  }
}