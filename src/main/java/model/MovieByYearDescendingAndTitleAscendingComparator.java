package model;

import java.util.Comparator;

/**
 * MovieByYearDescendingAndTitleAscendingComparator
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MovieByYearDescendingAndTitleAscendingComparator implements Comparator<Movie> {

   @Override
   public int compare(Movie movie1, Movie movie2) {
      if (movie1.year().equals(movie2.year())) {
         return movie1.title().compareTo(movie2.title());
      }
      return movie2.year().compareTo(movie1.year());
   }

}
