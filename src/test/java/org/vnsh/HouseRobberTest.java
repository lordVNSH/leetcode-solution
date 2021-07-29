package org.vnsh;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HouseRobberTest {
  private final HouseRobber classUnderTest = new HouseRobber();

  @Test
  void noHouses() {
    int[] nums1 = {};
    Assertions.assertEquals(0, classUnderTest.rob(nums1));
  }

  @Test
  void oneHouse() {
    int[] nums1 = {10};
    Assertions.assertEquals(10, classUnderTest.rob(nums1));
  }

  @Test
  void oddSetOfHouses() {
    int[] nums1 = {10, 1, 2};
    Assertions.assertEquals(12, classUnderTest.rob(nums1));

    int[] nums2 = {1, 10, 2};
    Assertions.assertEquals(10, classUnderTest.rob(nums2));
  }

  @Test
  void evenSetOfHouses() {
    int[] nums1 = {10, 1};
    Assertions.assertEquals(10, classUnderTest.rob(nums1));

    int[] nums2 = {1, 10, 12, 2};
    Assertions.assertEquals(13, classUnderTest.rob(nums2));

    int[] nums3 = {10, 20, 12, 12};
    Assertions.assertEquals(32, classUnderTest.rob(nums3));
  }

  @Test
  void nonAlternativeHouses() {
    int[] nums1 = {2, 1, 1, 2};
    Assertions.assertEquals(4, classUnderTest.rob(nums1));

    int[] nums2 = {2, 1, 1, 3, 1};
    Assertions.assertEquals(5, classUnderTest.rob(nums2));
  }
}