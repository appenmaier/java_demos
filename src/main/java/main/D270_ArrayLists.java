package main;

import java.util.ArrayList;

/**
 * ArrayLists
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D270_ArrayLists {

   public static void main(String[] args) {
      ArrayList<String> names = new ArrayList<>();

      /* Elemente anfügen */
      names.add("Hans");
      names.add("Peter");

      /* Elemente einfügen */
      names.add(1, "Lisa");
      names.add(1, "Heidi");
      names.add(2, "Max");

      /* Elemente löschen */
      names.remove(0);
      names.remove("Heidi");

      /* Elemente auslesen */
      for (int i = 0; i < names.size(); i++) {
         String name = names.get(i);
         System.out.println(name);
      }

      /* Elemente ausgeben */
      System.out.println(names.toString());
   }

}
