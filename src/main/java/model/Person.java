package model;

import java.util.Objects;

/**
 * Person
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class Person {

   private String name;
   private int age;
   private char gender;

   public Person(String name, int age, char gender) {
      this.name = name;
      this.age = age;
      this.gender = gender;
   }

   @Override
   public String toString() {
      return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
   }

   @Override
   public int hashCode() {
      return Objects.hash(age, gender, name);
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
      Person other = (Person) obj;
      return age == other.age && gender == other.gender && Objects.equals(name, other.name);
   }

}
