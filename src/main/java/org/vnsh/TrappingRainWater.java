package org.vnsh;

import java.util.ArrayList;
import java.util.List;

/**
 * 42. Trapping Rain Water
 * <p>
 * Hard
 * <p>
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
 * <p>
 * Example 1:
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 * Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
 * <p>
 * Example 2:
 * Input: height = [4,2,0,3,2,5]
 * Output: 9
 * <p>
 * Constraints:
 * <p>
 * n == height.length<br>
 * 1 <= n <= 2 * 10^4<br>
 * 0 <= height[i] <= 10^5<br>
 */
public class TrappingRainWater {
  public int trap(int[] height) {
    if (height == null || height.length < 3) {
      return 0;
    }
    List<Integer> localPeeks = new ArrayList<>();
    for (int i = 0; i < height.length; i++) {
      int prev = 0, next = 0;
      if (i > 0) {
        prev = height[i - 1];
      }
      if (i < height.length - 1) {
        next = height[i + 1];
      }
      if (height[i] >= prev && height[i] >= next) {
        localPeeks.add(i);
      }
    }
    List<Integer> relevantPeeks = new ArrayList<>();
    relevantPeeks.add(localPeeks.get(0));
    for (int left = 0; left < localPeeks.size() - 1; ) {
      boolean rightAdded = false;
      int maxRightIndex = left + 1;
      for (int right = left + 1; right < localPeeks.size(); right++) {
        if (height[localPeeks.get(right)] >= height[localPeeks.get(left)]) {
          relevantPeeks.add(localPeeks.get(right));
          rightAdded = true;
          left = right;
          break;
        } else {
          if (height[localPeeks.get(maxRightIndex)] <= height[localPeeks.get(right)]) {
            maxRightIndex = right;
          }
        }
      }
      if (!rightAdded) {
        left = maxRightIndex;
        relevantPeeks.add(localPeeks.get(maxRightIndex));
      }
    }

    int capacity = 0;
    for (int i = 1; i < relevantPeeks.size(); i++) {
      int containerHeight = Math.min(height[relevantPeeks.get(i - 1)], height[relevantPeeks.get(i)]);
      for (int j = relevantPeeks.get(i - 1) + 1; j < relevantPeeks.get(i); j ++) {
        capacity += Math.max(containerHeight - height[j], 0);
      }
    }
    return capacity;
  }
}
