package main;

import java.util.ArrayList;

/**
 * For Each Loop
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D315_ForEachLoop {

   public static void main(String[] args) {
      ArrayList<String> names = new ArrayList<>();

      names.add("Hans");
      names.add("Peter");
      names.add("Lisa");

      // "klassische" for-Schleife
      for (int i = 0; i < names.size(); i++) {
         String name = names.get(i);
         System.out.println(name);
      }
      System.out.println();

      // for-each-Schleife
      for (String name : names) {
         System.out.println(name);
      }
   }

}
