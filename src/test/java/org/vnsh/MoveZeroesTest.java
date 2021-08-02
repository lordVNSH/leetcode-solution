package org.vnsh;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoveZeroesTest {

  private final MoveZeroes classUnderTest = new MoveZeroes();

  @Test
  void oneNumber() {
    int[] nums1 = {1};
    int[] expectedNums1 = {1};
    classUnderTest.moveZeroes(nums1);
    Assertions.assertArrayEquals(expectedNums1, nums1);

    int[] nums2 = {0};
    int[] expectedNums2 = {0};
    classUnderTest.moveZeroes(nums2);
    Assertions.assertArrayEquals(expectedNums2, nums2);
  }

  @Test
  void continuousZeroes() {
    int[] nums1 = {0, 0, 1};
    int[] expectedNums1 = {1, 0, 0};
    classUnderTest.moveZeroes(nums1);
    Assertions.assertArrayEquals(expectedNums1, nums1);

    int[] nums2 = {1, 0, 0};
    int[] expectedNums2 = {1, 0, 0};
    classUnderTest.moveZeroes(nums2);
    Assertions.assertArrayEquals(expectedNums2, nums2);

    int[] nums3 = {1, 0, 0, 10};
    int[] expectedNums3 = {1, 10, 0, 0};
    classUnderTest.moveZeroes(nums3);
    Assertions.assertArrayEquals(expectedNums3, nums3);
  }

  @Test
  void randomZeroes() {
    int[] nums1 = {0, 1, 1};
    int[] expectedNums1 = {1, 1, 0};
    classUnderTest.moveZeroes(nums1);
    Assertions.assertArrayEquals(expectedNums1, nums1);

    int[] nums2 = {1, 0, 10, 12, 0, 3, 0, 41};
    int[] expectedNums2 = {1, 10, 12, 3, 41, 0, 0, 0};
    classUnderTest.moveZeroes(nums2);
    Assertions.assertArrayEquals(expectedNums2, nums2);
  }

  @Test
  void withNegativeNumbers() {
    int[] nums1 = {0, -1, 1};
    int[] expectedNums1 = {-1, 1, 0};
    classUnderTest.moveZeroes(nums1);
    Assertions.assertArrayEquals(expectedNums1, nums1);

    int[] nums2 = {1, 0, -10, 12, 0, -3, 0, 41};
    int[] expectedNums2 = {1, -10, 12, -3, 41, 0, 0, 0};
    classUnderTest.moveZeroes(nums2);
    Assertions.assertArrayEquals(expectedNums2, nums2);
  }

}