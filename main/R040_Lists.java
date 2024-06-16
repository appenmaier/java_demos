package main;

import java.util.ArrayList;
import model.VideoGame;
import model.VideoGameConsole;

/**
 * Die Klasse ArrayList<E>
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class R040_Lists {

  public static void main(String[] args) {

    ArrayList<VideoGame> videoGames = new ArrayList<>();

    VideoGame totk = new VideoGame("The Legend of Zelda - Tears of the Kingdom",
        VideoGameConsole.SWITCH, "2023", 9.6);
    VideoGame u4 = new VideoGame("Uncharted 4: A Thief´s End", VideoGameConsole.PS4, "2016", 9.3);
    VideoGame gow = new VideoGame("God of War", VideoGameConsole.PS4, "2018", 9.4);

    videoGames.add(totk);
    videoGames.add(gow);
    videoGames.add(u4);

    for (int i = 0; i < videoGames.size(); i++) {
      VideoGame videoGame = videoGames.get(i);
      System.out.println(videoGame);
    }

  }

}
