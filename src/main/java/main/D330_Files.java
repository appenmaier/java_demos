package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Person;

/**
 * Files
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D330_Files {

   public static void main(String[] args) throws FileNotFoundException {
      /* relevante Systemeigenschaften */
      System.out.println("File Separator: " + System.getProperty("file.separator"));
      System.out.println("User Work Directory: " + System.getProperty("user.dir"));
      System.out.println("User Home Directory: " + System.getProperty("user.home"));

      /* Absolute Pfadangaben */
      // File file = new File(System.getProperty("user.dir") +
      // "\\src\\main\\resources\\persons.txt");

      /* Relative Pfadangaben */
      File file = new File("src/main/resources/persons.txt"); // relative Pfadangabe

      /* Zeichenbasiertes Lesen von Dateien */
      ArrayList<Person> persons = new ArrayList<>();

      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()) {
         String line = scanner.nextLine();
         String[] tokens = line.split(";");
         String name = tokens[0];
         int age = Integer.valueOf(tokens[1]);
         char gender = tokens[2].charAt(0);
         Person p = new Person(name, age, gender);
         persons.add(p);
      }
      scanner.close();

      for (Person p : persons) {
         System.out.println(p);
      }
   }

}
