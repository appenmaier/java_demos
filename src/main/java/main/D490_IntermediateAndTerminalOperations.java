package main;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import model.Genre;
import model.Movie;
import model.Movies;

/**
 * Intermediate and Terminal Operations
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D490_IntermediateAndTerminalOperations {

   private static List<Movie> movies;

   public static void main(String[] args) throws FileNotFoundException {
      movies = Movies.getMovies(50, 50_000);
      movies.forEach(System.out::println);
      System.out.println();

      /* filter, map, forEach */
      printAllThrillersWithRatingGE7();

      /* mapToDouble/mapToInt/mapToLong, average/sum */
      OptionalDouble averageRating = getAverageRatingOfAllMovies();
      averageRating.ifPresent(System.out::println);
      System.out.println();

      /* filter, sorted, limit/skip, toList */
      List<Movie> horrorMovies = getTop5HorrorMovies();
      horrorMovies.forEach(System.out::println);
      System.out.println();

      /* max/min/count */
      Optional<Movie> longestMovie = getLongestMovie();
      longestMovie.ifPresent(System.out::println);
      System.out.println();

      /* filter, findAny/findFirst */
      Optional<Movie> drama = getDrama();
      drama.ifPresentOrElse(System.out::println, () -> System.out.println("Kein Drama"));
      System.out.println();

      /* anyMatch/allMatch/noneMatch */
      boolean horrorMovieFrom1982Exists = horrorMovieFrom1982Exists();
      System.out.println(horrorMovieFrom1982Exists);
      System.out.println();

      /* map, distinct, sorted, toList */
      List<String> allYears = getAllYears();
      allYears.forEach(System.out::println);
      System.out.println();

      /* collect */
      Map<String, List<Movie>> allMoviesByYear = getAllMoviesByYear();
      allMoviesByYear.forEach((year, movies) -> System.out.println(year + ": " + movies));
      System.out.println();
   }

   private static void printAllThrillersWithRatingGE7() {
      System.out.println(
            "Alle Thriller mit einer Bewertung von min. 7 in der Form \"[Title] ([Jahr])\"");

      movies.stream()
            .filter(m -> m.genres().contains(Genre.THRILLER))
            .filter(m -> m.getRating() >= 7)
            .map(m -> m.title() + " (" + m.year() + ")")
            .forEach(System.out::println); // forEach(text -> System.out.println(text));

      System.out.println();
   }

   private static OptionalDouble getAverageRatingOfAllMovies() {
      System.out.println("Die Durchschnittsbewertung aller Filme");

      OptionalDouble averageRating = movies.stream()
            .mapToDouble(m -> m.getRating()) // .mapToDouble(m -> m.getRating())
            .average();

      return averageRating;
   }

   private static List<Movie> getTop5HorrorMovies() {
      System.out.println("Die 5 besten Horror-Filme als Liste");

      List<Movie> horrorMovies = movies.stream()
            .filter(m -> m.genres().contains(Genre.HORROR))
            .sorted((m1, m2) -> Double.valueOf(m2.getRating()).compareTo(m1.getRating()))
            .limit(5)
            .toList();

      return horrorMovies;
   }

   private static Optional<Movie> getLongestMovie() {
      System.out.println("Der längste film");

      Optional<Movie> longestMovie = movies.stream()
            .max((m1, m2) -> Integer.valueOf(m2.runtimeInMinutes())
                  .compareTo(m1.runtimeInMinutes()));

      return longestMovie;
   }

   private static Optional<Movie> getDrama() {
      System.out.println("Ein Drama");

      Optional<Movie> drama =
            movies.stream().filter(m -> m.genres().contains(Genre.DRAMA)).findAny();

      return drama;
   }

   private static boolean horrorMovieFrom1982Exists() {
      System.out.println("Existiert ein Horrorfilm aus dem Jahr 1982?");

      boolean horrorMovieFrom1982Exists = movies.stream()
            .anyMatch(m -> m.genres().contains(Genre.HORROR) && m.year().equals("1982"));

      return horrorMovieFrom1982Exists;
   }

   private static List<String> getAllYears() {
      System.out.println("Alle Jahre als sortierte Liste");

      List<String> allYears = movies.stream().map(m -> m.year()).distinct().sorted().toList();

      return allYears;
   }

   private static Map<String, List<Movie>> getAllMoviesByYear() {
      System.out.println("Alle Filme gruppiert nach Jahr");

      Map<String, List<Movie>> allMoviesByYear =
            movies.stream().collect(Collectors.groupingBy(Movie::year)); // .collect(Collectors.groupingBy(m
                                                                         // -> m.year()));

      return allMoviesByYear;
   }

}
