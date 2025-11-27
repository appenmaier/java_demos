package main;

import java.util.Arrays;
import java.util.Random;

import model.BinarySearch;
import model.InterpolationSearch;
import model.LinearSearch;

/**
 * Searching Algorithms
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D570_SearchingAlgorithms {

   public static void main(String[] args) {
      int numberOfValues = 1000;
      int[] data = new int[numberOfValues];

      Random random = new Random();

      for (int i = 0; i < numberOfValues; i++) {
         data[i] = random.nextInt(numberOfValues * 10) + 1;
      }
      int key = data[random.nextInt(numberOfValues)];
      Arrays.sort(data);

      System.out.println("Suchwert: " + key);
      System.out.println();

      System.out.println("Linearsuche");
      System.out.println("Index: " + LinearSearch.linearSearch(key, data) + ", Durchläufe: "
            + LinearSearch.getCounter());
      System.out.println();

      System.out.println("Binärsuche");
      System.out.println("Index: " + BinarySearch.binarySearch(key, data) + ", Durchläufe: "
            + BinarySearch.getCounter());
      System.out.println();

      System.out.println("Interpolationssuche");
      System.out.println("Index: " + InterpolationSearch.interpolationSearch(key, data)
            + ", Durchläufe: " + InterpolationSearch.getCounter());
   }

}
