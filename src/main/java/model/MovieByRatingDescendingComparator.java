package model;

import java.util.Comparator;

/**
 * MovieByRatingDescendingComparator
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MovieByRatingDescendingComparator implements Comparator<Movie> {

   @Override
   public int compare(Movie movie1, Movie movie2) {
      /* Option A */
      // double rating1 = movie1.getRating();
      // double rating2 = movie2.getRating();
      // if (rating1 < rating2 ) {
      // return -1;
      // } else if (rating1 > rating2) {
      // return 1;
      // } else {
      // return 0;
      // }

      /* Option B */
      // double rating1 = movie1.getRating();
      // double rating2 = movie2.getRating();
      // return Double.compare(rating2, rating1);

      /* Option C */
      Double rating1 = movie1.getRating();
      Double rating2 = movie2.getRating();
      return rating2.compareTo(rating1);
   }

}
