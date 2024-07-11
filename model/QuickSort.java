package model;

import java.util.Arrays;

/**
 * Quicksort
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class QuickSort {

  private static int counter;

  public static int[] quickSort(int[] data, boolean print) {
    return sort(data, 0, data.length - 1, print);
  }

  private static int[] sort(int[] data, int left, int right, boolean print) {
    int center = left + (right - left) / 2;
    int pivot = data[center];
    int i = left, j = right;
    counter++;
    while (i <= j) {
      while (data[i] < pivot) {
        i++;
      }
      while (data[j] > pivot) {
        j--;
      }
      if (i <= j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
        i++;
        j--;
      }
    }
    if (print) {
      System.out.println("Durchlauf " + counter + ": " + Arrays.toString(data));
    }
    if (left < j) {
      sort(data, left, j, print);
    }
    if (right > i) {
      sort(data, i, right, print);
    }
    return data;
  }

}
