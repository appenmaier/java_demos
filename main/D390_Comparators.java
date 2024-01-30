package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.Movie;
import model.Movie.Genre;
import model.Movie.MovieByYearDescendingAndTitleAscendingComparator;

/**
 * Komparatoren
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class D390_Comparators {

  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(2);

    ArrayList<String> names = new ArrayList<>();
    names.add("Hans");
    names.add("Peter");
    names.add("Lisa");

    ArrayList<Movie> movies = new ArrayList<>();
    movies.add(new Movie("John Wick 4", List.of(Genre.ACTION, Genre.CRIME, Genre.THRILLER), "2023",
        169, 7.8, 241552));
    movies.add(new Movie("Disaster Movie", List.of(Genre.COMEDY, Genre.SCIENCE_FICTION), "2008", 87,
        2.1, 93334));
    movies.add(new Movie("Der Pate", List.of(Genre.DRAMA, Genre.CRIME), "1972", 175, 9.2, 1900000));
    movies.add(new Movie("The Super Mario Bros. Movie",
        List.of(Genre.ANIMATION, Genre.ADVENTURE, Genre.COMEDY), "2023", 92, 7.1, 161146));

    Collections.sort(numbers);
    Collections.sort(names);
    Collections.sort(movies);
    Collections.sort(movies, new MovieByYearDescendingAndTitleAscendingComparator());

    for (int i = 0; i < numbers.size(); i++) {
      System.out.println(numbers.get(i));
    }

    for (String name : names) {
      System.out.println(name);
    }

    for (Movie m : movies) {
      System.out.println(m);
    }

  }

}
