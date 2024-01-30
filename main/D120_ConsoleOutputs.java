package main;

import java.util.Locale;

/**
 * Konsolenausgaben mit Hilfe der print-Methoden
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class D120_ConsoleOutputs {

  public static void main(String[] args) {

    /* print- und println-Methoden */
    System.out.println("Text 1");
    System.out.print("Text 2");
    System.out.print("Text 3");
    System.out.println("Text 4");

    /* printf-Methode */
    // Aufbau einer Formatierungsregel: %[flags][width][.precision]conversion-character

    // String-Formatierungen (s)
    String text = "Hallo";
    String name = "Hans-Peter";
    System.out.printf("%s %s%n", text, name);
    System.out.printf("%S %S%n", text, name); // Großbuchstabenkonvertierung
    System.out.printf("%20s %s%n", text, name); // Festlegen der Ausgabelaenge
    System.out.printf("%-20s %s%n", text, name); // linksbuendige Ausgabe

    // Dezimalzahlen-Formatierungen (d)
    System.out.println(1000000000);
    System.out.printf("%,d%n", 1000000000); // Festlegen des Tausendertrennzeichens
    System.out.printf(Locale.JAPAN, "%,d%n", 1000000000);

    // Gleitkommazahlen-Formatierungen (f)
    System.out.printf("%.2f%n", 3.817263532); // Festlegen der Genauigkeit

  }

}
