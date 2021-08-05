package org.vnsh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 49. Group Anagrams
 * <p>
 * Medium
 * <p>
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * <p>
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 * <p>
 * Example 1:
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * <p>
 * Example 2:
 * Input: strs = [""]
 * Output: [[""]]
 * <p>
 * Example 3:
 * Input: strs = ["a"]
 * Output: [["a"]]
 * <p>
 * Constraints:
 * <p>
 * 1 <= strs.length <= 10^4
 * 0 <= strs[i].length <= 100
 * strs[i] consists of lower-case English letters.
 */
public class GroupAnagrams {
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> anagrams = new HashMap<>();
    for (String str : strs) {
      char[] chars = str.toCharArray();
      Arrays.sort(chars);
      String sortedString = new String(chars);
      if (!anagrams.containsKey(sortedString)) {
        anagrams.put(sortedString, new ArrayList<>());
      }
      anagrams.get(sortedString).add(str);
    }
    return new ArrayList<>(anagrams.values());
  }
}
