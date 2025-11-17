package main;

/**
 * Arithmetic Operators
 *
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class D080_ArithmeticOperators {

   public static void main(String[] args) {
      /* Grundrechenoperationen */
      int a = 5, b = 3;

      int c1 = a + b; // Addition
      int c2 = a - b; // Subtraktion
      int c3 = a * b; // Multiplikation
      int c4 = a / b; // Ganzzahlige Division (Quotient)
      int c5 = a % b; // Ganzzahlige Division (Divisionrest)
      double c6 = (double) a / b; // Division

      System.out.println("c1: " + c1);
      System.out.println("c2: " + c2);
      System.out.println("c3: " + c3);
      System.out.println("c4: " + c4);
      System.out.println("c5: " + c5);
      System.out.println("c6: " + c6);

      /* Inkrement */
      int c = 0;
      c = c + 1;
      c += 1;
      c++;

      System.out.println("c: " + c);

      /* Dekrement */
      c = 0;
      c = c - 1;
      c -= 1;
      c--;

      System.out.println("c: " + c);

      /* Postinkrement vs. Preinkrement */
      c = a++;
      System.out.println("a: " + a);
      System.out.println("c: " + c);

      c = ++a;
      System.out.println("a: " + a);
      System.out.println("c: " + c);

      /* Teilen durch Null */
      double d1 = 1.0 / 0.0;
      double d2 = 1.0 / -0.0;
      double d3 = 0.0 / 0.0;
      double d4 = 0.0 / -0.0;
      // double d5 = 1 / 0;
      // double d6 = 1 / -0;

      System.out.println("d1: " + d1); // Infinity
      System.out.println("d2: " + d2); // -Infinity
      System.out.println("d3: " + d3); // NaN
      System.out.println("d4: " + d4); // NaN
      // System.out.println("d5: " + d5); // ArithmeticException
      // System.out.println("d6: " + d6); // ArithmeticException
   }

}
