package main;

import java.io.IOException;
import java.util.ArrayList;

import model.VideoGame;
import model.VideoGames;

/**
 * Lesen von Dateien und Wrapper-Klassen
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class R050_FilesAndWrappers {

   public static void main(String[] args) throws IOException, InterruptedException {

      ArrayList<VideoGame> videoGames = VideoGames.getVideoGames();

      for (VideoGame v : videoGames) {
         System.out.println(v);
      }

   }

}
