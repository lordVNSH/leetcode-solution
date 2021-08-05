package org.vnsh;

import java.util.Stack;

/**
 * 394. Decode String
 * <p>
 * Medium
 * <p>
 * Given an encoded string, return its decoded string.
 * <p>
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
 * <p>
 * You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.
 * <p>
 * Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].
 * <p>
 * Example 1:
 * Input: s = "3[a]2[bc]"
 * Output: "aaabcbc"
 * <p>
 * Example 2:
 * Input: s = "3[a2[c]]"
 * Output: "accaccacc"
 * <p>
 * Example 3:
 * Input: s = "2[abc]3[cd]ef"
 * Output: "abcabccdcdcdef"
 * <p>
 * Example 4:
 * Input: s = "abc3[cd]xyz"
 * Output: "abccdcdcdxyz"
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 30
 * s consists of lowercase English letters, digits, and square brackets '[]'.
 * s is guaranteed to be a valid input.
 * All the integers in s are in the range [1, 300].
 */
public class DecodeString {
  public String decodeString(String s) {
    Stack<Character> decodedStack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c != ']') {
        decodedStack.push(c);
      } else {
        StringBuilder subString = new StringBuilder();
        StringBuilder number = new StringBuilder();
        char popc = decodedStack.pop();
        while (popc != '[') {
          subString.insert(0, popc);
          popc = decodedStack.pop();
        }
        popc = decodedStack.pop();
        while (Character.isDigit(popc)) {
          number.insert(0, popc);
          if (decodedStack.empty()) {
            break;
          }
          popc = decodedStack.pop();
        }
        if (!decodedStack.empty()) {
          decodedStack.push(popc);
        }
        int j = 0;
        while (j < Integer.parseInt(number.toString())) {
          char[] charArray = subString.toString().toCharArray();
          for (int k = 0; k < charArray.length; k++) {
            char c1 = charArray[k];
            decodedStack.push(c1);
          }
          j++;
        }
      }
    }

    StringBuilder resString = new StringBuilder();
    while (!decodedStack.empty()) {
      Character popc = decodedStack.pop();
      resString.insert(0, popc);
    }

    return resString.toString();
  }
}
