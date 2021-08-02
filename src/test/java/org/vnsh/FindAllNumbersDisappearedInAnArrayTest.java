package org.vnsh;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindAllNumbersDisappearedInAnArrayTest {
  private final FindAllNumbersDisappearedInAnArray classUnderTest = new FindAllNumbersDisappearedInAnArray();

  @Test
  void oneNumber() {
    int[] nums1 = {1};
    Assertions.assertEquals(List.of(), classUnderTest.findDisappearedNumbers(nums1));
  }

  @Test
  void sameNumber() {
    int[] nums1 = {1, 1, 1};
    Assertions.assertEquals(List.of(2, 3), classUnderTest.findDisappearedNumbers(nums1));
  }

  @Test
  void randomNumber() {
    int[] nums1 = {4,3,2,7,8,2,3,1};
    Assertions.assertEquals(List.of(5, 6), classUnderTest.findDisappearedNumbers(nums1));
  }

}