/**
 *An abstract class that represents an algorithm.
*/
package com.example;

/**
 * this is a class.
 */
public class Greeter {
/**
 * this is a constructor.
 */
  public Greeter() {

  }
/**
 * @param someone name of person
 * @return String
 */
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
