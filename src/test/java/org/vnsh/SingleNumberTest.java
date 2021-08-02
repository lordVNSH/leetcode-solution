package org.vnsh;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SingleNumberTest {
  private final SingleNumber classUnderTest = new SingleNumber();

  @Test
  void oneNumber() {
    int[] nums1 = {1};
    Assertions.assertEquals(1, classUnderTest.singleNumber(nums1));
  }

  @Test
  void orderedNumbers() {
    int[] nums1 = {2, 2, 1};
    Assertions.assertEquals(1, classUnderTest.singleNumber(nums1));
  }

  @Test
  void unOrderedNumbers() {
    int[] nums1 = {4, 2, 4, 2, 1};
    Assertions.assertEquals(1, classUnderTest.singleNumber(nums1));
  }

  @Test
  void negativeNumbers() {
    int[] nums1 = {-4, 2, -4, 2, 1};
    Assertions.assertEquals(1, classUnderTest.singleNumber(nums1));
  }
}