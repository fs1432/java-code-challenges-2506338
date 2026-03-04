package com.linkedinlearning.challenges;

import java.util.ArrayList;

public class HappyNumbers {
  static public void main(String[] args) {
    System.out.println(isHappy(2));
    System.out.println(isHappy(8));
    System.out.println(isHappy(4));
    System.out.println(isHappy(42));
    System.out.println("---");

    System.out.println(isHappy(1));
    System.out.println(isHappy(19));
    System.out.println(isHappy(28));
    System.out.println(isHappy(23));
    System.out.println(isHappy(13));
    System.out.println(isHappy(899));
  }

  static public boolean isHappy(int n) {
    ArrayList<Integer> emptyHistory = new ArrayList<>();
    return isHappy(n, emptyHistory);
  }

  static private boolean isHappy(Integer n, ArrayList<Integer> history) {
    //String s = n.toString();
    int sum = 0;
    while (n > 0) {
      int digit = n % 10;
      sum += digit * digit;
      n /= 10;
    }
    //for (var i = 0; i < s.length(); i++) {
    //  int digit = Integer.parseInt(s.substring(i, i+1));
    //  sum += digit * digit;
    //}

    if (sum == 1) {
      return true;
    }
    if (history.contains(sum)){
      return false;
    }
    history.add(sum);

    return isHappy(sum, history);
  }
}
