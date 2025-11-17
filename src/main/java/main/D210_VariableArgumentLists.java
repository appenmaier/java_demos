package main;

import util.Printer;

/**
 * Variable Argument Lists
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D210_VariableArgumentLists {

   public static void main(String[] args) {
      Printer.printText("Hans");
      Printer.printText("Peter");
      Printer.printText("Lisa");
      System.out.println();

      String names[] = {"Hans", "Peter", "Lisa"};
      Printer.printTexts(names);
      System.out.println();

      Printer.printAll("Hans", "Peter", "Lisa");
      System.out.println();
   }

}
