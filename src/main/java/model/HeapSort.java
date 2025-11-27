package model;

import java.util.Arrays;

/**
 * Heap Sort
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class HeapSort {

   private static int counter;

   public static void heapSort(int[] data, boolean print) {
      buildMaxHeap(data);
      for (int i = data.length - 1; i > 0; i--) {
         counter++;
         swap(data, i, 0);
         heapify(data, 0, i);
         if (print) {
            System.out.println("Durchlauf " + counter + ": " + Arrays.toString(data));
         }
      }
   }

   private static void buildMaxHeap(int[] data) {
      for (int i = (data.length / 2) - 1; i >= 0; i--) {
         heapify(data, i, data.length);
      }
   }

   private static void swap(int[] data, int i, int childNodeIndex) {
      int k = data[i];
      data[i] = data[childNodeIndex];
      data[childNodeIndex] = k;
   }

   private static void heapify(int[] data, int i, int j) {
      while (i <= (j / 2) - 1) {
         int childNodeIndex = ((i + 1) * 2) - 1;
         if (childNodeIndex + 1 <= j - 1) {
            if (data[childNodeIndex] < data[childNodeIndex + 1]) {
               childNodeIndex++;
            }
         }
         if (data[i] < data[childNodeIndex]) {
            swap(data, i, childNodeIndex);
            i = childNodeIndex;
         } else {
            break;
         }
      }
   }

}
