package com.self.hiddenTreasuresInJava8;
import java.util.*;

interface Util {
  public static int numberOfCores() {
    return Runtime.getRuntime().availableProcessors();
  }
}

public class StaticInterfaceMethods {
  public static void main(String[] args) {
    System.out.println(Util.numberOfCores());
  }
}
