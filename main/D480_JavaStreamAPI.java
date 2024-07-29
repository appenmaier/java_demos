package main;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import model.Movie;
import model.Movie.Genre;
import model.Movies;

/**
 * Die Java Stream API
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D480_JavaStreamAPI {

  public static void main(String[] args) throws FileNotFoundException {

    ArrayList<Movie> movies = Movies.getMovies(10, 100000);

    movies.forEach(System.out::println);
    System.out.println();

    /* Imperative Loesung */
    ArrayList<Movie> dramas = new ArrayList<>();
    for (Movie m : movies) {
      if (m.genres().contains(Genre.DRAMA) && m.year().compareTo("1990") >= 0
          && m.year().compareTo("2000") < 0) {
        dramas.add(m);
      }
    }

    Collections.sort(dramas, (m1, m2) -> Double.valueOf(m2.rating()).compareTo(m1.rating()));

    for (Movie m : dramas) {
      System.out.println(m);
    }
    System.out.println();

    /* Funktionale Loesung */
    movies.stream()
        .filter(m -> m.genres().contains(Genre.DRAMA))
        .filter(m -> m.year().compareTo("1990") >= 0)
        .filter(m -> m.year().compareTo("2000") < 0)
        .sorted((m1, m2) -> Double.valueOf(m2.rating()).compareTo(m1.rating()))
        .forEach(System.out::println);

  }

}
