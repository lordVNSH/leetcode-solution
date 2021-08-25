package org.vnsh;

/**
 * 69. Sqrt(x)
 * <p>
 * Easy
 * <p>
 * Given a non-negative integer x, compute and return the square root of x.
 * <p>
 * Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
 * <p>
 * Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.
 * <p>
 * Example 1:
 * <p>
 * Input: x = 4
 * Output: 2
 * Example 2:
 * <p>
 * Input: x = 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
 * <p>
 * Constraints:
 * <p>
 * 0 <= x <= 2^31 - 1
 */
public class Sqrtx {
  public int mySqrt(int x) {
    if (x <= 1) {
      return x;
    }
    int low = 1;
    int high = x;
    int mid;
    while (true) {
      mid = (low + high) / 2;
      if (mid == x / mid) {
        return mid;
      }
      if (mid < x / mid && (mid + 1) > x / (mid + 1)) {
        return mid;
      }
      if (mid < x / mid) {
        low = mid;
      } else {
        high = mid;
      }
    }
  }
}
