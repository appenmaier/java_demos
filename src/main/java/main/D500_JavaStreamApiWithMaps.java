package main;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import model.Movie;
import model.Movies;

/**
 * Java Stream API with Maps
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D500_JavaStreamApiWithMaps {

   private static Map<String, List<Movie>> allMoviesByYear;

   public static void main(String[] args) throws FileNotFoundException {
      List<Movie> allMovies = Movies.getMovies(25, 50_000);
      allMoviesByYear = allMovies.stream().collect(Collectors.groupingBy(Movie::year));

      allMoviesByYear.forEach((year, movies) -> System.out
            .println(year + ": " + movies.stream().map(m -> m.title()).toList()));
      System.out.println();

      /* keySet */
      OptionalDouble averageYear = getAverageYear();
      averageYear.ifPresent(System.out::println);
      System.out.println();

      /* values */
      long numberOfYearsWithMoreThanOneMovie = numberOfYearsWithMoreThanOneMovie();
      System.out.println(numberOfYearsWithMoreThanOneMovie);
      System.out.println();

      /* keySet */
      List<String> yearsWithMoreThanOneMovie = yearsWithMoreThanOneMovie();
      yearsWithMoreThanOneMovie.forEach(System.out::println);
   }

   private static OptionalDouble getAverageYear() {
      System.out.println("Durchschnittsjahr");

      OptionalDouble averageYear =
            allMoviesByYear.keySet().stream().mapToInt(year -> Integer.valueOf(year)).average();

      return averageYear;
   }

   private static long numberOfYearsWithMoreThanOneMovie() {
      System.out.println("Anzahl Jahre mit mehr als einem Film");

      long numberOfYearsWithMoreThanOneMovie =
            allMoviesByYear.values().stream().filter(movies -> movies.size() > 1).count();

      return numberOfYearsWithMoreThanOneMovie;
   }

   private static List<String> yearsWithMoreThanOneMovie() {
      System.out.println("Alle Jahre mit mehr als einem Film");

      List<String> yearsWithMoreThanOneMovie = allMoviesByYear.entrySet()
            .stream()
            .filter(entry -> entry.getValue().size() > 1)
            .map(Entry::getKey) // .map(entry -> entry.getKey())
            .toList();

      return yearsWithMoreThanOneMovie;
   }

}

