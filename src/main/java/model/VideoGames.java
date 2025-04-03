package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Videospiele
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class VideoGames {

   public static List<VideoGame> getVideoGames() throws FileNotFoundException {
      File file = new File("src/main/resources/videogames.txt");

      Scanner scanner = new Scanner(file);

      ArrayList<VideoGame> videoGames = new ArrayList<>();
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

      return videoGames;
   }

}
