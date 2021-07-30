package org.vnsh;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClimbingStairsTest {
  private final ClimbingStairs classUnderTest = new ClimbingStairs();

  @Test
  void simpleCase() {
    int num = 2;
    Assertions.assertEquals(2, classUnderTest.climbStairs(num));
  }

  @Test
  void simpleCase1() {
    int num = 3;
    Assertions.assertEquals(3, classUnderTest.climbStairs(num));
  }

  @Test
  void simpleCase2() {
    int num = 6;
    Assertions.assertEquals(13, classUnderTest.climbStairs(num));
  }

  @Test
  void cornerCase() {
    int num = 1;
    Assertions.assertEquals(1, classUnderTest.climbStairs(num));
  }

  @Test
  void largeCase() {
    int num = 45;
    Assertions.assertEquals(1836311903, classUnderTest.climbStairs(num));
  }
}