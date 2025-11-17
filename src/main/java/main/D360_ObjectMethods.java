package main;

import model.Person;

/**
 * Object Methods
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D360_ObjectMethods {

   public static void main(String[] args) {
      Person person1 = new Person("Hans", 42, 'm');
      Person person2 = new Person("Peter", 18, 'm');
      Person person3 = new Person("Peter", 18, 'm');

      System.out.println(person1);
      System.out.println(person2);
      System.out.println(person3);

      if (person2 == person3) {
         System.out.println("person2 == person3");
      }

      if (person2.equals(person3)) {
         System.out.println("person2.equals(person3)");
      }

      System.out.println("person2.hashCode(): " + person2.hashCode());
      System.out.println("person3.hashCode(): " + person3.hashCode());

      System.out.println("System.identityHashCode(person2): " + System.identityHashCode(person2));
      System.out.println("System.identityHashCode(person3): " + System.identityHashCode(person3));
   }

}
