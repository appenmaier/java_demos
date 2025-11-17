package main;

import java.util.Locale;

/**
 * Console Outputs
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

      System.out.println();

      /* printf-Methode */
      // Aufbau einer Formatierungsregel: %[flags][width][.precision]conversion-character

      // String-Formatierungen
      String text = "Hallo";
      String name = "Hans";
      System.out.printf("%s %s%n", text, name);
      System.out.printf("%S %S%n", text, name); // Großbuchstabenkonvertierung
      System.out.printf("%20s %s%n", text, name); // Festlegen der Ausgabelänge
      System.out.printf("%-20s %s%n", text, name); // linksbündige Ausgabe

      System.out.println();

      // Dezimalzahlen-Formatierungen
      System.out.println(1_000_000_000);
      System.out.printf("%,d%n", 1_000_000_000); // Festlegen des Tausendertrennzeichens
      System.out.printf(Locale.JAPAN, "%,d%n", 1_000_000_000);

      System.out.println();

      // Gleitkommazahlen-Formatierungen
      System.out.printf("%.2f%n", 3.817263532); // Festlegen der Genauigkeit

      System.out.println();

      System.out.printf("%-10s %s%n", "Name", "Note");
      System.out.printf("%-10s %.1f%n", "Hans", 1.5);
      System.out.printf("%-10s %.1f%n", "Peter", 3.0);
      System.out.printf("%-10s %.1f%n", "Lisa", 2.25);
   }

}
