package main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

/**
 * Switch-Ausdruecke, die Klasse Random und die Klassen LocalDateTime/LocalDate/LocalTime
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class W010_SwitchExpressionsAndRandomsAndDates {

  public static void main(String[] args) {

    LocalDateTime now = LocalDateTime.now();
    System.out.println("Jahr: " + now.getYear());
    System.out.println("Monat: " + now.getMonth());
    System.out.println("Tag: " + now.getDayOfMonth());

    Random random = new Random();
    for (int i = 0; i < 1000; i++) {
      int month = random.nextInt(12) + 1;

      LocalDate date = LocalDate.of(2023, month, 1);

      /* klassische Switch-Anweisung */
      String season;
      switch (month) {
        case 12:
        case 1:
        case 2:
          season = "Winter";
          break;
        case 3:
        case 4:
        case 5:
          season = "Fruehling";
          break;
        case 6:
        case 7:
        case 8:
          season = "Sommer";
          break;
        case 9:
        case 10:
        case 11:
          season = "Herbst";
          break;
        default:
          season = "";
          break;
      }

      /* Switch-Ausdruck */
      season = switch (month) {
        case 12, 1, 2 -> "Winter";
        case 3, 4, 5 -> "Fruehling";
        case 6, 7, 8 -> "Sommer";
        case 9, 10, 11 -> "Herbst";
        default -> "";
      };

      System.out.println(date.getMonth() + " -> " + season);
    }

  }

}
