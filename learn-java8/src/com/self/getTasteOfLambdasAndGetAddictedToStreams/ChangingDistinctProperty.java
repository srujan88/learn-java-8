package com.self.getTasteOfLambdasAndGetAddictedToStreams;
import java.util.*;

public class ChangingDistinctProperty {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5);
    
    numbers.stream()
           .filter(e -> e % 2 == 0)
           .distinct()
           .forEach(System.out::println);
    //sized, ordered, distinct, non-sorted
  }
}