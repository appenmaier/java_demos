package main;

/**
 * Loops
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D160_Loops {

   public static void main(String[] args) {
      // while-Schleife (kopfgesteuerte Schleife)
      int x = 1;
      while (x <= 10) {
         System.out.println(x);
         x++;
      }

      System.out.println();

      // do/while-Schleife (fußgesteuerte Schleife)
      int a = 1;
      do {
         System.out.println(a);
         a++;
      } while (a <= 10);

      System.out.println();

      // for-Schleife (Zählschleife)
      for (int i = 1; i <= 10; i++) {
         System.out.println(i);
      }
   }

}
