package org.vnsh;

import java.util.HashMap;
import java.util.Map;

/**
 * 3. Longest Substring Without Repeating Characters
 * <p>
 * Medium
 * <p>
 * Given a string s, find the length of the longest substring without repeating characters.
 * <p>
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * <p>
 * Example 2:
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * <p>
 * Example 3:
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * <p>
 * Example 4:
 * Input: s = ""
 * Output: 0
 * <p>
 * Constraints:
 * <p>
 * 0 <= s.length <= 5 * 10^4
 * s consists of English letters, digits, symbols and spaces.
 */
public class LongestSubstringWithoutRepeatingCharacters {
  public int lengthOfLongestSubstring(String s) {
    Map<Character, Integer> longestSubstring = new HashMap<>();
    int longestLength = 0;
    char[] charArray = s.toCharArray();
    for (int i = 0, substringStart = 0; i < charArray.length; i++) {
      char c = charArray[i];
      if (!longestSubstring.containsKey(c)) {
        longestSubstring.put(c, i);
        longestLength = Math.max(longestSubstring.size(), longestLength);
      } else {
        Integer prevSubstringEnd = longestSubstring.get(c);
        for (int j = substringStart; j <= prevSubstringEnd; j++) {
          longestSubstring.remove(charArray[j]);
        }
        longestSubstring.put(c, i);
        substringStart = prevSubstringEnd + 1;
      }
    }
    return longestLength;
  }
}
