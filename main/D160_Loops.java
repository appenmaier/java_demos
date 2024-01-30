package main;

/**
 * Schleifen
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D160_Loops {

  public static void main(String[] args) {

    /* while-Schleife (kopfgesteuerte Schleife) */
    int i = 1;

    while (i <= 10) {
      System.out.println(i);
      i++;
    }

    System.out.println();

    /* do/while-Schleife (fussgesteuerte Schleife) */
    int k = 1;

    do {
      System.out.println(k);
      k++;
    } while (k <= 10);

    System.out.println();

    /* for-Schleife (Zaehlschleife) */
    for (int m = 1; m <= 10; m++) {
      System.out.println(m);
    }

    String text = "Hello World, how are u doing?";
    for (int m = 0; m < text.length(); m++) {
      System.out.println(m + ": " + text.charAt(m));
    }

    System.out.println("i: " + i);
    System.out.println("k: " + k);
    // System.out.println("m: " + m);

  }

}


