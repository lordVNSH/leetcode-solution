package org.vnsh;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class TopKFrequentElementsTest {
  private final TopKFrequentElements classUnderTest = new TopKFrequentElements();

  @Test
  void emptyArray() {
    int[] nums1 = {};
    assertArrayEquals(new int[] {}, classUnderTest.topKFrequent(nums1, 0));
  }

  @Test
  void singleElement() {
    int[] nums1 = {1};
    assertArrayEquals(new int[] {1}, classUnderTest.topKFrequent(nums1, 1));
  }

  @Test
  void onlyOneType() {
    int[] nums1 = {1, 1, 1};
    assertArrayEquals(new int[] {1}, classUnderTest.topKFrequent(nums1, 1));
  }

  @Test
  void sortedArray() {
    int[] nums1 = {1, 1, 1, 2, 2, 3};
    assertArrayEquals(new int[] {1, 2}, classUnderTest.topKFrequent(nums1, 2));
    assertArrayEquals(new int[] {1}, classUnderTest.topKFrequent(nums1, 1));
  }

  @Test
  void random() {
    int[] nums1 = {1, 2, 1, 2, 2, 3};
    assertArrayEquals(new int[] {2, 1}, classUnderTest.topKFrequent(nums1, 2));
  }
}