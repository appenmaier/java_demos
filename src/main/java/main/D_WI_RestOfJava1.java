package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import model.VideoGame;
import model.VideoGameConsole;

/**
 * Rest of Java 1
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D_WI_RestOfJava1 {

   public static void main(String[] args) {
      /* Klassen: System, LocalDate, LocalTime, LocalDateTime */
      /* Sprachelement: Bedingte Zuweisungen */
      datesAndTimes();
      System.out.println();

      /* Klasse: Random */
      randoms();
      System.out.println();

      /* Sprachelement: Switch-Ausdruck */
      cases();
      System.out.println();

      /* Klassentyp: Enumerations */
      enumerations();
      System.out.println();

      /* Methoden: String toString(), boolean equals(obj: Object) und int hashCode() */
      objectMethods();
      System.out.println();

      /* Klassen: ArrayList, LinkedList, List */
      /* Sprachelement: For-Each-Schleife */
      lists();
      System.out.println();

      /* Klassen: Scanner, File, Wrappers */
      try {
         files();
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      }
   }

   public static void datesAndTimes() {
      /* Datums- und Zeitangaben */
      System.out.println(System.currentTimeMillis());

      LocalDateTime now = LocalDateTime.now();
      System.out.println("Jahr: " + now.getYear());
      System.out.println("Monat: " + now.getMonth());
      System.out.println("Tag: " + now.getDayOfMonth());
      System.out.println("Stunde: " + now.getHour());
      System.out.println("Minute: " + now.getMinute());
      System.out.println("Sekunde: " + now.getSecond());

      LocalDate christmasEve = LocalDate.of(2025, 12, 24);
      System.out.println("christmasEve: " + christmasEve);

      /* Bedingte Zuweisungen */
      // ausführliche Schreibweise
      boolean afternoon;
      if (now.getHour() >= 12) {
         afternoon = true;
      } else {
         afternoon = false;
      }
      System.out.println("afternoon: " + afternoon);

      // Kurzschreibweise
      afternoon = now.getHour() > 12 ? true : false;
      System.out.println("afternoon: " + afternoon);
   }

   public static void randoms() {
      Random random = new Random();

      for (int i = 0; i < 100; i++) {
         int randomNumber = random.nextInt(1, 7);
         System.out.println(randomNumber);
      }
   }

   public static void cases() {
      Random random = new Random();
      int month = random.nextInt(1, 13);
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
            season = "Frühling";
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
      System.out.println(date.getMonth() + ": " + season);

      /* Switch-Ausdruck */
      season = switch (month) {
         case 12, 1, 2  -> "Winter";
         case 3, 4, 5   -> "Frühling";
         case 6, 7, 8   -> "Sommer";
         case 9, 10, 11 -> "Herbst";
         default        -> "";
      };
      System.out.println(date.getMonth() + ": " + season);
   }

   public static void enumerations() {
      // VideoGameConsole console1 = new VideoGameConsole("Nintendo Switch");
      // VideoGameConsole console2 = new VideoGameConsole("Nintendo SWITCH");
      // VideoGameConsole console3 = new VideoGameConsole("NSW");
      VideoGameConsole console1 = VideoGameConsole.NSW;
      VideoGameConsole console2 = VideoGameConsole.NSW;
      VideoGameConsole console3 = VideoGameConsole.NSW;

      System.out.println(console1.equals(console2));
      System.out.println(console1.equals(console3));
      System.out.println(console1.description());
      System.out.println(console2.description());
      System.out.println(console3.description());
   }

   public static void objectMethods() {
      VideoGame game1 = new VideoGame("Hades", VideoGameConsole.NSW, "2020", 9.3);
      VideoGame game2 = new VideoGame("Hades", VideoGameConsole.NSW, "2020", 9.3);

      System.out.println(game1); // System.out.println(game1.toString());
      System.out.println(game2); // System.out.println(game1.toString());

      System.out
            .println(game1.hashCode() + " " + Integer.toHexString(System.identityHashCode(game1)));
      System.out
            .println(game2.hashCode() + " " + Integer.toHexString(System.identityHashCode(game2)));

      System.out.println(game1 == game2);
      System.out.println(game1.equals(game2));
   }

   public static void lists() {
      /* Liste deklarieren und initialisieren */
      List<VideoGame> videoGames = new ArrayList<>(); // new LinkedList<>();

      VideoGame game1 = new VideoGame("Hades", VideoGameConsole.NSW, "2020", 9.3);
      VideoGame game2 =
            new VideoGame("Uncharted 4: A Thief´s End", VideoGameConsole.PS4, "2016", 9.3);
      VideoGame game3 = new VideoGame("God of War", VideoGameConsole.PS4, "2018", 9.4);

      /* Einträge anfügen */
      videoGames.add(game1);
      videoGames.add(game2);
      videoGames.add(game3);

      /* Einträge sequentiell verarbeiten (klassische for-Schleife) */
      for (int i = 0; i < videoGames.size(); i++) {
         VideoGame videoGame = videoGames.get(i);
         System.out.println(videoGame);
      }

      /* Einträge sequentiell verarbeiten (for-each-Schleife) */
      for (VideoGame v : videoGames) {
         System.out.println(v);
      }

      /* Einträge löschen */
      videoGames.remove(game2);

      /* Einträge einfügen */
      videoGames.add(0, game2);

      /* Liste ausgeben */
      System.out.println(videoGames);
   }

   public static void files() throws FileNotFoundException {
      File file = new File("src/main/resources/videogames.txt");
      Scanner scanner = new Scanner(file);
      List<VideoGame> videoGames = new ArrayList<>();

      while (scanner.hasNextLine()) {
         String line = scanner.nextLine();
         String[] tokens = line.split(";");

         String title = tokens[0];
         VideoGameConsole console = VideoGameConsole.valueOf(tokens[1]);
         String publishingYear = tokens[2];
         double rating = Double.valueOf(tokens[3]);

         videoGames.add(new VideoGame(title, console, publishingYear, rating));
      }
      scanner.close();

      for (VideoGame v : videoGames) {
         System.out.println(v);
      }
   }

}
