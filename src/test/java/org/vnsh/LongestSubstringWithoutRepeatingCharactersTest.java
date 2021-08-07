package org.vnsh;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingCharactersTest {
  private final LongestSubstringWithoutRepeatingCharacters classUnderTest =
      new LongestSubstringWithoutRepeatingCharacters();

  @Test
  void emptyString() {
    Assertions.assertEquals(0, classUnderTest.lengthOfLongestSubstring(""));
  }

  @Test
  void singleChar() {
    Assertions.assertEquals(1, classUnderTest.lengthOfLongestSubstring("a"));
  }

  @Test
  void repeatedSingleChar() {
    Assertions.assertEquals(1, classUnderTest.lengthOfLongestSubstring("aaaaaaa"));
  }

  @Test
  void simpleCase() {
    Assertions.assertEquals(10, classUnderTest.lengthOfLongestSubstring("qwertyuiop"));
  }

  @Test
  void randomCase() {
    Assertions.assertEquals(3, classUnderTest.lengthOfLongestSubstring("abcbbccece"));
  }

  @Test
  void randomCase1() {
    Assertions.assertEquals(2, classUnderTest.lengthOfLongestSubstring("aab"));
  }

  @Test
  void randomCase2() {
    Assertions.assertEquals(3, classUnderTest.lengthOfLongestSubstring("dvdf"));
  }

  @Test
  void randomCase3() {
    Assertions.assertEquals(6, classUnderTest.lengthOfLongestSubstring("umvejcuuk"));
  }
}