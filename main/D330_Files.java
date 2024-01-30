package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import model.Person;

/**
 * Arbeiten mit Dateien
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D330_Files {

  public static void main(String[] args) throws FileNotFoundException {

    /* relevante Systemeigenschaften */
    String fileSeparator = System.getProperty("file.separator");
    System.out.println("fileSeparator: " + fileSeparator);
    String userWorkDirectory = System.getProperty("user.dir");
    System.out.println("userWorkDirectory: " + userWorkDirectory);
    String userHomeDirectory = System.getProperty("user.home");
    System.out.println("userHomeDirectory: " + userHomeDirectory);

    /* Absolute Pfadangaben */
    // File file = new File(userWorkDirectory + "\\src\\resources\\persons.txt");

    /* Relative Pfadangaben */
    File file = new File("src/resources/persons.txt"); // relative Pfadangabe

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

    for (int i = 0; i < persons.size(); i++) {
      System.out.println(persons.get(i).toString());
    }

    scanner.close();

  }

}
