package main;

import java.util.Random;
import model.BubbleSort;
import model.HeapSort;
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

    boolean[] sortAlgorithms = {true, true, true, true, true, true};
    boolean print = false;
    int numberOfValues = 100000;

    int[] bubbleSortData = new int[numberOfValues];
    int[] insertionSortData = new int[numberOfValues];
    int[] selectionSortData = new int[numberOfValues];
    int[] quickSortData = new int[numberOfValues];
    int[] mergeSortData = new int[numberOfValues];
    int[] heapSortData = new int[numberOfValues];

    long start;

    Random random = new Random();

    for (int i = 0; i < numberOfValues; i++) {
      bubbleSortData[i] = random.nextInt(numberOfValues * 10) + 1;
      insertionSortData[i] = bubbleSortData[i];
      selectionSortData[i] = bubbleSortData[i];
      quickSortData[i] = bubbleSortData[i];
      mergeSortData[i] = bubbleSortData[i];
      heapSortData[i] = bubbleSortData[i];
    }

    if (sortAlgorithms[0]) {
      start = System.currentTimeMillis();
      System.out.println("Bubblesort");
      BubbleSort.bubbleSort(bubbleSortData, print);
      System.out.println("Laufzeit: " + (System.currentTimeMillis() - start) + " ms");
      System.out.println();
    }

    if (sortAlgorithms[1]) {
      start = System.currentTimeMillis();
      System.out.println("Selectionsort");
      SelectionSort.selectionSort(selectionSortData, print);
      System.out.println("Laufzeit: " + (System.currentTimeMillis() - start) + " ms");
      System.out.println();
    }

    if (sortAlgorithms[2]) {
      start = System.currentTimeMillis();
      System.out.println("Insertionsort");
      InsertionSort.insertionSort(insertionSortData, print);
      System.out.println("Laufzeit: " + (System.currentTimeMillis() - start) + " ms");
      System.out.println();
    }

    if (sortAlgorithms[3]) {
      start = System.currentTimeMillis();
      System.out.println("Quicksort");
      QuickSort.quickSort(quickSortData, print);
      System.out.println("Laufzeit: " + (System.currentTimeMillis() - start) + " ms");
      System.out.println();
    }

    if (sortAlgorithms[4]) {
      start = System.currentTimeMillis();
      System.out.println("Mergesort");
      MergeSort.mergeSort(mergeSortData, print);
      System.out.println("Laufzeit: " + (System.currentTimeMillis() - start) + " ms");
      System.out.println();
    }

    if (sortAlgorithms[5]) {
      start = System.currentTimeMillis();
      System.out.println("Heapsort");
      HeapSort.heapSort(heapSortData, print);
      System.out.println("Laufzeit: " + (System.currentTimeMillis() - start) + " ms");
      System.out.println();
    }

  }

}
