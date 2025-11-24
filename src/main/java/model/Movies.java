package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Movies
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class Movies {

   private final static String MOVIE_FILE_PATH = "src/main/resources/movies.csv";

   public static List<Movie> loadMovies(File file)
         throws FileNotFoundException, InvalidParameterValueException {
      List<Movie> movies = new ArrayList<>();
      Scanner scanner = new Scanner(file);

      while (scanner.hasNextLine()) {
         String line = scanner.nextLine();
         String[] tokens = line.split(";");
         String title = tokens[0];
         double rating = Double.valueOf(tokens[1]);
         int runtimeInMinutes = Integer.valueOf(tokens[2]);
         String year = tokens[3];
         ArrayList<Genre> genres = new ArrayList<>();
         String[] genreTexts = tokens[4].split(",");
         for (String text : genreTexts) {
            Genre genre = Genre.valueOf(text);
            genres.add(genre);
         }
         int votes = Integer.valueOf(tokens[5]);

         Movie movie = new Movie(title, genres, year, runtimeInMinutes);
         movie.setRating(rating);
         movie.setVotes(votes);
         movies.add(movie);
      }
      scanner.close();

      return movies;
   }

   public static List<Movie> shuffleMovies(List<Movie> movies) {
      List<Movie> shuffledMovies = new ArrayList<>();
      Random random = new Random();

      for (int i = 0; i < movies.size(); i++) {
         int index = random.nextInt(movies.size());
         shuffledMovies.add(movies.get(index));
         movies.remove(index);
      }

      return shuffledMovies;
   }

   public static List<Movie> filterMovies(List<Movie> movies, int votes) {
      List<Movie> filteredMovies = new ArrayList<>();

      for (Movie m : movies) {
         if (m.getVotes() >= votes) {
            filteredMovies.add(m);
         }
      }

      return filteredMovies;
   }

   public static List<Movie> limitMovies(List<Movie> movies, int limit) {
      if (movies.size() <= limit) {
         return movies;
      }

      List<Movie> limitedMovies = new ArrayList<>();
      for (int i = 0; i < limit; i++) {
         limitedMovies.add(movies.get(i));
      }
      return limitedMovies;
   }

   public static List<Movie> getMovies(int limit, int votes) {
      List<Movie> movies = new ArrayList<>();

      try {
         movies = loadMovies(new File(MOVIE_FILE_PATH));
         movies = shuffleMovies(movies);
         movies = filterMovies(movies, votes);
         movies = limitMovies(movies, limit);
      } catch (FileNotFoundException | InvalidParameterValueException e) {
         e.printStackTrace();
      }

      return movies;
   }

}
