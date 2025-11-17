package main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * Java API
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D320_JavaApi {

   public static void main(String[] args) {
      /* Zeichenkettenverarbeitung (String) */
      String text = "Hans;Peter;Lisa";
      String[] names = text.split(";");
      for (int i = 0; i < names.length; i++) {
         System.out.println(names[i]);
      }
      System.out.println();

      /* Wrapper-Klassen (Boolean, Double, Integer) */
      String numberText = "-42";
      Integer number1 = Integer.valueOf(numberText);
      int number2 = Integer.parseInt(numberText);

      ArrayList<Integer> numbers = new ArrayList<>();
      numbers.add(number1);
      numbers.add(number2);
      System.out.println(numbers);

      System.out.println("number1 (unsigned): " + Integer.toUnsignedLong(number1));
      System.out.println();

      /* Datums- und Zeitangaben (System, LocalDate, LocalTime, LocalDateTime) */
      long timeInMillis = System.currentTimeMillis();
      System.out.println("timeInMillis: " + timeInMillis);

      LocalDateTime now = LocalDateTime.now();
      LocalDate silvester = LocalDate.of(now.getYear(), 12, 31);

      System.out.println("now: " + now);
      System.out
            .println("silvester (formatted): " + silvester.format(DateTimeFormatter.ISO_WEEK_DATE));
      System.out.println("now.getDayOfYear(): " + now.getDayOfYear());
      System.out.println("now.getMonth(): " + now.getMonth());
      System.out.println("silvester.getDayOfWeek(): " + silvester.getDayOfWeek());
   }

}
