package org.vnsh;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GroupAnagramsTest {
  private final GroupAnagrams classUnderTest = new GroupAnagrams();

  @Test
  void noString() {
    String[] strs = {};
    Assertions.assertEquals(0, classUnderTest.groupAnagrams(strs).size());
  }

  @Test
  void emptyString() {
    String[] strs = {""};
    List<List<String>> anagrams = classUnderTest.groupAnagrams(strs);
    Assertions.assertEquals(1, anagrams.size());
    Assertions.assertEquals(1, anagrams.get(0).size());
    Assertions.assertEquals("", anagrams.get(0).get(0));
  }

  @Test
  void oneString() {
    String[] strs = {"abc"};
    List<List<String>> anagrams = classUnderTest.groupAnagrams(strs);
    Assertions.assertEquals(1, anagrams.size());
    Assertions.assertEquals(1, anagrams.get(0).size());
    Assertions.assertEquals("abc", anagrams.get(0).get(0));
  }

  @Test
  void randomInput() {
    String[] strs = {"bat","nat","tan","ate","eat","tea"};
    List<List<String>> anagrams = classUnderTest.groupAnagrams(strs);
    Assertions.assertEquals(3, anagrams.size());
    for (List<String> anagram : anagrams) {
      if (anagram.size() == 1) {
        Assertions.assertTrue(anagram.contains("bat"));
      } else if (anagram.size() == 2) {
        Assertions.assertTrue(anagram.containsAll(List.of("nat", "tan")));
      } else if (anagram.size() == 3) {
        Assertions.assertTrue(anagram.containsAll(List.of("ate","eat","tea")));
      } else {
        Assertions.fail();
      }
    }
  }
}