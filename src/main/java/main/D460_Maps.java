package main;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import model.Exam;
import model.Student;

/**
 * Maps
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D460_Maps {

   public static void main(String[] args) {
      Map<Student, Exam> studentsWithExam = new HashMap<>();

      /* Werte setzen */
      LocalDate today = LocalDate.now();
      studentsWithExam.put(new Student("1", "Hans"), new Exam(today, 2.4));
      studentsWithExam.put(new Student("2", "Peter"), new Exam(today, 4.3));
      studentsWithExam.put(new Student("3", "Lisa"), new Exam(today, 1.7));
      studentsWithExam.put(new Student("4", "Max"), new Exam(today, 2.0));
      studentsWithExam.put(new Student("5", "Heidi"), new Exam(today, 1.1));
      studentsWithExam.put(new Student("6", "Peter"), new Exam(today, 3.9));

      /* Werte lesen */
      System.out.println("Klausur 2-Peter: " + studentsWithExam.get(new Student("2", "Peter")));
      System.out.println("Klausur 6-Peter: " + studentsWithExam.get(new Student("6", "Peter")));
      System.out.println();

      /* Inhalte prüfen */
      System.out.println("5-Heidi: " + studentsWithExam.containsKey(new Student("5", "Heidi")));
      System.out.println("Today-2,0: " + studentsWithExam.containsValue(new Exam(today, 2.0)));
      System.out.println();

      /* Werte überschreiben */
      System.out.println("Alte Klausur 3-Lisa: "
            + studentsWithExam.put(new Student("3", "Lisa"), new Exam(today, 1.5)));
      System.out.println("neue Klausur 3-Lisa: " + studentsWithExam.get(new Student("3", "Lisa")));
      System.out.println();

      /* Werte ausgeben */
      System.out.println(studentsWithExam);
      studentsWithExam.forEach((s, e) -> System.out.println(s + "=" + e));
      System.out.println();

      /* Datensammlung: Die Menge aller Schlüssel */
      System.out.println("Anwesenheitsliste");
      for (Student s : studentsWithExam.keySet()) {
         System.out.printf("%-10s [ ]%n", s.getName());
      }
      System.out.println();

      /* Datensammlung: Alle Werte */
      double total = 0;
      int counter = 0;
      for (Exam e : studentsWithExam.values()) {
         total += e.getGrade();
         counter++;
      }
      System.out.println("Durchschnittsnote: " + total / counter);
      System.out.println();

      /* Datensammlung: Die Menge aller Einträge bzw. aller Schlüssel-Wert-Paare */
      System.out.println("Notenliste");
      for (Entry<Student, Exam> entry : studentsWithExam.entrySet()) {
         Student student = entry.getKey();
         Exam exam = entry.getValue();
         System.out.println(student.getId() + ": " + exam.getGrade());
      }
      System.out.println();

      /* Probleme der TreeMap */
      studentsWithExam = new TreeMap<>(studentsWithExam);

      studentsWithExam.forEach((s, e) -> System.out.println(s + "=" + e));
      System.out.println("Klausur 2-Peter: " + studentsWithExam.get(new Student("2", "Peter")));
      System.out.println("Klausur 6-Peter: " + studentsWithExam.get(new Student("6", "Peter")));
      System.out.println("Klausur 0-Peter: " + studentsWithExam.get(new Student("0", "Peter")));
   }

}
