package main;

import java.awt.Color;

import model.LightBulb;
import model.PlugType;
import model.TableLamp;

/**
 * Aufzaehlungen (Enumerations)
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D340_Enumerations {

   public static void main(String[] args) {

      LightBulb redLightBulb = new LightBulb(Color.RED);
      TableLamp tableLamp = new TableLamp(PlugType.TYPE_F);
      tableLamp.changeLightBulb(redLightBulb);
      System.out.println(tableLamp.toString());
      System.out.println(tableLamp.plugType().region());

      System.out.println(PlugType.TYPE_I.norm());

      PlugType[] plugTypeEnums = PlugType.values();
      for (int i = 0; i < plugTypeEnums.length; i++) {
         PlugType plugTypeEnum = plugTypeEnums[i];
         System.out.println(plugTypeEnum.description());
      }

      String plugType = "TYPE_F";
      PlugType plugTypeEnum = PlugType.valueOf(plugType);
      System.out.println(plugTypeEnum.norm());

   }

}
