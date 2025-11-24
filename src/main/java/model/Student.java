package model;

import lombok.Data;

/**
 * Student
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@Data
public class Student implements Comparable<Student> {

   private final String id;
   private final String name;

   @Override
   public int compareTo(Student student) {
      return student.name.compareTo(name);
   }

}
