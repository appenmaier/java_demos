package main;

import java.util.Scanner;

/**
 * Einfachverzweigungen
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D130_IfCases {

  @SuppressWarnings("resource")
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int age;

    System.out.print("Bitte gib Dein Alter ein: ");
    age = sc.nextInt();

    /* Einfachverzweigung */
    if (age >= 18) {
      System.out.println("Du bist volljährig");
    } else {
      System.out.println("Du bist minderjährig");
    }

    /*
     * Vergleichsoperatoren: != (ungleich), == (gleich), > (groesser), >= (groessergleich), <
     * (kleiner), <= (kleinergleich)
     */
    /*
     * Logische Operatoren: && (logisches Und), || (logisches Oder), ! (logische Verneinung)
     */

    /* Verschachtelte Verzweigungen */
    if (age < 12) {
      System.out.println("Du bist ein Kind");
    } else if (age < 18) {
      System.out.println("Du bist ein:e Jugendliche:r");
    } else {
      System.out.println("Du bist ein:e Erwachsene:r");
    }

    /* Vergleich von Zeichenketten */
    System.out.print("Bitte gib \"true\" ein: ");
    String text = sc.next();
    if (text.equals("true")) {
      System.out.println("Du hast \"true\" eingegeben");
    } else {
      System.out.println("Du hast nicht \"true\" eingegeben");
    }

  }

}
