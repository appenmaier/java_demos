package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Zeichenorientiertes Lesen
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D550_CharacterBasedReading {

   public static void main(String[] args) {

      File file = new File("resources/persons.txt");

      try (FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader)) {
         String line;
         while ((line = bufferedReader.readLine()) != null) {
            String[] tokens = line.split(";");
            String name = tokens[0];
            int age = Integer.valueOf(tokens[1]);
            char gender = tokens[2].charAt(0);
            System.out.println("name: " + name);
            System.out.println("age: " + age);
            System.out.println("gender: " + gender);
         }
      } catch (IOException e) {
         e.printStackTrace();
      }

   }

}
