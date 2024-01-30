package main;

import java.io.IOException;
import java.util.Arrays;

/**
 * Standard-Ein- und Ausgabestroeme
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D530_DefaultIOStreams {

  public static void main(String[] args) {

    /* Der Standard-Eingabestrom System.in */
    System.out.print("Eingabe: ");
    try {
      byte[] input = new byte[50];
      int noBytes = System.in.read(input);
      String output = new String(input);
      System.out.println("Eingabe: " + input);
      System.out.println("Anzahl Bytes: " + noBytes);
      System.out.println("Eingabe (als String): " + Arrays.toString(input));
      System.out.println("Ausgabe: " + output);
    } catch (IOException e) {
      e.printStackTrace();
    }

    /* Der Standard-Ausgabestrom System.out */
    System.out.println("Hello World");

  }

}
