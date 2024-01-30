package main;

import model.VideoGame;
import model.VideoGameConsole;

/**
 * Die Mutter aller Klassen / Die Object-Methoden
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class DX30_ObjectMethods {

  public static void main(String[] args) {


    VideoGame totk = new VideoGame("The Legend of Zelda - Tears of the Kingdom",
        VideoGameConsole.SWITCH, "2023", 9.6);
    VideoGame totk2 = new VideoGame("The Legend of Zelda - Tears of the Kingdom",
        VideoGameConsole.SWITCH, "2023", 9.6);

    System.out.println(totk);
    System.out.println(totk2);
    System.out.println();

    System.out.println("movie1.hashCode: " + totk.hashCode());
    System.out.println("movie2.hashCode: " + totk2.hashCode());
    System.out.println();

    System.out
        .println("movie1.identityHashCode: " + Integer.toHexString(System.identityHashCode(totk)));
    System.out
        .println("movie2.identityHashCode: " + Integer.toHexString(System.identityHashCode(totk2)));
    System.out.println();

    if (totk == totk2) {
      System.out.println("Beide Spiele sind identisch");
    } else {
      System.out.println("Beide Spiele sind nicht identisch");
    }

    if (totk.equals(totk2)) {
      System.out.println("Beide Spiele sind gleich");
    } else {
      System.out.println("Beide Spiele sind nicht gleich");
    }

  }

}
