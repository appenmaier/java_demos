package main;

/**
 * Typumwandlungen
 *
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class D060_TypeCasting {

   public static void main(String[] args) {

      // Reihenfolge: byte->short->int->long->float->double

      // Erweiternde Typumwandlung / Implizite Typwandlung (type promotion)
      byte b1 = 42; // 42 (00101010)
      short s1 = b1; // 42 (00000000 00101010)
      int i1 = b1; // 42 (00000000 00000000 00000000 00101010)
      long l1 = b1; // 42 (00000000 00000000 00000000 00000000 00000000 00000000 00000000 00101010)
      float f1 = b1; // 42.0 (01000010 00101000 00000000 00000000)
      double d1 = b1; // 42.0 (01000000 01000101 00000000 00000000 00000000 00000000 00000000
                      // 00000000)

      System.out.println("b1: " + b1);
      System.out.println("s1: " + s1);
      System.out.println("i1: " + i1);
      System.out.println("l1: " + l1);
      System.out.println("f1: " + f1);
      System.out.println("d1: " + d1);

      System.out.println();

      // Einschraenkende Typumwandlung / Explizite Typumwandlung (type demotion)
      double d2 = 1.9; // 1.9 (00111111 11111110 01100110 01100110 01100110 01100110 01100110
                       // 01100110)
      float f2 = (float) d2; // 1.9 (00111111 11110011 00110011 00110011)
      long l2 = (long) d2; // 1 (00000000 00000000 00000000 00000000 00000000 00000000 00000000
                           // 00000001)
      int i2 = (int) d2; // 1 (00000000 00000000 00000000 00000001)
      short s2 = (short) d2; // 1 (00000000 00000001)
      byte b2 = (byte) d2; // 1 (00000001)

      System.out.println("d2: " + d2);
      System.out.println("f2: " + f2);
      System.out.println("l2: " + l2);
      System.out.println("i2: " + i2);
      System.out.println("s2: " + s2);
      System.out.println("b2: " + b2);

      System.out.println();

      // Typumwandlung char <-> int
      int i3 = 'A';
      System.out.println("i3: " + i3);

      char c1 = 65;
      System.out.println("c1: " + c1);

      char c2 = (char) 65L;
      System.out.println("c2: " + c2);

      char c3 = (char) 1000000;
      System.out.println("c3: " + c3);

      int i4 = c3;
      System.out.println("i4: " + i4);

      // Erweiterung des "Vorzeichenbits"
      byte b3 = (byte) 128; // Binaer: 10000000
      System.out.println("b3:" + b3); // Ergebnis: -128

      int i5 = b3; // Binaer: 11111111 11111111 11111111 10000000
      System.out.println("i5:" + i5); // Ergebnis: -128

   }

}
