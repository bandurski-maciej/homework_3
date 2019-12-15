package com.isa;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {

  public static void main(String[] args) {
    App app = new App();
    System.out.println(app.getLettersStats(app.getWords()));

  }

  public List<String> getWords() {
    return Arrays.asList("hello", "academy", "java", "junior");

  }
  public Map<String, Long> getLettersStats(List<String> words) {
    return Arrays.stream(String.join("", words)
            .split(""))
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
  }

}
