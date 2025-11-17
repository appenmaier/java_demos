package main;

/**
 * Type Casting
 *
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class D060_TypeCasting {

   public static void main(String[] args) {
      /* Erweiternde Typumwandlung (Type Promotion) */
      byte b1 = 42;
      short s1 = b1;
      int i1 = b1;
      long l1 = b1;
      float f1 = b1;
      double d1 = b1;

      System.out.println(
            b1 + ": " + String.format("%8s", Integer.toBinaryString(b1)).replace(" ", "0"));
      System.out.println(
            s1 + ": " + String.format("%16s", Integer.toBinaryString(s1)).replace(" ", "0"));
      System.out.println(
            i1 + ": " + String.format("%32s", Integer.toBinaryString(i1)).replace(" ", "0"));
      System.out
            .println(l1 + ": " + String.format("%64s", Long.toBinaryString(l1)).replace(" ", "0"));
      System.out.println(
            f1 + ": " + String.format("%32s", Integer.toBinaryString(Float.floatToIntBits(f1)))
                  .replace(" ", "0"));
      System.out.println(
            d1 + ": " + String.format("%64s", Long.toBinaryString(Double.doubleToLongBits(d1)))
                  .replace(" ", "0"));

      System.out.println();

      /* Einschränkende Typumwandlung (Type Demotion) */
      double d2 = 1.9;
      float f2 = (float) d2;
      long l2 = (long) f2;
      int i2 = (int) l2;
      short s2 = (short) i2;
      byte b2 = (byte) s2;

      System.out.println(
            d2 + ": " + String.format("%64s", Long.toBinaryString(Double.doubleToLongBits(d2)))
                  .replace(" ", "0"));
      System.out.println(
            f2 + ": " + String.format("%32s", Integer.toBinaryString(Float.floatToIntBits(f2)))
                  .replace(" ", "0"));
      System.out
            .println(l2 + ": " + String.format("%64s", Long.toBinaryString(l2)).replace(" ", "0"));
      System.out.println(
            i2 + ": " + String.format("%32s", Integer.toBinaryString(i2)).replace(" ", "0"));
      System.out.println(
            s2 + ": " + String.format("%16s", Integer.toBinaryString(s2)).replace(" ", "0"));
      System.out.println(
            b2 + ": " + String.format("%8s", Integer.toBinaryString(b2)).replace(" ", "0"));

      System.out.println();

      /* Typumwandlung char <-> int */
      int i3 = 'A';
      char c1 = 65;
      char c2 = (char) 65L;

      System.out.println("i3: " + i3);
      System.out.println("c1: " + c1);
      System.out.println("c2: " + c2);

      System.out.println();

      /* Erweiterung des "Vorzeichenbits" */
      byte b3 = (byte) 128;

      System.out.println(
            b3 + ": " + String.format("%8s", Integer.toBinaryString(b3)).replace(" ", "0"));
   }

}
