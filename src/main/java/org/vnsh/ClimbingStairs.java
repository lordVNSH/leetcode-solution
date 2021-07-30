package org.vnsh;

/**
 * 70. Climbing Stairs
 * <p>
 * Easy
 * <p>
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <p>
 * Example 1:
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * <p>
 * Example 2:
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 */
public class ClimbingStairs {
  public int climbStairs(int n) {
    int m;
    int combinations = 0;
    if (n % 2 == 0) {
      m = n / 2;
    } else {
      m = (n - 1) / 2;
    }
    for (int i = 0; i <= m; i++) {
      combinations += combinatorial(n - i, i);
    }
    return combinations;
  }

  private long combinatorial(int n, int r) {
    long result = 1;
    if (r == 0 || n == r) {
      return result;
    }
    if (n - r < r) {
      r = n - r;
    }
    int i = 1;
    while (i <= r) {
      result *= (n - i + 1);
      result /= i;
      i ++;
    }
    return result;
  }
}
