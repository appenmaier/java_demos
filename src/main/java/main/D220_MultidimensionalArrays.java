package main;

/**
 * Multidimensional Arrays
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class D220_MultidimensionalArrays {

   public static void main(String[] args) {
      // Deklaration und Initialisierung
      String[][] sheet = new String[5][10];

      // Zugriff auf mehrere Feld-Elemente
      for (int i = 0; i < sheet.length; i++) {
         for (int j = 0; j < sheet[i].length; j++) {
            sheet[i][j] = i + "-" + j;
            System.out.printf("[%2s] ", sheet[i][j]);
         }
         System.out.println();
      }
   }

}
