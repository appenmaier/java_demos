package main;

import java.util.Scanner;

/**
 * Grundlegende Sprachelemente
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class T010_JavaBasics {

  /* Klassen (C/C++: Strukturen) */
  public static class Person {
    public int age;
    public char gender;
    public String name;
  }
  // C/C++: struct person {
  // char name[20];
  // int age;
  // char gender;
  // }

  /* Aufzaehlungen */
  public enum WeekDay {
    FRIDAY, MONDAY, SATURDAY, SUNDAY, THURSDAY, TUESDAY, WEDNESDAY;
  }
  // C/C++: enum { monday, tuesday, wednesday, thursday, friday, saturday, sunday };

  /* Konstanten (C/C++: Symbolische Konstanten) */
  public final static double PI = 3.14; // C/C++: #define PI 3.14;

  public static void arithmeticOperations() {
    int result1 = 5 + 3;
    int result2 = 5 - 3;
    int result3 = 5 * 3;
    int result4 = 5 / 3;
    int result5 = 5 % 3;
    double result6 = (double) 5 / 3;

    int c = 0;
    c = c + 1;
    c += 1;
    c++;

    System.out.println("result1: " + result1);
    System.out.println("result2: " + result2);
    System.out.println("result3: " + result3);
    System.out.println("result4: " + result4);
    System.out.println("result5: " + result5);
    System.out.println("result6: " + result6);
    System.out.println("c: " + c);
  }

  public static void arrays() {
    int[] numbers = new int[5]; // C/C++: int numbers[4];
    String[] names = {"Hans", "Peter", "Lisa"};
    numbers[0] = 4;
    System.out.println(names[names.length - 1]);
  }

  public static void cases() {
    /* Bedingte Anweisungen */
    int age = 18;
    char gender = 'm';

    // Logische Operatoren: &&, ||, !
    // Vergleichsoperatoren: >, <, >=, <=, !=, ==
    // Bedingungs-Operator: ?:
    if (gender == 'm' && (age >= 12 || age < 18)) {
      System.out.println("maennlicher Teenager");
    } else if (gender == 'w') {
      System.out.println("weiblich");
    } else {
      System.out.println("divers, Junge oder Mann");
    }

    boolean isAdult = age >= 18 ? true : false;
    System.out.println("isAdult: " + isAdult);

    /* Fallunterscheidungen */
    String genderText;
    if (gender == 'm' || gender == 'M') {
      genderText = "maennlich";
    } else if (gender == 'w' || gender == 'W') {
      genderText = "weiblich";
    } else {
      genderText = "divers";
    }
    System.out.println("genderText: " + genderText);

    switch (gender) {
      case 'm':
      case 'M':
        genderText = "maennlich";
        break;
      case 'w':
      case 'W':
        genderText = "weiblich";
        break;
      default:
        genderText = "divers";
        break;
    }
    System.out.println("genderText: " + genderText);

    genderText = switch (gender) {
      case 'm', 'M' -> "maennlich";
      case 'w', 'W' -> "weiblich";
      default -> "weiblich";
    };
    System.out.println("genderText: " + genderText);
  }

  @SuppressWarnings("resource")
  public static void io() {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Bitte eine ganze Zahl eingeben: ");
    int number = myScanner.nextInt();
    // C: int number;
    // printf("Bitte eine ganze Zahl eingeben: ");
    // scanf("%d", %number);
    // C++: int number;
    // cout << "Bitte eine ganze Zahl eingeben: ";
    // cin >> number;

    System.out.print("number: " + number + "\n");
    System.out.println("number: " + number);
    System.out.printf("number: %d%n", number);
  }

  public static void loops() {
    int j = 0;
    while (j < 5) {
      System.out.println("j: " + j);
      j++;
    }
    System.out.println();

    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        continue; // break;
      }
      System.out.println("i: " + i);
    }
  }

  @SuppressWarnings({"unused"})
  public static void main(String[] args) {

    /* Primitive Datentypen */
    primitiveDataTypes();
    System.out.println();

    /* Arithmetische Operatoren und Typumwandlungen */
    arithmeticOperations();
    System.out.println();

    /* Bedingte Anweisungen und Fallunterscheidungen */
    cases();
    System.out.println();

    /* Schleifen */
    loops();
    System.out.println();

    /* Zeichenketten */
    strings();
    System.out.println();

    /* Konsolenein- und ausgaben */
    io();
    System.out.println();

    /* Felder (Arrays) */
    arrays();
    System.out.println();

    /* Unveraenderliche Variablen */
    final String helloWorld = "Hello World"; // C/C++: const char helloWorld[] = "Hello World";

    /* Aufzaehlungen */
    WeekDay today = WeekDay.MONDAY; // C/C++: int today = monday;

    /* Objekte (C/C++: Strukturvariablen) */
    Person myPerson = new Person(); // C/C++: struct person myPerson;
    myPerson.name = "Max Maier"; // strcpy(myPerson.name, "Max Maier");
    myPerson.age = 42; // myPerson.age = 42;
    myPerson.gender = 'm'; // myPerson.gender = 'm';

  }

  public static void primitiveDataTypes() {
    /* Ganze Zahlen: byte, short, int, long */
    int i = 42;

    /* Gleitkommazahlen: float, double */
    double salaryInEuro = 2654.88;

    /* Boolscher Wahrheitswert */
    boolean isSuper = false;

    /* Zeichen */
    char a1 = 'A';
    char a2 = 65;
    char a3 = '\u0041';
    char a4 = 0b1000001;

    System.out.println("i: " + i); // C: printf("i: %d\n", i); // C++: cout << "i: " << i << endl;
    System.out.println("salaryInEuro: " + salaryInEuro);
    System.out.println("isSuper: " + isSuper);
    System.out.println("a1: " + a1);
    System.out.println("a2: " + a2);
    System.out.println("a3: " + a3);
    System.out.println("a4: " + a4);
  }

  public static void strings() {
    String names = "Max"; // C: char names[50] = "Max";

    int length = names.length(); // C: int length = strlen(names);

    names = names + ";Lisa;Peter"; // C/C++: strcat(names, ";Lisa;Peter");

    String[] tokens = names.split(";");
    // C/C++: char delimiter[] = ";";
    // char *token = strtok(names, delimiter);
    // while(token != NULL) {
    // printf("%s\n", token);
    // *token = strtok(NULL, delimiter);
    // }

    if (names.equals("Max;Lisa;Peter")) {
      System.out.println(true);
    }
    // C: if(strcmp(names, "Max;Lisa;Peter") == 0) {
    // printf(true);
    // }

    System.out.println("length: " + length);
    System.out.println("names: " + names);
    System.out.println("tokens: " + tokens);
  }

}
