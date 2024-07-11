package model;

/**
 * Binaersuche
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class BinarySearch {

  private static int counter;

  public static int binarySearch(int key, int[] data) {
    int center;
    int left = 0;
    int right = data.length - 1;
    while (left <= right) {
      counter++;
      center = left + ((right - left) / 2);
      System.out.println("Durchlauf: " + counter + ", Teiler: " + center);
      if (data[center] == key) {
        return center;
      } else if (data[center] > key) {
        right = center - 1;
      } else {
        left = center + 1;
      }
    }
    return -1;
  }

  public static int getCounter() {
    return counter;
  }

}
