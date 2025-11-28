package main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Important Java Classes
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D_INF_ImportantJavaClasses {

   public static void main(String[] args) {
      /* Konsolenausgaben (PrintStream) */
      printStream();
      System.out.println();

      /* Zeichenketten (String) */
      string();
      System.out.println();

      /* Mathematische Berechnungen (Math) */
      math();
      System.out.println();

      /* Pseudozufallszahlen (Random) */
      random();
      System.out.println();

      /* Konsoleneingaben (Scanner) */
      scanner();
      System.out.println();

      /* Listen (ArrayList, LinkedList, List) */
      list();
      System.out.println();

      /* Datums- und Zeitangaben (LocalDate, LocalTime, LocalDateTime) */
      localDateTime();
      System.out.println();

      /* Systemeigenschaften (System) */
      system();
   }

   public static void printStream() {
      double d = 3.1415926;

      System.out.println("d: " + d);
      System.out.print("d: " + d + "\n");
      System.out.printf("d: %.2f\n", d);
   }

   public static void string() {
      String firstName = "Hans";
      String lastName = "Maier";
      String fullName = firstName + " " + lastName;

      int length = fullName.length();
      System.out.println("length: " + length);

      char character = fullName.charAt(6);
      System.out.println("character: " + character);

      String fullNameInUpperCase = fullName.toUpperCase();
      System.out.println("fullNameInUpperCase: " + fullNameInUpperCase);
   }

   public static void math() {
      System.out.println("Math.sqrt(49): " + Math.sqrt(49));
      System.out.println("Math.PI: " + Math.PI);
      System.out.println("Math.sin(7): " + Math.sin(7));
   }

   public static void random() {
      Random random = new Random();

      for (int i = 0; i < 10; i++) {
         int randomNumber = random.nextInt(1, 7);
         System.out.println(randomNumber);
      }
   }

   @SuppressWarnings("resource")
   public static void scanner() {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Eine Zahl eingeben: ");
      int int1 = scanner.nextInt();
      System.out.println("int1: " + int1);

      System.out.print("Eine reelle Zahl eingeben: ");
      double double1 = scanner.nextDouble();
      System.out.println("double1: " + double1);

      System.out.print("Einen Boolschen Wahrheitswert eingeben: ");
      boolean boolean1 = scanner.nextBoolean();
      System.out.println("boolean1: " + boolean1);

      System.out.print("Ein einzelnes Zeichen eingeben: ");
      char char1 = scanner.next().charAt(0);
      System.out.println("char1: " + char1);

      System.out.print("Ein Wort eingeben: ");
      String string1 = scanner.next();
      System.out.println("string1: " + string1);

      System.out.print("Beliebig viele Wörter eingeben: ");
      scanner.nextLine();
      String string2 = scanner.nextLine();
      System.out.println("string2: " + string2);
   }

   public static void list() {
      List<String> names = new ArrayList<>(); // new LinkedList<>();

      names.add("Hans");
      names.add("Peter");
      names.add("Lisa");
      names.add(1, "Fritz");

      int size = names.size();
      System.out.println("size: " + size);

      for (int i = 0; i < names.size(); i++) {
         String name = names.get(i);
         System.out.println("name: " + name);
      }

      for (String name : names) {
         System.out.println("name: " + name);
      }
   }

   public static void localDateTime() {
      LocalDateTime now = LocalDateTime.now();
      System.out.println("Jahr: " + now.getYear());
      System.out.println("Monat: " + now.getMonth());
      System.out.println("Tag: " + now.getDayOfMonth());
      System.out.println("Stunde: " + now.getHour());
      System.out.println("Minute: " + now.getMinute());
      System.out.println("Sekunde: " + now.getSecond());

      LocalDate silvester = LocalDate.of(2025, 12, 31);
      System.out.println("Silvester: " + silvester);
   }

   public static void system() {
      System.out.println("File Separator: " + System.getProperty("file.separator"));
      System.out.println("User Work Directory: " + System.getProperty("user.dir"));
      System.out.println("User Home Directory: " + System.getProperty("user.home"));
   }

}
