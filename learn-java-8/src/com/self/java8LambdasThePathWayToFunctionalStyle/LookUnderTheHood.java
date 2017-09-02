package com.self.java8LambdasThePathWayToFunctionalStyle;
public class LookUnderTheHood {
  public static void main(String[] args) {
    Thread thread = new Thread(new Runnable() {
      public void run() {
        System.out.println("In another thread");
      }
    });
    thread.start();
    
    new Thread(() -> System.out.println("and another")).start();
    
    System.out.println("In main");
  }
}

