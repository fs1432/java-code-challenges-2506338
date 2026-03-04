package com.linkedinlearning.challenges;

public class WordWrapper {
  private int max;

  //static public void main (String[] args) {
  //  System.out.println(wrap("This is a very, very, very long text expected to be split into lines"));
  //}

  public WordWrapper(int max) {
    this.max = max;
  }

  private String addWord(String text, String word) {
    if (text.isEmpty()) {
      return word;
    }
    if (text.endsWith("\n")) {
      return text + word;
    }
    return text + " " + word;
  }

  public String wrap(String text) {
    String result = "";
    String wordBuffer = "";
    int lineLenght = 0;

    for (char c : text.toCharArray()) {
      if (lineLenght >= max) {
        result += "\n";
        lineLenght = wordBuffer.length();
      } else {
        lineLenght++;
      }
      
      if (c == ' ') {
        result = addWord(result, wordBuffer);
        wordBuffer = "";
      } else {
        wordBuffer += c;
      }
    }

    result = addWord(result, wordBuffer);

    return result;
  }
}
