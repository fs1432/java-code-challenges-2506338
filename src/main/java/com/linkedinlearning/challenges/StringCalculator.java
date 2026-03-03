package com.linkedinlearning.challenges;

public class StringCalculator {
  static public void main (String[] args) {
    System.out.println(add("1,2,7"));
    System.out.println(add("1,2,3,4,5"));
    System.out.println(add("3"));
    System.out.println(add(""));
  }
  static public int add(String numbers) {
    if (numbers.isEmpty()) {
      return 0;
    }
    String[] numberList = numbers.split(",");
    
    int result = 0;
    //System.out.println(numberList.length);
    for (var number : numberList) {
      result += Integer.parseInt(number);
    }

    return result;
  }
}
