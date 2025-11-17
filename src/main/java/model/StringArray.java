package model;

/**
 * String Array
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class StringArray {

   public String[] array = new String[2];

   public void add(String value) {
      if (array[array.length - 1] != null) {
         String[] tmp = new String[array.length * 2];
         for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
         }
         array = tmp;
      }

      for (int i = 0; i < array.length; i++) {
         if (array[i] == null) {
            array[i] = value;
            break;
         }
      }
   }

   public void print() {
      for (int i = 0; i < array.length; i++) {
         if (array[i] == null) {
            continue;
         }
         System.out.print("[" + array[i] + "]");
      }
      System.out.println();
   }

}
