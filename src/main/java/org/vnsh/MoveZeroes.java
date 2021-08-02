package org.vnsh;

/**
 * 283. Move Zeroes
 * <p>
 * Easy
 * <p>
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p>
 * Note that you must do this in-place without making a copy of the array.
 * <p>
 * Example 1:
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * <p>
 * Example 2:
 * Input: nums = [0]
 * Output: [0]
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^4
 * <p>
 * -2^31 <= nums[i] <= 2^31 - 1
 */
public class MoveZeroes {
  public void moveZeroes(int[] nums) {
    int zeroIndex, nonZeroIndex, tmp;
    for (int i = 0; i < nums.length; i++) {
      zeroIndex = findNextZeroIndex(i, nums);
      nonZeroIndex = findNextNonZeroIndex(zeroIndex, nums);
      i = zeroIndex;
      if (zeroIndex < nums.length && nonZeroIndex < nums.length) {
        tmp = nums[nonZeroIndex];
        nums[nonZeroIndex] = nums[zeroIndex];
        nums[zeroIndex] = tmp;
      }
    }
  }

  private int findNextZeroIndex(int i, int[] nums) {
    for (int j = i; j < nums.length; j++) {
      if (nums[j] == 0) {
        return j;
      }
    }
    return nums.length;
  }

  private int findNextNonZeroIndex(int i, int[] nums) {
    for (int j = i; j < nums.length; j++) {
      if (nums[j] != 0) {
        return j;
      }
    }
    return nums.length;
  }
}
