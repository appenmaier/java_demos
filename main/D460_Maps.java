package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import model.Student;

/**
 * Assoziativspeicher (Maps)
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D460_Maps {

  public static void main(String[] args) {

    HashMap<Student, Double> studentsWithGrade = new HashMap<>();
    HashMap<Student, ArrayList<Double>> studentWithGrades = new HashMap<>();

    /* Werte setzen */
    studentsWithGrade.put(new Student("8172645"), 2.4);
    studentsWithGrade.put(new Student("9192360"), 4.1);
    studentsWithGrade.put(new Student("1293700"), 1.2);
    studentsWithGrade.put(new Student("2715347"), 5.0);
    studentsWithGrade.put(new Student("6729385"), 1.8);
    studentsWithGrade.put(new Student("7162509"), 2.8);

    studentWithGrades.put(new Student("8271632"), new ArrayList<>(List.of(1.2, 3.4, 2.5)));
    studentWithGrades.put(new Student("9172543"), new ArrayList<>(List.of(2.8, 3.2, 2.7)));

    /* Werte lesen */
    System.out.println(studentsWithGrade.get(new Student("6729385")));
    System.out.println(studentsWithGrade.get(new Student("8216324")));

    /* Inhalte pruefen */
    System.out.println(studentsWithGrade.containsKey(new Student("6729385")));
    System.out.println(studentsWithGrade.containsValue(1.8));

    /* Werte ueberschreiben */
    System.out.println(studentsWithGrade.put(new Student("6729385"), 1.7));
    System.out.println(studentsWithGrade.get(new Student("6729385")));

    /* Datensammlung: Die Menge aller Schluessel */
    for (Student s : studentsWithGrade.keySet()) {
      System.out.println(s.getMatriculationNumber() + " [ ]");
    }
    System.out.println();

    /* Datensammlung: Alle Werte */
    double total = 0;
    int size = 0;
    for (Double d : studentsWithGrade.values()) {
      total += d;
      size++;
    }
    System.out.println(total / size);
    System.out.println();

    /* Datensammlung: Die Menge aller Eintraege (Schluessel-Wert-Paare) */
    for (Entry<Student, Double> entry : studentsWithGrade.entrySet()) {
      Student student = entry.getKey();
      Double grade = entry.getValue();
      System.out.println(student.getMatriculationNumber() + ": " + grade);
    }
    System.out.println();

    for (Entry<Student, ArrayList<Double>> entry : studentWithGrades.entrySet()) {
      Student student = entry.getKey();
      ArrayList<Double> values = entry.getValue();
      System.out.println(student.getMatriculationNumber());
      for (Double v : values) {
        System.out.println(v);
      }
      System.out.println();
    }

    /* Die forEach-Methode */
    studentsWithGrade.forEach(
        (student, grade) -> System.out.println(student.getMatriculationNumber() + ": " + grade));

  }

}
