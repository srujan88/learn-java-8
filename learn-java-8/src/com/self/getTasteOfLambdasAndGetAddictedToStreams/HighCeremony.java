package com.self.getTasteOfLambdasAndGetAddictedToStreams;
import java.util.*;

public class HighCeremony {
  public static void main(String[] args) {
    Thread th = new Thread(new Runnable() {
      public void run() {
        System.out.println("In another thread");
      }
    });
    th.start();
    
    System.out.println("In main");
  }
}