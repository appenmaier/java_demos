package main;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Movie;
import model.MovieByYearDescendingAndTitleAscendingComparator;
import model.Movies;

/**
 * Sorting
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class D390_Sorting {

   public static void main(String[] args) throws FileNotFoundException {
      /* Integers */
      List<Integer> numbers = new ArrayList<>();
      numbers.add(5);
      numbers.add(9);
      numbers.add(2);
      numbers.add(7);
      numbers.add(2);

      Collections.sort(numbers);
      for (int i : numbers) {
         System.out.println(i);
      }
      System.out.println();

      /* Strings */
      List<String> names = new ArrayList<>();
      names.add("Hans");
      names.add("Peter");
      names.add("Lisa");
      names.add("Max");
      names.add("Peter");

      Collections.sort(names);
      for (String name : names) {
         System.out.println(name);
      }
      System.out.println();

      /* Movies */
      List<Movie> movies = Movies.getMovies(10, 50_000);

      Collections.sort(movies);
      for (Movie m : movies) {
         System.out.println(m);
      }
      System.out.println();

      Collections.sort(movies, new MovieByYearDescendingAndTitleAscendingComparator());
      for (Movie m : movies) {
         System.out.println(m);
      }
   }

}
