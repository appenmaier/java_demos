package main;

/**
 * Data Objects
 *
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class D040_DataObjects {

   /* Konstanten */
   final static double PI = 3.14159265359;

   @SuppressWarnings("unused")
   public static void main(String[] args) {
      /* Deklaration */
      int i;
      String name, firstName, familyName, fullName, firstNameAndFamilyName;
      double sizeInM;

      /* Initialisierung */
      i = 5;
      name = "Hans Peter";
      sizeInM = 1.79;
      char gender = 'M';

      System.out.println("i: " + i);
      System.out.println("name: " + name);
      System.out.println("sizeInM: " + sizeInM);
      System.out.println("gender: " + gender);

      /* Wertzuweisungen */
      i = 7;
      gender = 'W';

      /* Unveränderliche Datenobjekte */
      final String text = "Java";
      // text = "Python"; // Syntaxfehler
   }

}
