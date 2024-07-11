package model;

import java.util.Arrays;

/**
 * Mergesort
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MergeSort {

  private static int counter;

  public static int[] mergeSort(int[] data, boolean print) {
    if (data.length > 1) {
      int center = data.length / 2;
      int[] left = new int[center];
      for (int i = 0; i <= center - 1; i++) {
        left[i] = data[i];
      }

      int[] right = new int[data.length - center];
      for (int i = center; i <= data.length - 1; i++) {
        right[i - center] = data[i];
      }
      left = mergeSort(left, print);
      right = mergeSort(right, print);
      return merge(left, right, print);
    } else {
      return data;
    }
  }

  private static int[] merge(int[] left, int[] right, boolean print) {
    int[] data = new int[left.length + right.length];
    int leftIndex = 0;
    int rightIndex = 0;
    int index = 0;
    while (leftIndex < left.length && rightIndex < right.length) {
      if (left[leftIndex] < right[rightIndex]) {
        data[index] = left[leftIndex];
        leftIndex += 1;
      } else {
        data[index] = right[rightIndex];
        rightIndex += 1;
      }
      index += 1;
    }
    while (leftIndex < left.length) {
      data[index] = left[leftIndex];
      leftIndex += 1;
      index += 1;
    }
    while (rightIndex < right.length) {
      data[index] = right[rightIndex];
      rightIndex += 1;
      index += 1;
    }
    counter++;
    if (print) {
      System.out.println("Durchlauf " + counter + ": " + Arrays.toString(left) + " + "
          + Arrays.toString(right) + " = " + Arrays.toString(data));
    }
    return data;
  }

}
