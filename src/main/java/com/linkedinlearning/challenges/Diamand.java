package com.linkedinlearning.challenges;

public class Diamand {
  static public void main(String[] args) {
    for (char letter = 'A'; letter <= 'H'; letter++){
      System.out.println(renderDiamand(letter));
      System.out.println("---");
    }
  }

  static public String renderDiamand(char letter) {
    int place = letter - 'A';
    //System.out.println(place);

    String result = "";
    for (var x = 'A'; x < letter; x ++) {
      String line = "";
      for (var i = 0; i < place - (x - 'A'); i++){
        line += " ";
      }
      line += x;
      for (var i = 0; i < 2 * (x - 'A') - 1; i++) {
        line += " ";
      }
      if (x != 'A') {
        line += x;
      }
      result += line + "\n";
    }
    
    for (var x = letter; x >= 'A'; x--) {
      String line = "";
      for (var i = 0; i < place - (x - 'A'); i++) {
        line += " ";
      }
      line += x;
      for (var i = 0; i < 2 * (x - 'A') - 1; i++) {
        line += " ";
      }
      if (x != 'A') {
        line += x;
      }
      result += line + "\n";
    }
    return result;
  }
}
