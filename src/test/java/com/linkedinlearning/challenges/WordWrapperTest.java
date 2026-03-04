package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordWrapperTest {
  @Test
  void testWordWrapper() {
    WordWrapper wordWrapper = new WordWrapper(10);
    String text = "This is a very long sentence that will be wrapped";
    String expected = "This is a\nvery long\nsentence\nthat will\nbe wrapped";
    String actual = wordWrapper.wrap(text);

    Assertions.assertEquals(expected, actual);
    System.out.println(actual);


    var wrapper = new WordWrapper(10);
    text = "This is a very, very, very long text expected to be split into lines";
    expected = "This is a\nvery,\nvery, very\nlong text\nexpected\nto be\nsplit into\nlines";
    actual = wrapper.wrap(text);
    Assertions.assertEquals(expected, actual);
  }
}
