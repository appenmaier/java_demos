package main;

/**
 * Bitweise Operatoren
 *
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class D090_BitwiseOperators {

  public static void main(String[] args) {

    byte b1 = 43;
    byte b2 = 12;
    byte b3;

    b3 = (byte) (b1 & b2);
    System.out.println("b3:" + b3);

    b3 = (byte) (b1 | b2);
    System.out.println("b3:" + b3);

    b3 = (byte) (b1 ^ b2);
    System.out.println("b3:" + b3);

    b3 = (byte) ~b1;
    System.out.println("b3:" + b3);

  }

}
