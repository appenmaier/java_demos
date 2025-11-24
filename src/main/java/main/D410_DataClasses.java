package main;

import model.DragonClass;
import model.DragonLombok;
import model.DragonRecord;
import model.DragonType;

/**
 * Data Classes
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D410_DataClasses {

   public static void main(String[] args) {
      /* Normal Class */
      DragonClass fafnir1 = new DragonClass("Fafnir", DragonType.EARTH, 500);
      DragonClass fafnir2 = new DragonClass("Fafnir", DragonType.EARTH, 500);

      System.out.println(fafnir1.equals(fafnir2));
      System.out.println(fafnir1.hashCode());
      System.out.println(fafnir2.hashCode());
      System.out.println(fafnir1);
      fafnir1.setAge(600);
      System.out.println(fafnir1.getAge());
      System.out.println();

      /* Record */
      DragonRecord fafnir3 = new DragonRecord("Fafnir", DragonType.EARTH, 500);
      DragonRecord fafnir4 = new DragonRecord("Fafnir", DragonType.EARTH, 500);

      System.out.println(fafnir3.equals(fafnir4));
      System.out.println(fafnir3.hashCode());
      System.out.println(fafnir4.hashCode());
      System.out.println(fafnir3);
      // fafnir3.setAge(600);
      System.out.println(fafnir3.age());
      System.out.println();

      /* Lombok */
      DragonLombok fafnir5 = new DragonLombok("Fafnir", DragonType.EARTH, 500);
      DragonLombok fafnir6 = new DragonLombok("Fafnir", DragonType.EARTH, 500);
      DragonLombok fafnir7 =
            DragonLombok.builder().name("Fafnir").type(DragonType.EARTH).age(500).build();

      System.out.println(fafnir5.equals(fafnir6));
      System.out.println(fafnir5.equals(fafnir7));
      System.out.println(fafnir5.hashCode());
      System.out.println(fafnir6.hashCode());
      System.out.println(fafnir7.hashCode());
      System.out.println(fafnir5);
      fafnir5.setAge(600);
      System.out.println(fafnir5.getAge());
   }

}
