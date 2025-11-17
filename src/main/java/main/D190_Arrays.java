package main;

import java.util.Arrays;

/**
 * Arrays
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D190_Arrays {

   public static void main(String[] args) {
      /* Deklaration und Initialisierung */
      int[] is = {6, 2, 8, -3, 2, -1, 9}; // new int[7]

      /* Zugriff auf einzelne Feld-Elemente */
      System.out.println("is.length: " + is.length);

      is[0] = 3;
      is[1] = 1;
      is[is.length - 1] = -4;

      /* Sequentieller Zugriff auf mehrere Feld-Elemente */
      for (int i = 0; i < is.length; i++) {
         System.out.println(i + ": " + is[i]);
      }
      System.out.println();

      /* Ausgabe von Feldern */
      System.out.println(is);
      System.out.println(Arrays.toString(is));
      for (int i = 0; i < is.length - 1; i++) {
         System.out.print("[" + is[i] + "]");
      }
   }

}
