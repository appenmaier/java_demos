package main;

import java.util.Scanner;

/**
 * Branches
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D130_Branches {

   @SuppressWarnings("resource")
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Dein Alter eingeben: ");
      int age = scanner.nextInt();

      /* Einfachverzweigung */
      if (age >= 18) {
         System.out.println("Du bist volljährig");
      } else {
         System.out.println("Du bist minderjährig");
      }

      /* Verschachtelte Verzweigung */
      if (age < 12) {
         System.out.println("Du bist ein Kind");
      } else if (age < 18) {
         System.out.println("Du bist ein Jugendlicher");
      } else if (age < 65) {
         System.out.println("Du bist ein Erwachsener");
      } else {
         System.out.println("Du bist ein Senior");
      }
   }

}
