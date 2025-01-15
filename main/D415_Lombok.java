package main;

import model.DragonClass;
import model.DragonLombok;
import model.DragonRecord;
import model.DragonType;

/**
 * Lombok
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D415_Lombok {

   public static void main(String[] args) {

      /* Normal Class */
      DragonClass dragon1 = new DragonClass("Fafnir", DragonType.FIRE, 500);
      DragonClass dragon2 = new DragonClass("Fafnir", DragonType.FIRE, 500);

      System.out.println(dragon1.getName());
      System.out.println(dragon1.equals(dragon2));
      dragon2.setAge(600);
      System.out.println(dragon2);
      System.out.println(dragon1.hashCode());
      System.out.println(dragon2.hashCode());
      System.out.println();

      /* Record */
      DragonRecord dragon3 = new DragonRecord("Fafnir", DragonType.FIRE, 500);
      DragonRecord dragon4 = new DragonRecord("Fafnir", DragonType.FIRE, 500);

      System.out.println(dragon3.name());
      System.out.println(dragon3.equals(dragon4));
      // dragon4.setAge(600);
      System.out.println(dragon3);
      System.out.println(dragon3.hashCode());
      System.out.println(dragon4.hashCode());
      System.out.println();

      /* Lombok */
      DragonLombok dragon5 = new DragonLombok("Fafnir", DragonType.FIRE, 500);
      DragonLombok dragon6 = new DragonLombok("Fafnir", DragonType.FIRE, 500);
      DragonLombok dragon7 =
            DragonLombok.builder().name("Smaug").type(DragonType.FIRE).age(1000).build();

      System.out.println(dragon5.getName());
      System.out.println(dragon5.equals(dragon6));
      dragon5.setAge(600);
      System.out.println(dragon5);
      System.out.println(dragon5.hashCode());
      System.out.println(dragon6.hashCode());
      System.out.println(dragon7);

   }

}
