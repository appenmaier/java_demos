package main;

import java.util.Random;
import model.BubbleSort;
import model.InsertionSort;
import model.MergeSort;
import model.QuickSort;
import model.SelectionSort;

/**
 * Sortieralgorithmen
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D580_SortingAlgorithms {

  public static void main(String[] args) {

    boolean[] sortAlgorithms = {false, false, false, true, false};

    int noValues = 100000;
    int[] bubbleSortData = new int[noValues];
    int[] insertSortData = new int[noValues];
    int[] selectSortData = new int[noValues];
    int[] quickSortData = new int[noValues];
    int[] mergeSortData = new int[noValues];

    long start;

    Random random = new Random();

    for (int i = 0; i < noValues; i++) {
      bubbleSortData[i] = random.nextInt(noValues * 10) + 1;
      insertSortData[i] = bubbleSortData[i];
      selectSortData[i] = bubbleSortData[i];
      quickSortData[i] = bubbleSortData[i];
      mergeSortData[i] = bubbleSortData[i];
    }

    if (sortAlgorithms[0]) {
      start = System.currentTimeMillis();
      BubbleSort.bubbleSort(bubbleSortData, false);
      System.out.println(System.currentTimeMillis() - start);
    }

    if (sortAlgorithms[1]) {
      start = System.currentTimeMillis();
      SelectionSort.selectionSort(selectSortData, false);
      System.out.println(System.currentTimeMillis() - start);
    }

    if (sortAlgorithms[2]) {
      start = System.currentTimeMillis();
      InsertionSort.insertionSort(insertSortData, false);
      System.out.println(System.currentTimeMillis() - start);
    }

    if (sortAlgorithms[3]) {
      start = System.currentTimeMillis();
      QuickSort.quickSort(quickSortData, false);
      System.out.println(System.currentTimeMillis() - start);
    }

    if (sortAlgorithms[4]) {
      start = System.currentTimeMillis();
      MergeSort.mergeSort(mergeSortData, false);
      System.out.println(System.currentTimeMillis() - start);
    }

  }

}
