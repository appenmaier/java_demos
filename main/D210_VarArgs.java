package main;

/**
 * Variable Argumentlisten (VarArgs)
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D210_VarArgs {

   public static void main(String[] args) {

      D210_VarArgs.print("Hans");
      D210_VarArgs.print("Peter");
      D210_VarArgs.print("Lisa");

      D210_VarArgs.printAll("Hans");
      D210_VarArgs.printAll("Hans", "Peter", "Lisa");

   }

   public static void print(String text) {
      System.out.println(text);
   }

   public static void printAll(String... texts) {
      for (int i = 0; i < texts.length; i++) {
         D210_VarArgs.print(texts[i]);
      }
   }

}
