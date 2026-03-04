package com.linkedinlearning.challenges;

import java.io.FileReader;
import java.io.IOException;

public class WordCountReader {
  //private String path;
  private int words;
  private int characters;
  private int charactersExcludingSpaces;
  
  public static void main(String[] args) {
    System.out.println(Character.isLetter('a'));
    System.out.println(Character.isLetter('b'));
    System.out.println(Character.isLetter(';'));
    System.out.println(Character.isLetter(','));
    System.out.println(Character.isLetter(' '));
  }

  public void readFile(String fileName) throws IOException {
    words = 0;
    characters = 0;
    charactersExcludingSpaces = 0;

    FileReader fr = new FileReader("src/test/resources/simple_words.txt");

    boolean lastCharWasALetter = false;
    int i;
    while ((i = fr.read()) != -1) {
      char c = (char) i;

      boolean thisCharIsALetter = Character.isLetter(c);
      if ((thisCharIsALetter) && (!lastCharWasALetter)) {
        words++;
      }
      lastCharWasALetter = thisCharIsALetter;

      if (c == '\n') {
        continue;
      }
      characters++;
      if (c != ' ') {
        charactersExcludingSpaces++;
      }
    }
    fr.close();
  }

  public int getWords() {
    return words;
  }

  public int getCharacters() {
    return characters;
  }

  public int getCharactersExcludingSpaces() {
    return charactersExcludingSpaces;
  }
}
