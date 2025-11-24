package model;

import java.util.function.Consumer;

/**
 * MoviePrinter
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MoviePrinter implements Consumer<Movie> {

   @Override
   public void accept(Movie m) {
      System.out.println(m);
   }

}
