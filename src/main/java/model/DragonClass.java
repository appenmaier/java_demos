package model;

import java.util.Objects;

/**
 * Drache
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class DragonClass {

   private final String name;
   private final DragonType type;
   private int age;

   public DragonClass(String name, DragonType type, int age) {
      super();
      this.name = name;
      this.type = type;
      this.age = age;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String getName() {
      return name;
   }

   public DragonType getType() {
      return type;
   }

   @Override
   public int hashCode() {
      return Objects.hash(age, name, type);
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
      DragonClass other = (DragonClass) obj;
      return age == other.age && Objects.equals(name, other.name) && type == other.type;
   }

   @Override
   public String toString() {
      return "DragonNormalClass [name=" + name + ", type=" + type + ", age=" + age + "]";
   }

}
