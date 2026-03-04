package com.linkedinlearning.challenges;

public class BubbleSort {
  static public void main(String[] args) {
    int[] array = {1,6,3,7,3,0};
    sort(array);
    for (var ele : array) {
      System.out.print(ele + " - ");
    }
    System.out.println();
    
  }

  static public void sort(int[] array) {
    boolean changeExecuted; // = true;
    do {
      changeExecuted = false;
      for (var i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i + 1]) {
          int bigger = array[i];
          int smaller = array[i + 1];
          array[i] = smaller;
          array[i + 1] = bigger;
          changeExecuted = true;
        }
      }
    } while (changeExecuted);
  }
}
