package main;

/**
 * Procedural Programming
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D_INF_ProceduralProgramming {

   public static void main(String[] args) {
      /* Primitive Datentypen */
      primitiveDataTypes();
      System.out.println();

      /* Mathematische Operatoren und Typumwandlungen */
      arithmeticOperatorsAndCasting();
      System.out.println();

      /* Verzweigungen und Fallunterscheidungen */
      cases();
      System.out.println();

      /* Schleifen */
      loops();
      System.out.println();

      /* Felder (Arrays) */
      arrays();
      System.out.println();
   }

   public static void primitiveDataTypes() {
      /* Ganze Zahlen */
      byte b1 = 42;
      short s = 42;
      int i = 42;
      long l = 42;

      /* Gleitkommazahlen */
      float f = 4.99F;
      double d = 4.99;

      /* Zeichen */
      char c1 = 'A';
      char c2 = 65;
      char c3 = '\u0041';
      char c4 = 0b1000001;

      /* Boolscher Wahrheitswert */
      boolean b = true;

      System.out.println("b1: " + b1);
      System.out.println("s: " + s);
      System.out.println("i: " + i);
      System.out.println("l: " + l);
      System.out.println("f: " + f);
      System.out.println("d: " + d);
      System.out.println("c1: " + c1);
      System.out.println("c2: " + c2);
      System.out.println("c3: " + c3);
      System.out.println("c4: " + c4);
      System.out.println("b: " + b);
   }

   public static void arithmeticOperatorsAndCasting() {
      int result1 = 5 + 3;
      int result2 = 5 - 3;
      int result3 = 5 * 3;
      int result4 = 5 / 3;
      int result5 = 5 % 3;
      double result6 = (double) 5 / 3;

      int c = 0;
      c = c + 1;
      c += 1;
      c++;

      System.out.println("result1: " + result1);
      System.out.println("result2: " + result2);
      System.out.println("result3: " + result3);
      System.out.println("result4: " + result4);
      System.out.println("result5: " + result5);
      System.out.println("result6: " + result6);
      System.out.println("c: " + c);
   }

   public static void cases() {
      /* Verzweigungen */
      int age = 18;
      char gender = 'm';

      if ((gender == 'm' || gender == 'M') && (age >= 12 && age < 18)) {
         System.out.println("männlicher Teenager");
      } else if (gender == 'w') {
         System.out.println("weiblich");
      } else {
         System.out.println("divers, Junge oder Mann");
      }

      /* Bedingte Zuweisungen */
      boolean isAdult;
      if (age >= 18) {
         isAdult = true;
      } else {
         isAdult = false;
      }
      System.out.println("isAdult: " + isAdult);

      isAdult = age >= 18 ? true : false;
      System.out.println("isAdult: " + isAdult);

      /* Fallunterscheidungen */
      String genderText;
      if (gender == 'm' || gender == 'M') {
         genderText = "männlich";
      } else if (gender == 'w' || gender == 'W') {
         genderText = "weiblich";
      } else {
         genderText = "divers";
      }
      System.out.println("genderText: " + genderText);

      switch (gender) {
         case 'm':
         case 'M':
            genderText = "männlich";
            break;
         case 'w':
         case 'W':
            genderText = "weiblich";
            break;
         default:
            genderText = "divers";
            break;
      }
      System.out.println("genderText: " + genderText);

      genderText = switch (gender) {
         case 'm', 'M' -> "männlich";
         case 'w', 'W' -> "weiblich";
         default       -> "weiblich";
      };
      System.out.println("genderText: " + genderText);
   }

   public static void loops() {
      int x = 0;
      while (x < 5) {
         System.out.println("x: " + x);
         x++;
      }
      System.out.println();

      for (int i = 0; i < 10; i++) {
         if (i % 2 == 0) {
            continue; // break;
         }
         System.out.println("i: " + i);
      }
   }

   public static void arrays() {
      int[] numbers = new int[5];
      char[] characters = {'X', 'Y', 'Z'};

      numbers[0] = 4;
      numbers[numbers.length - 1] = 2;

      for (int i = 0; i < characters.length; i++) {
         System.out.println(characters[i]);
      }
   }

}
