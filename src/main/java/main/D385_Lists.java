package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import model.Person;

/**
 * Lists
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D385_Lists {

   public static void main(String[] args) {
      List<Person> persons1 = new ArrayList<>();
      List<Person> persons2 = new LinkedList<>();

      persons1.add(new Person("Hans", 42, 'm'));
      persons1.add(new Person("Peter", 18, 'm'));
      persons1.add(new Person("Lisa", 29, 'w'));

      persons2.add(new Person("Hans", 42, 'm'));
      persons2.add(new Person("Peter", 18, 'm'));
      persons2.add(new Person("Lisa", 29, 'w'));

      System.out.println(persons1.equals(persons2));
   }

}
