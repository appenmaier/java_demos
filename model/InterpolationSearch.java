package model;

/**
 * Interpolationssuche
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class InterpolationSearch {

   private static int counter;

   public static int getCounter() {
      return counter;
   }

   public static int interpolationSearch(int key, int[] data) {
      int divider;
      int left = 0;
      int right = data.length - 1;
      while (key >= data[left] && key <= data[right]) {
         counter++;
         divider = left
               + (int) (((double) right - left) * (key - data[left]) / (data[right] - data[left]));
         System.out.println("Durchlauf: " + counter + ", Teiler: " + divider);
         if (key > data[divider]) {
            left = divider + 1;
         } else if (key < data[divider]) {
            right = divider - 1;
         } else {
            return divider;
         }
      }
      return -1;
   }

}
