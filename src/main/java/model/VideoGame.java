package model;

import java.util.Objects;

/**
 * Video Game
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class VideoGame {

   private final String title;
   private final VideoGameConsole console;
   private final String publishingYear;
   private double rating;

   public VideoGame(String title, VideoGameConsole console, String publishingYear, double rating) {
      this.title = title;
      this.console = console;
      this.publishingYear = publishingYear;
      this.rating = rating;
   }

   public String title() {
      return title;
   }

   public VideoGameConsole console() {
      return console;
   }

   public String publishingYear() {
      return publishingYear;
   }

   public void setRating(double rating) {
      this.rating = rating;
   }

   public double getRating() {
      return rating;
   }

   @Override
   public int hashCode() {
      return Objects.hash(console, publishingYear, rating, title);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      VideoGame other = (VideoGame) obj;
      return console == other.console && Objects.equals(publishingYear, other.publishingYear)
            && Double.doubleToLongBits(rating) == Double.doubleToLongBits(other.rating)
            && Objects.equals(title, other.title);
   }

   @Override
   public String toString() {
      return "VideoGame [title=" + title + ", console=" + console + ", publishingYear="
            + publishingYear + ", rating=" + rating + "]";
   }

}
