package main;

/**
 * Herausforderungen beim Arbeiten mit Feldern
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D230_ArrayChallenges {

  public static void main(String[] args) {

    // Herausforderung: Feldgroesse?
    String[] names;
    // Loesung: Feld "ueberdimensionieren"
    names = new String[5];

    // Herausforderung: "null"-Werte
    names[0] = "Hans";
    names[4] = "Peter";

    // Loesung: "null"-Werte ueberspringen / ignorieren
    for (int i = 0; i < names.length; i++) {
      if (names[i] != null) {
        String name = names[i];
        System.out.println(name.length());
      }
    }

    // Herausforderung: Feldgroesse zu gering
    names[1] = "Lisa";
    names[2] = "Heidi";
    names[3] = "Max";
    // names[?] = "Maria";

    // Loesung: Feld umkopieren
    String[] names2 = new String[names.length * 2];
    for (int i = 0; i < names.length; i++) {
      names2[i] = names[i];
    }
    names2[5] = "Maria";

    System.out.println(names);

  }

}
