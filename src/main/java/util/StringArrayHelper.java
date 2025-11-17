package util;

/**
 * Helper Class for String Arrays
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class StringArrayHelper {

   public static String[] add(String[] array, String value) {
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

      return array;
   }

   public static void print(String[] array) {
      for (int i = 0; i < array.length; i++) {
         if (array[i] == null) {
            continue;
         }
         System.out.print("[" + array[i] + "]");
      }
      System.out.println();
   }

}
