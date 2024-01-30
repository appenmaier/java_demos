package main;

/**
 * Felder (Arrays)
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D190_Arrays {

  public static void main(String[] args) {

    /* Deklaration und Initialisierung von Feldern */
    String[] names = new String[3];
    int[] numbers = {6, 2, 8, 3, 2, 1, 9}; // new int[7]

    /* Zugriff auf Feld-Elemente */
    System.out.println("names.length: " + names.length);
    names[0] = "Hans";
    names[1] = "Peter";
    names[2] = "Lisa";

    System.out.println("numbers[3]: " + numbers[3]);
    System.out.println("numbers[numbers.length - 1]: " + numbers[numbers.length - 1]);
    // System.out.println("numbers[7]: " + numbers[7]);

    /* Sequentieller Zugriff */
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(i + ": " + numbers[i]);
    }

  }

}
