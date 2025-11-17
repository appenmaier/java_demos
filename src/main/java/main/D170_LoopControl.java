package main;

import java.util.Scanner;

/**
 * Loop Control
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D170_LoopControl {

   @SuppressWarnings("resource")
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      /* continue */
      System.out.print("Text eingeben: ");
      String text = scanner.nextLine();
      System.out.println("Zeichen eingeben: ");
      char token = scanner.next().charAt(0);

      for (int i = 0; i < text.length(); i++) {
         if (text.charAt(i) == token) {
            continue;
         }
         System.out.print(text.charAt(i));
      }
      System.out.println();

      /* break */
      while (true) {
         System.out.print("Schleife beenden (true)?: ");
         if (scanner.nextBoolean()) { // if (scanner.nextBoolean() == true) {
            break;
         }
         long now = System.currentTimeMillis();
         System.out.println(now);
      }
   }

}
