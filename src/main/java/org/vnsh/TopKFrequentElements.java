package org.vnsh;

import java.util.HashMap;
import java.util.Map;

/**
 * 347. Top K Frequent Elements
 * <p>
 * Medium
 * <p>
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 * <p>
 * Example 1:
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * <p>
 * Example 2:
 * Input: nums = [1], k = 1
 * Output: [1]
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^5
 * k is in the range [1, the number of unique elements in the array].
 * It is guaranteed that the answer is unique.
 */
public class TopKFrequentElements {
  public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> count = new HashMap<>();
    for (int num : nums) {
      if (!count.containsKey(num)) {
        count.put(num, 0);
      }
      count.put(num, count.get(num) + 1);
    }
    int[] topK = new int[k];
    for (int i = 0; i < k; i++) {
      int max = 0, maxNum = 0;
      for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
        if (entry.getValue() > max) {
          maxNum = entry.getKey();
          max = entry.getValue();
        }
      }
      topK[i] = maxNum;
      count.remove(maxNum);
    }
    return topK;
  }
}
