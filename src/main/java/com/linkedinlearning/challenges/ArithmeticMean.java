package com.linkedinlearning.challenges;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class ArithmeticMean {
  public static void main (String[] args) {
    ArrayList<Integer> numberList = new ArrayList<>();
    System.out.println(getArithmeticMean2(numberList));
    numberList.add(12);
    System.out.println(getArithmeticMean2(numberList));
    numberList.add(12);
    System.out.println(getArithmeticMean2(numberList));
    numberList.add(12);
    System.out.println(getArithmeticMean2(numberList));
    numberList.add(13);
    System.out.println(getArithmeticMean2(numberList));
    numberList.add(43);
    System.out.println(getArithmeticMean2(numberList));
    numberList.add(42);
    System.out.println(getArithmeticMean2(numberList));
  }

  public static double getArithmeticMean(Collection<Integer> numbers) {
    int sum = 0;
    for (var number : numbers) {
      sum += number;
    }

    if (sum == 0) {
      return 0.0;
    }

    double mean = 1.0 * sum / numbers.size();

    return mean;
  }

  public static double getArithmeticMean2(Collection<Integer> numbers) {
    var numberStream = numbers.stream();
    long count = numberStream.count();
    numberStream = numbers.stream();
    int sum = numberStream.reduce(0, (a, b) -> a + b);

    numberStream = numbers.stream();
    double mean = numberStream
      .mapToInt(Integer::intValue)
      .average()
      .orElse(0.0);
    
    System.out.println(mean);
    if (sum == 0) {
      return 0.0;
    }
    return 1.0 * sum / count;
  }
}
