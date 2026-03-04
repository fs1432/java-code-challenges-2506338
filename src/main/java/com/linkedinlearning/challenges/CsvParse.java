package com.linkedinlearning.challenges;

import java.util.Map;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

public class CsvParse {
  public Map<Integer, String> parse(String fileName) {
    Map<Integer, String> result = new HashMap<>();

    try {
      BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(fileName)));
      String line = null;
      while ((line = bufferedReader.readLine()) != null) {
        String[] entry = line.split(",");
        int year = Integer.parseInt(entry[0]);
        String name = entry[1];

        if (result.containsKey(year)) {
          result.put(year, result.get(year) + ", " + name);
        } else {
          result.put(year, name);
        }
      }
      bufferedReader.close();
      return result;
    } catch(Exception e) {
      return null;
    }
  }
}
