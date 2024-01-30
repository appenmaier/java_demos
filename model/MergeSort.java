package model;

/**
 * Mergesort
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MergeSort {

  private static int counter;

  private static int[] merge(int[] data, int left, int center, int right) {
    int[] temp = new int[data.length];
    int i, j;
    for (i = left; i <= center; i++) {
      temp[i] = data[i];
    }
    for (j = center + 1; j <= right; j++) {
      temp[right + center + 1 - j] = data[j];
    }
    i = left;
    j = right;
    for (int k = left; k <= right; k++) {
      if (temp[i] <= temp[j]) {
        data[k] = temp[i];
        i++;
      } else {
        data[k] = temp[j];
        j--;
      }
    }
    return data;
  }

  public static int[] mergeSort(int[] data, boolean print) {
    return splitAndMerge(data, 0, data.length - 1, print);
  }

  private static void print(int[] data) {
    System.out.println("Durchlauf " + counter);
    for (int x : data) {
      System.out.println(x);
    }
    System.out.println();
  }

  private static int[] splitAndMerge(int[] data, int left, int right, boolean print) {
    if (left < right) {
      int center = (left + right) / 2;
      splitAndMerge(data, left, center, print);
      splitAndMerge(data, center + 1, right, print);
      merge(data, left, center, right);
      counter++;
      if (print) {
        print(data);
      }
    }
    return data;
  }

}
