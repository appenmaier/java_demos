package model;

/**
 * Bubblesort
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class BubbleSort {

  private static int counter;

  public static int[] bubbleSort(int[] data, boolean print) {
    int temp;
    for (int i = 1; i < data.length; i++) {
      counter++;
      for (int j = 0; j < data.length - i; j++) {
        if (data[j] > data[j + 1]) {
          temp = data[j];
          data[j] = data[j + 1];
          data[j + 1] = temp;
        }
      }
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
