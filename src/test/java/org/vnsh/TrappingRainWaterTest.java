package org.vnsh;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TrappingRainWaterTest {
  private final TrappingRainWater classUnderTest = new TrappingRainWater();

  @Test
  void emptyArray() {
    int[] nums1 = {};
    assertEquals(0, classUnderTest.trap(nums1));
  }

  @Test
  void singleElement() {
    int[] nums1 = {3};
    assertEquals(0, classUnderTest.trap(nums1));
  }

  @Test
  void allEqualElements() {
    int[] nums1 = {3, 3, 3, 3, 3, 3};
    assertEquals(0, classUnderTest.trap(nums1));
  }

  @Test
  void singlePeak() {
    int[] nums1 = {3, 3, 3, 8, 3, 3};
    assertEquals(0, classUnderTest.trap(nums1));
  }

  @Test
  void cornerPeaks() {
    int[] nums1 = {10, 3, 3, 3, 3, 10};
    assertEquals(28, classUnderTest.trap(nums1));
  }

  @Test
  void randomArray() {
    int[] nums1 = {4, 2, 0, 3, 2, 5};
    assertEquals(9, classUnderTest.trap(nums1));
  }

  @Test
  void randomArray1() {
    int[] nums1 = {9, 2, 9, 3, 2, 2, 1, 4, 8};
    assertEquals(35, classUnderTest.trap(nums1));
  }

  @Test
  void randomArray2() {
    int[] nums1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    assertEquals(6, classUnderTest.trap(nums1));
  }
}