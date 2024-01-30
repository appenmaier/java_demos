package model;

/**
 * Insertionsort
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class InsertionSort {

  private static int counter;

  public static int[] insertionSort(int[] data, boolean print) {
    int temp;
    for (int i = 1; i < data.length; i++) {
      counter++;
      int j = i;
      temp = data[j];
      while (j > 0 && data[j - 1] > temp) {
        data[j] = data[j - 1];
        j--;
      }
      data[j] = temp;
      if (print) {
        print(data);
      }
    }
    return data;
  }

  private static void print(int[] data) {
    System.out.println("Durchlauf " + counter);
    for (int x : data) {
      System.out.println(x);
    }
    System.out.println();
  }

}
