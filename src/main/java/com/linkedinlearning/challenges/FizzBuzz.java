package com.linkedinlearning.challenges;

public class FizzBuzz {
  public static void main(String[] args) {
    for (var i =0 ; i <= 25; i++) {
      System.out.println(getFizzBuzzString(i));
      System.out.println(getFizzBuzzString2(i));
      System.out.println();
    }

  }
  private static String getFizzBuzzString (int number) {
    if (number % (3 * 5) == 0) {
      return "FizzBuzz";
    }
    if (number % 3 == 0) {
      return "Fizz";
    }
    if (number % 5 == 0) {
      return "Buzz";
    }
    return String.valueOf(number);
  }

  private static String getFizzBuzzString2(int number) {
    String result = "";
    if (number % 3 == 0) {
      result += "Fizz";
    }
    if (number % 5 == 0) {
      result += "Buzz";
    }
    if (result.isEmpty()) {
      return String.valueOf(number);
    }
    return result;
  }
}
