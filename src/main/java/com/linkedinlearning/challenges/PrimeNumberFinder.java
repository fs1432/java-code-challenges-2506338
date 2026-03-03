package com.linkedinlearning.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class PrimeNumberFinder {
  static public void main(String[] args) {
    System.out.println(findPrimeNumbersInInterval(2, 10));
    System.out.println(findPrimeNumbersInInterval2(2, 10));
    System.out.println(findPrimeNumbersInInterval(5, 7));
    System.out.println(findPrimeNumbersInInterval2(5, 7));
    System.out.println(findPrimeNumbersInInterval(4, 6));
    System.out.println(findPrimeNumbersInInterval2(4, 6));
    System.out.println(findPrimeNumbersInInterval(6, 8));
    System.out.println(findPrimeNumbersInInterval2(6, 8));
    System.out.println(findPrimeNumbersInInterval(11, 3));
    System.out.println(findPrimeNumbersInInterval2(11, 3));
    
    System.out.println(findPrimeNumbersInInterval(97, 146));
    System.out.println(findPrimeNumbersInInterval2(97, 146));
  }

  static List<Integer> findPrimeNumbersInInterval(int start, int end) {
    if (start < 1) {
      start = 1;
    }
    if (start > end) {
      // RuntimeException()
      System.err.println("Begin muss vor Ende sein");
      return null;
    }

    List<Integer> result = new ArrayList<>();

    for (var i = start; i <= end; i++) {
      boolean isPrime = true;
      for (var teiler = 2; teiler <= Math.sqrt(i); teiler++) {
        if (i % teiler == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        result.add(i);
      }
    }

    return result;
  }

  static List<Integer> findPrimeNumbersInInterval2(int start, int end) {
    if (start < 1) {
      start = 1;
    }
    if (start > end) {
      // RuntimeException()
      System.err.println("Begin muss vor Ende sein");
      return null;
    }

    HashSet<Integer> result = new HashSet<>();
    for (var i = start; i <= end; i++) {
      result.add(i);
    }

    for (var teiler = 2; teiler <= end; teiler++) {
      if ((teiler < start) || (result.contains(teiler))) {
        for (var nonPrime = 2 * teiler; nonPrime <= end; nonPrime += teiler) {
          if (result.contains(nonPrime)) {
            result.remove(nonPrime);
          }
        }
      }
    }

    List<Integer> resultList = new ArrayList<>(result);

    resultList.sort(null);

    return resultList;
  }
}
