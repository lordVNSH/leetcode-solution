package org.vnsh;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringCompressionTest {
  private final StringCompression classUnderTest = new StringCompression();

  @Test
  void noChars() {
    char[] chars = {};
    Assertions.assertEquals(0, classUnderTest.compress(chars));
  }

  @Test
  void singleChar() {
    char[] chars = {'a'};
    Assertions.assertEquals(1, classUnderTest.compress(chars));
  }

  @Test
  void randomCompress() {
    char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
    Assertions.assertEquals(6, classUnderTest.compress(chars));
    char[] expectedChars = {'a', '2', 'b', '2', 'c', '3'};
    for (int i = 0; i < 6; i++) {
      Assertions.assertEquals(expectedChars[i], chars[i]);
    }

    char[] chars2 = {'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
    char[] expectedChars2 = {'b', '1', '2'};
    Assertions.assertEquals(3, classUnderTest.compress(chars2));
    for (int i = 0; i < 3; i++) {
      Assertions.assertEquals(expectedChars2[i], chars2[i]);
    }
  }
}