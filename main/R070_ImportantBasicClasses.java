package main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Wichtige Standardklassen
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class R070_ImportantBasicClasses {

  @SuppressWarnings("resource")
  public static void main(String[] args) {

    /* String */
    String firstName = "Hans";
    String lastName = "Maier";
    String fullName = firstName + " " + lastName;

    int length = fullName.length();
    System.out.println("length: " + length);

    char character = fullName.charAt(6);
    System.out.println("character: " + character);

    String fullNameInUpperCase = fullName.toUpperCase();
    System.out.println("fullNameInUpperCase: " + fullNameInUpperCase);

    /* PrintStream */
    int x = 42;
    System.out.println("x: " + x);
    System.out.print("x: " + x + "\n");
    System.out.printf("x: %s\n", x);

    /* Math */
    System.out.println("Math.sqrt(49): " + Math.sqrt(49));

    /* Random */
    Random random = new Random();
    for (int i = 0; i < 10; i++) {
      int randomNumber = random.nextInt(1, 7);
      System.out.println("randomNumber: " + randomNumber);
    }

    /* Scanner */
    Scanner scanner = new Scanner(System.in);

    System.out.print("Zahl eingeben: ");
    int int1 = scanner.nextInt();
    System.out.println("int1: " + int1);

    System.out.print("Kommazahl eingeben: ");
    double double1 = scanner.nextDouble();
    System.out.println("double1: " + double1);

    System.out.print("Wahrheitswert eingeben: ");
    boolean boolean1 = scanner.nextBoolean();
    System.out.println("boolean1: " + boolean1);

    System.out.print("Zeichen eingeben: ");
    char char1 = scanner.next().charAt(0);
    System.out.println("char1: " + char1);

    System.out.print("Zeichenkette eingeben: ");
    String string1 = scanner.next();
    System.out.println("string1: " + string1);

    /* ArrayList */
    ArrayList<String> names = new ArrayList<>();

    names.add("Hans");
    names.add("Peter");
    names.add("Lisa");
    names.add(1, "Fritz");

    int size = names.size();
    System.out.println("size: " + size);

    for (int i = 0; i < names.size(); i++) {
      String name = names.get(i);
      System.out.println("name: " + name);
    }

    for (String name : names) {
      System.out.println("name: " + name);
    }

  }

}
