package main;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import model.Movie;
import model.Movies;
import model.Movie.Genre;

/**
 * Bedarfsauswertung (Lazy Evaluation)
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D500_LazyEvaluation {

  public static void main(String[] args) throws FileNotFoundException {

    ArrayList<Movie> movies = Movies.getMovies(10, 100000);

    movies.stream().filter(m -> {
      System.out.println(m + ": filter 1");
      return m.genres().contains(Genre.DRAMA);
    }).filter(m -> {
      System.out.println(m + ": filter 2");
      return m.title().length() > 15;
    }).map(m -> {
      System.out.println(m + ": map");
      return m.title();
    }).forEach(System.out::println);

  }

}
