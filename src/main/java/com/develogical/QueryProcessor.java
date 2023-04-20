package com.develogical;

import java.util.ArrayList;
import java.util.List;

public class QueryProcessor {

  public String process(String query) {

    if (query.toLowerCase().contains("shakespeare")) {
      return "William Shakespeare (26 April 1564 - 23 April 1616) was an "
          + "English poet, playwright, and actor, widely regarded as the greatest "
          + "writer in the English language and the world's pre-eminent dramatist.";
    }

    if (query.toLowerCase().contains("plus")) {
      String[] tokens = query.replace("?", "").split(" ");
      List<String> numbers = new ArrayList<>();
      for (int i = 0; i < tokens.length; i++) {
        if (isANumber(tokens[i])) {
          numbers.add(tokens[i]);
        }
      }
      int answer = Integer.parseInt(numbers.get(0)) + Integer.parseInt(numbers.get(1));
      return String.valueOf(answer);
    }
    return "";
  }

  private boolean isANumber(String value) {
    try {
      Integer.parseInt(value);
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}
