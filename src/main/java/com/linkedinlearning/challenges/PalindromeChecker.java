package com.linkedinlearning.challenges;

public class PalindromeChecker {
  public static void main(String[] vars) {
    System.out.println(isPalindrome("null"));
    System.out.println(isPalindrome("anna"));
    System.out.println(isPalindrome("abcba"));
    System.out.println(isPalindrome("racecar"));
    System.out.println(isPalindrome("space"));
    System.out.println(isPalindrome("radar"));
    System.out.println(isPalindrome("a"));
  }
  public static boolean isPalindrome(String word) {
    int length = word.length();
    for (var i = 0; i < length / 2; i++) {
      if (!(word.substring(i, i + 1).equals(word.substring(length - i - 1, length - i)))){
        return false;
      }
    }
    return true;
  }
}
