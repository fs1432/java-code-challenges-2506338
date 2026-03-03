package com.linkedinlearning.challenges;

import java.util.ArrayList;

public class Fibonacci {
  static ArrayList<Integer> fibonacciList = new ArrayList<>();
  static public void main (String[] args) {
    System.out.println(fibonacci2(3));
    System.out.println(fibonacci2(2));
    System.out.println(fibonacci2(12));
    System.out.println(fibonacci2(3));
    System.out.println(fibonacciList);
  }

  static public int fibonacci(int n) {
    if (fibonacciList.size() < 2) {
      fibonacciList.add(0);
      fibonacciList.add(1);
    }
    while (n > (fibonacciList.size() - 1)) {
      Integer newValue = fibonacciList.get(fibonacciList.size()-1) + fibonacciList.get(fibonacciList.size()-2);
      fibonacciList.add(newValue);
    }

    return (int) fibonacciList.get(n);
  }

  static public int fibonacci2(int n) {
    if (fibonacciList.size() < 2) {
      fibonacciList.add(0);
      fibonacciList.add(1);
    }
    
    if (n > (fibonacciList.size() - 1)) {
      //Integer newValue = fibonacci2(n - 1) + fibonacci2(n - 2);
      //fibonacciList.add(newValue);
      fibonacciList.add(fibonacci2(n - 1) + fibonacci2(n - 2));
    }
    
    return (int) fibonacciList.get(n);
  }
}
