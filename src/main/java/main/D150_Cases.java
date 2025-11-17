package main;

import java.util.Scanner;

/**
 * Cases
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D150_Cases {

   @SuppressWarnings("resource")
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("\"R/r\", \"G/g\" oder \"B/b\" eingeben: ");
      char color = scanner.next().charAt(0);

      String colorText;
      if (color == 'R' || color == 'r') {
         colorText = "rot";
      } else if (color == 'G' || color == 'g') {
         colorText = "grün";
      } else if (color == 'B' || color == 'b') {
         colorText = "blau";
      } else {
         colorText = "";
      }
      System.out.println(colorText);

      switch (color) {
         case 'R':
         case 'r':
            colorText = "rot";
            break;
         case 'G':
         case 'g':
            colorText = "grün";
            break;
         case 'B':
         case 'b':
            colorText = "blau";
            break;
         default:
            colorText = "";
            break;
      }
      System.out.println(colorText);

      colorText = switch (color) {
         case 'R', 'r' -> "rot";
         case 'G', 'g' -> "grün";
         case 'B', 'b' -> "blau";
         default       -> "";
      };
      System.out.println(colorText);
   }

}
