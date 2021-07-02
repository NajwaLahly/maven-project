package com.example;


public class Greeter {

  
  public Greeter() {
 /**
   *Empty Constructor
   */
  }

  public final String greet(final String someone) {
     /**
   * returns greeting string
   */
    return String.format("Hello babacar, %s!", someone);
  }
}
