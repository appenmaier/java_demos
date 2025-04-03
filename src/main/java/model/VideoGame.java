package model;

import java.util.Objects;

/**
 * Videospiel
 *
 * @author Daniel Appenmaier
 * @version 3.0
 *
 */
public class VideoGame implements Comparable<VideoGame> {

   private final VideoGameConsole console;
   private final String publishingYear;
   private final double rating;
   private final String title;

   public VideoGame(String title, VideoGameConsole console, String publishingYear, double rating) {
      this.title = title;
      this.console = console;
      this.publishingYear = publishingYear;
      this.rating = rating;
   }

   @Override
   public int compareTo(VideoGame other) {
      return Double.valueOf(other.rating).compareTo(this.rating);
   }
   /* version 2.0: - */

   public VideoGameConsole console() {
      return console;
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
      return Objects.equals(publishingYear, other.publishingYear)
            && Double.doubleToLongBits(rating) == Double.doubleToLongBits(other.rating)
            && Objects.equals(title, other.title) && console == other.console;
   }
   /* version 1.0: - */

   @Override
   public int hashCode() {
      return Objects.hash(publishingYear, rating, title, console);
   }
   /* version 1.0: - */

   public String publishingYear() {
      return publishingYear;
   }

   public double rating() {
      return rating;
   }

   public String title() {
      return title;
   }

   @Override
   public String toString() {
      return "VideoGame [publishingYear=" + publishingYear + ", rating=" + rating + ", title="
            + title + ", console=" + console + "]";
   }
   /* version 1.0: - */

}
/* version 2.0: public class VideoGame {...} */
