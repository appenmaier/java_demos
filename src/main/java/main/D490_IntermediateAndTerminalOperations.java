package main;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import model.Movie;
import model.Movie.Genre;
import model.Movies;

/**
 * Intermediaere und Terminale Operationen
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D490_IntermediateAndTerminalOperations {

   private static List<Movie> movies;

   private static List<Movie> getAllActionMoviesAsList() {
      System.out.println("Alle Actionfilme als Liste");

      List<Movie> allActionMoviesAsList = movies.stream()
            .filter(m -> m.genres().contains(Genre.ACTION))
            .collect(Collectors.toList());
      return allActionMoviesAsList;
   }

   private static Map<String, List<Movie>> getAllActionMoviesByYear() {
      System.out.println("Alle Actionfilme zu jedem Jahr");

      Map<String, List<Movie>> allActionMoviesByYear = movies.stream()
            .filter(m -> m.genres().contains(Genre.ACTION))
            .collect(Collectors.groupingBy(m -> m.year()));
      return allActionMoviesByYear;
   }

   private static List<Movie> getAllComedyMoviesWithRuntimeInMinutesLT90() {
      System.out.println("Alle Komedien mit einer Laufzeit von maximal 90 Minuten");

      List<Movie> allComedyMoviesWithRuntimeInMinutesLT90 = movies.stream()
            .filter(m -> m.genres().contains(Genre.COMEDY))
            .peek(System.out::println)
            .filter(m -> m.runtimeInMinutes() < 90)
            .peek(System.out::println)
            .collect(Collectors.toList());
      return allComedyMoviesWithRuntimeInMinutesLT90;
   }

   private static List<String> getAllYearsAsSortedList() {
      System.out.println("Alle Jahre als sortierte Liste");

      List<String> allYearsAsSortedList =
            movies.stream().map(m -> m.year()).distinct().sorted().collect(Collectors.toList());
      return allYearsAsSortedList;
   }

   private static OptionalDouble getAverageRatingOfAllMovies() {
      System.out.println("Die Durchschnittsbewertung aller Filme");

      OptionalDouble averageRating = movies.stream().mapToDouble(m -> m.rating()).average();
      return averageRating;
   }

   private static Optional<Movie> getDrama() {
      System.out.println("Ein Drama");

      Optional<Movie> drama =
            movies.stream().filter(m -> m.genres().contains(Genre.DRAMA)).findAny();
      return drama;
   }

   private static Optional<Movie> getLongestComedyMovie() {
      System.out.println("Die laengste Komoedie");

      Optional<Movie> longestComedyMovie = movies.stream()
            .filter(m -> m.genres().contains(Genre.COMEDY))
            .max((m1, m2) -> Integer.valueOf(m2.runtimeInMinutes())
                  .compareTo(m1.runtimeInMinutes()));
      return longestComedyMovie;
   }

   private static boolean isHorrorMovieFrom1982Available() {
      System.out.println("Gibt es einen Horrorfilm aus dem Jahr 1982?");

      boolean isHorrorMovieFrom1982Available = movies.stream()
            .anyMatch(m -> m.genres().contains(Genre.HORROR) && m.year().equals("1982"));
      return isHorrorMovieFrom1982Available;
   }

   public static void main(String[] args) throws FileNotFoundException {
      movies = Movies.getMovies(50, 50000);
      movies.forEach(System.out::println);
      System.out.println();

      /* filter, map, forEach */
      printAllThrillersWithRatingBE7();

      /* mapToDouble/mapToInt/mapToLong, average/sum */
      OptionalDouble averageRating = getAverageRatingOfAllMovies();
      averageRating.ifPresent(System.out::println);
      System.out.println();

      /* sorted, limit/skip, forEach */
      printTop5HorrorMovies();

      /* filter, max/min/count */
      Optional<Movie> longestComedyMovie = getLongestComedyMovie();
      longestComedyMovie.ifPresent(System.out::println);
      System.out.println();

      /* filter, findAny/findFirst */
      Optional<Movie> drama = getDrama();
      drama.ifPresent(System.out::println);
      System.out.println();

      /* anyMatch/allMatch/noneMatch */
      boolean isHorrorMovieFrom1982Available = isHorrorMovieFrom1982Available();
      System.out.println(isHorrorMovieFrom1982Available);
      System.out.println();

      /* filter, collect */
      List<Movie> allActionMovies = getAllActionMoviesAsList();
      allActionMovies.forEach(System.out::println);
      System.out.println();

      /* map, distinct, sorted, collect */
      List<String> allYearsAsSortedList = getAllYearsAsSortedList();
      allYearsAsSortedList.forEach(System.out::println);
      System.out.println();

      /* filter, collect */
      Map<String, List<Movie>> allActionMoviesByYear = getAllActionMoviesByYear();
      allActionMoviesByYear.forEach((year, movies) -> System.out.println(
            year + ": " + movies.stream().map(m -> m.title()).collect(Collectors.toList())));
      System.out.println();

      /* peek, filter, forEach */
      getAllComedyMoviesWithRuntimeInMinutesLT90();
   }

   private static void printAllThrillersWithRatingBE7() {
      System.out
            .println("Alle Thriller mit einer Bewertung von min. 7 in der Form \"Title (Jahr)\"");

      movies.stream()
            .filter(m -> m.genres().contains(Genre.THRILLER))
            .filter(m -> m.rating() >= 7)
            .map(m -> m.title() + " (" + m.year() + ")")
            .forEach(System.out::println);
      System.out.println();
   }

   private static void printTop5HorrorMovies() {
      System.out.println("Die 5 besten Filme");

      movies.stream()
            .sorted((m1, m2) -> Double.valueOf(m2.rating()).compareTo(m1.rating()))
            .limit(5)
            .forEach(System.out::println);
      System.out.println();
   }

}
