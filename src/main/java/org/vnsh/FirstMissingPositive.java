package org.vnsh;

/**
 * 41. First Missing Positive
 * <p>
 * Hard
 * <p>
 * Given an unsorted integer array nums, find the smallest missing positive integer.
 * You must implement an algorithm that runs in O(n) time and uses constant extra space.
 * <p>
 * Example 1:
 * Input: nums = [1,2,0]
 * Output: 3
 * <p>
 * Example 2:
 * Input: nums = [3,4,-1,1]
 * Output: 2
 * <p>
 * Example 3:
 * Input: nums = [7,8,9,11,12]
 * Output: 1
 */
public class FirstMissingPositive {
  public int firstMissingPositive(int[] nums) {
    int[] tracker = new int[nums.length];
    for (int num : nums) {
      if (num > 0 && num <= tracker.length) {
        tracker[num - 1] = 1;
      }
    }
    for (int i = 0; i < tracker.length; i++) {
      if (tracker[i] == 0) {
        return i + 1;
      }
    }
    return tracker.length + 1;
  }
}
