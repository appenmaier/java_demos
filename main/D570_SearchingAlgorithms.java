package main;

import java.util.Arrays;
import java.util.Random;
import model.BinarySearch;
import model.InterpolationSearch;
import model.LinearSearch;

/**
 * Suchalgorithmen
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D570_SearchingAlgorithms {

  public static void main(String[] args) {

    int noValues = 100000;
    int[] data = new int[noValues];

    Random random = new Random();

    for (int i = 0; i < noValues; i++) {
      data[i] = random.nextInt(noValues * 10) + 1;
    }
    int key = data[random.nextInt(noValues)];
    Arrays.sort(data);

    System.out.println("Suchwert: " + key);
    System.out.println();

    System.out.println("Linearsuche");
    System.out.println("Index: " + LinearSearch.linearSearch(key, data) + " Zaehler: "
        + LinearSearch.getCounter());
    System.out.println();

    System.out.println("Binaersuche");
    System.out.println("Index: " + BinarySearch.binarySearch(key, data) + " Zaehler: "
        + BinarySearch.getCounter());
    System.out.println();

    System.out.println("Interpolationssuche");
    System.out.println("Index: " + InterpolationSearch.interpolationSearch(key, data) + " Zaehler: "
        + InterpolationSearch.getCounter());

  }

}
