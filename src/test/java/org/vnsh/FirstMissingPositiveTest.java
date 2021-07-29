package org.vnsh;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstMissingPositiveTest {
  private final FirstMissingPositive classUnderTest = new FirstMissingPositive();

  @Test
  void consecutivePositiveNumbersArray() {
    int[] nums1 = {0, 1, 2};
    Assertions.assertEquals(3, classUnderTest.firstMissingPositive(nums1));

    int[] nums2 = {1, 2, 3};
    Assertions.assertEquals(4, classUnderTest.firstMissingPositive(nums2));

    int[] nums3 = {2, 3, 4};
    Assertions.assertEquals(1, classUnderTest.firstMissingPositive(nums3));
  }

  @Test
  void nonConsecutiveNumbers() {
    int[] nums1 = {0, -1, 2};
    Assertions.assertEquals(1, classUnderTest.firstMissingPositive(nums1));

    int[] nums2 = {1, 3};
    Assertions.assertEquals(2, classUnderTest.firstMissingPositive(nums2));

    int[] nums3 = {1, 2, 13, 4, 3};
    Assertions.assertEquals(5, classUnderTest.firstMissingPositive(nums3));
  }

  @Test
  void singleNumber() {
    int[] nums1 = {2};
    Assertions.assertEquals(1, classUnderTest.firstMissingPositive(nums1));

    int[] nums2 = {1};
    Assertions.assertEquals(2, classUnderTest.firstMissingPositive(nums2));
  }

  @Test
  void emptyArray() {
    int[] nums1 = {};
    Assertions.assertEquals(1, classUnderTest.firstMissingPositive(nums1));
  }
}
