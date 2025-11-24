package main;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import model.InvalidParameterValueException;
import model.Movie;
import model.MovieByRatingDescendingComparator;
import model.MoviePrinter;
import model.Movies;

/**
 * Inner Classes
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D430_InnerClasses {

   public static void main(String[] args) throws InvalidParameterValueException {
      List<Movie> movies = Movies.getMovies(10, 50_000);

      /* Äußere Klasse */
      Collections.sort(movies, new MovieByRatingDescendingComparator());
      movies.forEach(new MoviePrinter());
      System.out.println();

      /* Lokale Klasse */
      class MovieByRatingAscendingComparator implements Comparator<Movie> {

         @Override
         public int compare(Movie o1, Movie o2) {
            return Double.valueOf(o1.getRating()).compareTo(o2.getRating());
         }

      }
      Collections.sort(movies, new MovieByRatingAscendingComparator());
      class MoviePrinter implements Consumer<Movie> {

         @Override
         public void accept(Movie m) {
            System.out.println(m);
         }

      }
      movies.forEach(new MoviePrinter());
      System.out.println();

      /* Anonyme Klasse */
      Collections.sort(movies, new Comparator<Movie>() {

         @Override
         public int compare(Movie o1, Movie o2) {
            return o2.title().compareTo(o1.title());
         }

      });
      movies.forEach(new Consumer<Movie>() {

         @Override
         public void accept(Movie m) {
            System.out.println(m);
         }

      });
      System.out.println();

      /* Lambda-Ausdruck */
      Collections.sort(movies, (o1, o2) -> o1.year().compareTo(o2.year()));
      movies.forEach(m -> System.out.println(m));
      System.out.println();

      /* Methodenreferenz */
      movies.forEach(System.out::println);
   }

}
