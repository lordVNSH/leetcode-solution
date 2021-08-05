package org.vnsh;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DecodeStringTest {
  private final DecodeString classUnderTest = new DecodeString();

  @Test
  void simpleCase() {
    Assertions.assertEquals("qwertyuiop", classUnderTest.decodeString("qwertyuiop"));
  }

  @Test
  void simpleDecodeCase() {
    Assertions.assertEquals("aaabcbc", classUnderTest.decodeString("3[a]2[bc]"));
  }

  @Test
  void recursiveCase() {
    Assertions.assertEquals("accaccacc", classUnderTest.decodeString("3[a2[c]]"));
  }

  @Test
  void multiDigitCase() {
    Assertions.assertEquals("aaaaaaaaaacc", classUnderTest.decodeString("10[a]2[c]"));
  }
}