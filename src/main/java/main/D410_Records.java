package main;

import java.util.List;

import model.Movie;
import model.Movie.Genre;

/**
 * Datenklassen (Records)
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class D410_Records {

   public static void main(String[] args) {

      Movie movie = new Movie("John Wick 4",
            List.of(Genre.ACTION, Genre.CRIME, Genre.THRILLER),
            "2023",
            169,
            7.8,
            241552);
      Movie movie2 = new Movie("John Wick 4",
            List.of(Genre.ACTION, Genre.CRIME, Genre.THRILLER),
            "2023",
            169,
            7.8,
            241552);

      System.out.println(movie.title());

      System.out.println(movie.hashCode());
      System.out.println(movie2.hashCode());

      System.out.println(movie.equals(movie2));

      System.out.println(movie);

   }

}
