package main;

import java.util.Scanner;

/**
 * Schleifensteuerung mit break und continue
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D170_LoopControl {

   @SuppressWarnings("resource")
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int i = 0;
      while (true) {
         i++;
         System.out.println("Schleifendurchlauf: " + i);
         System.out.print(
               "Was moechtest Du tun (1: Schleifendurchlauf fortsetzen, 2: Schleifendurchlauf beenden, 3: Schleife beenden): ");
         int answer = sc.nextInt();

         if (answer == 2) {
            continue;
         }

         if (answer == 3) {
            break;
         }

         System.out.println("Programmende");
      }

   }

}
