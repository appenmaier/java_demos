package main;

import java.util.Scanner;

/**
 * Conditional Branches
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D140_ConditionalBranches {

   @SuppressWarnings("resource")
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Dein Alter eingeben: ");
      int age = scanner.nextInt();

      String ageText;
      if (age >= 18) {
         ageText = "volljährig";
      } else {
         ageText = "minderjährig";
      }
      System.out.println("Du bist " + ageText);

      ageText = age >= 18 ? "volljährig" : "minderjährig";
      System.out.println("Du bist " + ageText);
   }

}
