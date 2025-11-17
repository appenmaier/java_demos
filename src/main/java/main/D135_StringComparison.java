package main;

import java.util.Scanner;

/**
 * String Comparison
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D135_StringComparison {

   @SuppressWarnings("resource")
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("\"true\" eingeben: ");
      String input = scanner.next();

      if (input == "true") {
         System.out.println("Richtig");
      } else {
         System.out.println("Falsch");
      }

      if (input.equals("true")) {
         System.out.println("Richtig");
      } else {
         System.out.println("Falsch");
      }
   }

}
