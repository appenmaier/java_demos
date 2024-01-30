package main;

import java.util.Random;

/**
 * Pseudozufallszahlen und Mathematische Berechnungen
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D100_CalculationsAndPseudoRandomNumbers {

  public static void main(String[] args) {

    /* Mathematische Berechnungen mit Hilfe der Klasse Math */
    double result = Math.sqrt(64);
    System.out.println("result: " + result);

    /* Pseudozufallszahlen */
    int randomNumber;

    randomNumber = (int) (Math.random() * 100) + 1;
    System.out.println("randomNumber: " + randomNumber);

    Random rd = new Random();
    randomNumber = rd.nextInt(100) + 1;
    System.out.println("randomNumber: " + randomNumber);

  }

}
