package model;

import java.util.Arrays;

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
        System.out.println("Durchlauf " + counter + ": " + Arrays.toString(data));
      }
    }
    return data;
  }

}
