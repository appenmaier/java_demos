package model;

/**
 * Selectionsort
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class SelectionSort {

  private static int counter;

  private static void print(int[] data) {
    System.out.println("Durchlauf " + counter);
    for (int x : data) {
      System.out.println(x);
    }
    System.out.println();
  }

  public static int[] selectionSort(int[] data, boolean print) {
    for (int i = 0; i < data.length - 1; i++) {
      counter++;
      int index = i;
      for (int j = i + 1; j < data.length; j++)
        if (data[j] < data[index]) {
          index = j;
        }
      int temp = data[index];
      data[index] = data[i];
      data[i] = temp;
      if (print) {
        print(data);
      }
    }
    return data;
  }

}
