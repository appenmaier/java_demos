package main;

import util.Calculator;
import util.Printer;

/**
 * Static Methods
 *
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class D020_StaticMethods {

   public static void main(String[] args) {
      Printer.printHelloWorld();
      Printer.printHelloWorld();
      Printer.printText("Winter");
      Printer.printText("is");
      Printer.printText("coming");

      int result1 = Calculator.add(5, 3);
      int result2 = Calculator.multiply(5, 3);
      System.out.println(result1);
      System.out.println(result2);
   }

}
