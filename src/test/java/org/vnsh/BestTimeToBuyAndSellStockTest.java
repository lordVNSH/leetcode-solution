package org.vnsh;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStockTest {
  private final BestTimeToBuyAndSellStock classUnderTest = new BestTimeToBuyAndSellStock();

  @Test
  void noStocks() {
    int[] nums1 = {};
    assertEquals(0, classUnderTest.maxProfit(nums1));
  }

  @Test
  void oneStockPrice() {
    int[] nums1 = {12};
    assertEquals(0, classUnderTest.maxProfit(nums1));
  }

  @Test
  void twoStockPrices() {
    int[] nums1 = {10, 12};
    assertEquals(2, classUnderTest.maxProfit(nums1));

    int[] nums2 = {13, 12};
    assertEquals(0, classUnderTest.maxProfit(nums2));
  }

  @Test
  void manyStockPrices() {
    int[] nums1 = {7, 1, 5, 3, 6, 4};
    assertEquals(5, classUnderTest.maxProfit(nums1));

    int[] nums2 = {7, 6, 4, 3, 1};
    assertEquals(0, classUnderTest.maxProfit(nums2));
  }
}