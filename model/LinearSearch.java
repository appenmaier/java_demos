package model;

/**
 * Linearsuche
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class LinearSearch {

  private static int counter;

  public static int getCounter() {
    return counter;
  }

  public static int linearSearch(int key, int[] data) {
    for (int i = 0; i < data.length; i++) {
      counter++;
      if (data[i] == key) {
        return i;
      }
    }
    return -1;
  }

}
