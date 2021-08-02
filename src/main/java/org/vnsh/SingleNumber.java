package org.vnsh;

/**
 * 136. Single Number
 * <p>
 * Easy
 * <p>
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * <p>
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * <p>
 * Example 1:
 * Input: nums = [2,2,1]
 * Output: 1
 * <p>
 * Example 2:
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 * <p>
 * Example 3:
 * Input: nums = [1]
 * Output: 1
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 3 * 104
 * -3 * 104 <= nums[i] <= 3 * 104
 * Each element in the array appears twice except for one element which appears only once.
 */
public class SingleNumber {
  // bitwise XOR of a number with itself is 0
  // a ^ a = 0 and a ^ 0 = a
  public int singleNumber(int[] nums) {
    int a = 0;
    for (int num : nums) {
      a ^= num;
    }
    return a;
  }
}
