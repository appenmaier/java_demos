package main;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Movie;
import model.Movies;

/**
 * Java Stream API
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D480_JavaStreamApi {

   public static void main(String[] args) throws FileNotFoundException {
      List<Movie> movies = Movies.getMovies(25, 50_000);

      movies.forEach(System.out::println);
      System.out.println();

      /* Imperative Lösung */
      List<String> titles = new ArrayList<>();
      for (Movie m : movies) {
         if (m.year().compareTo("2000") < 0 && m.getRating() > 7.5) {
            String title = m.title().toUpperCase();
            titles.add(title);
         }
      }
      Collections.sort(titles, (t1, t2) -> t2.compareTo(t1));

      titles.forEach(System.out::println);
      System.out.println();

      /* Deklarative Lösung */
      titles = movies.stream()
            .filter(m -> m.year().compareTo("2000") < 0)
            .filter(m -> m.getRating() > 7.5)
            .map(m -> m.title().toUpperCase())
            .sorted((t1, t2) -> t2.compareTo(t1))
            .toList();

      titles.forEach(System.out::println);
      System.out.println();
   }

}
