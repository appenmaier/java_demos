package main;

import model.PlugType;

/**
 * Enumerations
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D340_Enumerations {

   public static void main(String[] args) {
      PlugType typeF = PlugType.TYPE_F;
      PlugType typeB = PlugType.TYPE_B;
      PlugType typeF2 = PlugType.TYPE_F;

      String text = "TYPE_I";
      PlugType typeI = PlugType.valueOf(text);

      System.out.println(typeF.description());
      System.out.println(typeB.description());
      System.out.println(typeF2.description());
      System.out.println(typeI.description());
      System.out.println();

      for (PlugType p : PlugType.values()) {
         System.out.println(p);
      }
   }

}
