package com.linkedinlearning.challenges;

import java.util.Scanner;

public class VATCalculator {
  static double MWSTSATZ = 0.19;

  public static void main(String[] args) {
    System.out.println(renderInvoice(100));
    System.out.println();
    System.out.println(renderInvoice(61.874));
    System.out.println();
    System.out.println(renderInvoice(34.5));
  }

  private static String formatEur(double eur) {
    return String.format("%.2f", eur);
  }

  public static String renderInvoice(double price) {
    String result = "";

    result += "Netto: " + formatEur(price) + " EUR\n";
    result += "VAT (" + MWSTSATZ + "): " + formatEur(price * MWSTSATZ) + " EUR\n";
    result += "Total: " + formatEur(price * (1 + MWSTSATZ)) + " EUR";

    return result;
  }
}
