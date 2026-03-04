package com.linkedinlearning.challenges;

public class GameOfLive {
  static boolean[][] field = {
      { false, false, false, false, false },
      { false, false, false, false, false },
      { false, true, true, true, false },
      { false, false, false, false, false },
      { false, false, false, false, false },
  };
  static public void main(String[] args) {
    draw();
    System.out.println();
    nextStep();
    draw();
    System.out.println();
    nextStep();
    draw();

  }

  static public void draw() {
    for (var i = 0; i < field.length; i++) {
      for (var j = 0; j < field[i].length; j++) {
        if (field[i][j]) {
          System.out.print("*");
        }else {
          System.out.print(".");
        } 
      }
      System.out.println();
    }
  }

  static private int countNeighbors(int x, int y) {
    int sum = 0;
    for (var i = Math.max(x - 1, 0); i <= Math.min(x + 1, field.length - 1); i++) {
      for (var j = Math.max(y - 1, 0); j <= Math.min(y + 1, field[i].length - 1); j++) {
        if (((i != x) || (j != y)) && field[i][j]){
          sum ++;
        }
      }
    }
    return sum;
  }

  static public void nextStep() {
    boolean[][] newField = new boolean[field.length][field[0].length];

    for (var i = 0; i < field.length; i++) {
      for (var j = 0; j < field[i].length; j++) {
        int neighborCount = countNeighbors(i, j);

        if ((!field[i][j]) && neighborCount == 3) {
          newField[i][j] = true;
        } else if ((field[i][j]) && neighborCount < 2) {
          newField[i][j] = false;
        } else if ((field[i][j]) && neighborCount > 3) {
          newField[i][j] = false;
        } else {
          newField[i][j] = field[i][j];
        }
      }
    }
    field = newField;
  }
}
