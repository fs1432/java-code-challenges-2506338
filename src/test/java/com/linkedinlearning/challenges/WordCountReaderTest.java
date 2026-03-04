package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordCountReaderTest {
  @Test
  void testReadFile() {

    var reader = new WordCountReader();
    try {
      reader.readFile("src/test/resources/simple_words.txt");

      Assertions.assertEquals(86, reader.getCharacters());
      Assertions.assertEquals(18, reader.getWords());
      Assertions.assertEquals(70, reader.getCharactersExcludingSpaces());

      System.out.println(reader);

    } catch(Exception e) {

    }
  }
}