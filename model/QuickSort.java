package model;

/**
 * Quicksort
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class QuickSort {

  private static int counter;

  private static void print(int[] data) {
    System.out.println("Durchlauf " + counter);
    for (int x : data) {
      System.out.println(x);
    }
    System.out.println();
  }

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
      print(data);
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
