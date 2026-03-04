package com.linkedinlearning.challenges;

public class Diamand {
  static char START_LETTER = 'A';

  static public void main(String[] args) {
    for (char letter = 'A'; letter <= 'J'; letter++){
      System.out.println(renderDiamand(letter));
      System.out.println("---");
    }
  }

  static public String getLine(char letter, int place) {
    int myPlace = letter - START_LETTER;

    String outerPadding = " ".repeat(place - myPlace);
    String innerPadding = " ".repeat(Math.max(2 * myPlace - 1, 0));
    String line;
    if (letter != START_LETTER) {
      line = outerPadding + letter + innerPadding + letter + outerPadding;
    }else {
      line = outerPadding + letter + outerPadding;
    }
    return line;
  }

  static public String renderDiamand(char letter) {
    int place = letter - START_LETTER;
    //System.out.println(place);

    String result = "";
    for (var x = START_LETTER; x < letter; x++) {
      String line = getLine(x, place);
      result += line + "\n";
    }
    
    for (var x = letter; x >= START_LETTER; x--) {
      String line = getLine(x, place);
      result += line + "\n";
    }
    return result;
  }
}
