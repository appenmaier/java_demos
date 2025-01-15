package main;

import java.util.Scanner;

/**
 * Bedingte Verzweigungen
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D140_ConditionalIfCases {

   @SuppressWarnings("resource")
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      String ageText;

      System.out.print("Gib bitte Dein Alter ein: ");
      int age = sc.nextInt();

      if (age >= 18) {
         ageText = "volljaehrig";
      } else {
         ageText = "minderjaehrig";
      }

      ageText = age >= 18 ? "volljaehrig" : "minderjaehrig";

      System.out.println("Du bist " + ageText);

   }

}
