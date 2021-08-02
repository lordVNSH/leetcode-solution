package org.vnsh;

import java.util.ArrayList;
import java.util.List;

/**
 * 448. Find All Numbers Disappeared in an Array
 * <p>
 * Easy
 * <p>
 * Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
 * <p>
 * Example 1:
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [5,6]
 * <p>
 * Example 2:
 * Input: nums = [1,1]
 * Output: [2]
 * <p>
 * Constraints:
 * <p>
 * n == nums.length
 * 1 <= n <= 10^5
 * 1 <= nums[i] <= n
 */
public class FindAllNumbersDisappearedInAnArray {
  public List<Integer> findDisappearedNumbers(int[] nums) {
    for (int num : nums) {
      int index = Math.abs(num) - 1;
      if (nums[index] > 0) {
        nums[index] *= -1;
      }
    }
    List<Integer> res = new ArrayList<>();
    for (int i = 0; i < nums.length; i ++) {
      if (nums [i] > 0) {
        res.add(i + 1);
      }
    }
    return res;
  }
}
