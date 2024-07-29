package main;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;
import model.Movie;
import model.Movies;

/**
 * Unendliche Stroeme
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D510_InfiniteStreams {

  public static void main(String[] args) throws FileNotFoundException {

    ArrayList<Movie> movies = Movies.getMovies(1000, 100000);

    Stream.generate(() -> new Random().nextInt(movies.size()))
        .limit(10)
        .forEach(r -> System.out.println(movies.get(r)));

  }

}
