package util;

/**
 * Console Printer
 *
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class Printer {

   /**
    * Prints the string "Hello World"
    */
   public static void printHelloWorld() {
      System.out.println("Hello World");
   }

   /**
    * Prints the given string
    *
    * @param text the string to be printed
    */
   public static void printText(String text) {
      System.out.println(text);
   }

   /**
    * Prints the given strings
    * 
    * @param texts ths strings to be printed
    */
   public static void printTexts(String[] texts) {
      for (int i = 0; i < texts.length; i++) {
         String text = texts[i];
         System.out.println(text);
      }
   }

   /**
    * Prints the given strings
    * 
    * @param texts ths strings to be printed
    */
   public static void printAll(String... texts) {
      for (int i = 0; i < texts.length; i++) {
         String text = texts[i];
         System.out.println(text);
      }
   }

}
