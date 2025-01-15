package main;

/**
 * Rekursive Methoden
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class D180_RecursiveMethods {

   public static int calculateFactorialIterative(int n) {
      int x = 1;
      for (int i = 2; i <= n; i++) {
         x = x * i;
      }
      return x;
   }

   public static int calculateFactorialRecursive(int n) {
      if (n <= 1) {
         return 1;
      } else {
         return n * calculateFactorialRecursive(n - 1);
      }
   }

   public static void main(String[] args) {

      System.out.println(calculateFactorialIterative(9));
      System.out.println(calculateFactorialRecursive(9));

   }

}
