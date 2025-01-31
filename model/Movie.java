package model;

import java.util.Comparator;
import java.util.List;

/**
 * Film
 *
 * @author Daniel Appenmaier
 * @version 4.0
 *
 */
public record Movie(String title, List<Genre> genres, String year, int runtimeInMinutes,
      double rating, int votes) implements Comparable<Movie> {

   @Override
   public int compareTo(Movie other) {
      if (other.year.compareTo(year) == 0) {
         return title.compareTo(other.title);
      } else {
         return other.year.compareTo(year);
      }
   }
   /* version 2.0: - */

   /**
    * MovieByRatingDescendingComparator
    *
    * @author Daniel Appenmaier
    * @version 1.0
    *
    */
   public static class MovieByRatingDescendingComparator implements Comparator<Movie> {

      @Override
      public int compare(Movie movie1, Movie movie2) {
         return Double.valueOf(movie2.rating()).compareTo(movie1.rating());
      }

   }
   /* version 3.0: - */

   /**
    * MovieByYearDescendingAndTitleAscendingComparator
    *
    * @author Daniel Appenmaier
    * @version 1.0
    *
    */
   public static class MovieByYearDescendingAndTitleAscendingComparator
         implements Comparator<Movie> {

      @Override
      public int compare(Movie movie1, Movie movie2) {
         if (movie2.year() == movie1.year()) {
            return movie1.title().compareTo(movie2.title());
         }
         return movie2.year().compareTo(movie1.year());
      }

   }
   /* version 3.0: - */

   /**
    * Genre
    *
    * @author Daniel Appenmaier
    * @version 1.0
    *
    */
   public enum Genre {

      ACTION("Action"), ADVENTURE("Adventure"), ANIMATION("Animation"), BIOGRAPHY(
            "Biography"), COMEDY("Comedy"), CRIME("Crime"), DOCUMENTARY("Documentary"), DRAMA(
                  "Drama"), FAMILY("Family"), FANTASY("Fantasy"), FILM_NOIR("Film Noir"), HISTORY(
                        "History"), HORROR("Horror"), MUSIC("Music"), MUSICAL("Musical"), MYSTERY(
                              "Mystery"), NEWS("News"), ROMANCE("Romance"), SCIENCE_FICTION(
                                    "Science Fiction"), SPORT("Sport"), THRILLER(
                                          "Thriller"), WAR("War"), WESTERN("Western");

      private String name;

      Genre(String name) {
         this.name = name;
      }

      public String getName() {
         return name;
      }

   }
   /* version 3.0: - */

   // private final String title;
   /* version 1.0: private final String title; */
   // private final List<Genre> genres;
   /* version 1.0: private final List<Genre> genres; */
   // private final String year;
   /* version 1.0: private final String year; */
   // private final int runtimeInMinutes;
   /* version 1.0: private final int runtimeInMinutes; */
   // private final double rating;
   /* version 1.0: private final double rating; */
   // private final int votes;
   /* version 1.0: private final int votes; */

   // public Movie(String title, List<Genre> genres, String year, int runtimeInMinutes,
   // double rating, int votes) {
   // this.title = title;
   // this.genres = genres;
   // this.year = year;
   // this.runtimeInMinutes = runtimeInMinutes;
   // this.rating = rating;
   // this.votes = votes;
   // }
   /*
    * version 1.0: public Movie(String title, List<Genre> genres, String year, int runtimeInMinutes,
    * double rating, int votes) { this.title = title; this.genres = genres; this.year = year;
    * this.runtimeInMinutes = runtimeInMinutes; this.rating = rating; this.votes = votes; }
    */

   // public String title() {
   // return title();
   // }
   /* version 1.0: public String title() { return title(); } */

   // public List<Genre> genres() {
   // return genres;
   // }
   /* version 1.0: public List<Genre> genres() { return genres; } */

   // public String year() {
   // return year;
   // }
   /* version 1.0: public String year() { return year; } */

   // public int runtimeInMinutes() {
   // return runtimeInMinutes;
   // }
   /* version 1.0: public int runtimeInMinutes() { return runtimeInMinutes; } */

   // public double rating() {
   // return rating;
   // }
   /* version 1.0: public double rating() { return rating; } */

   // public int votes() {
   // return votes;
   // }
   /* version 1.0: public int votes() { return votes; } */

}
/*
 * version 3.0: public record Movie(String title, List<Genre> genres, String year, int
 * runtimeInMinutes, double rating, int votes) implements Comparable<Movie> {...}
 */
/*
 * version 2.0: public record Movie(String title, List<Genre> genres, String year, int
 * runtimeInMinutes, double rating, int votes) {...}
 */
/* version 1.0: public class Movie {...} */
