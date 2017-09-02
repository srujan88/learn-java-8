package com.self.getTasteOfLambdasAndGetAddictedToStreams;
import java.util.*;
import java.util.stream.*;

public class CreatingInfiniteStream {
  public static void main(String[] args) {
    System.out.println(Stream.iterate(100, e -> e + 1));
    
    //start with 100, create a series
    //100, 101, 102, 103, ...
    
  }
}