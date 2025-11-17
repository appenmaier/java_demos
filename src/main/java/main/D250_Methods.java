package main;

import model.StringArray;
import util.StringArrayHelper;

/**
 * Methods
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D250_Methods {

   public static void main(String[] args) {
      /* Ansatz ohne Objektorientierung */
      String[] namesArray = new String[2];

      namesArray = StringArrayHelper.add(namesArray, "Hans");
      namesArray = StringArrayHelper.add(namesArray, "Peter");
      namesArray = StringArrayHelper.add(namesArray, "Lisa");
      StringArrayHelper.print(namesArray);

      /* Ansatz mit Objektorientierung */
      StringArray names2 = new StringArray();

      names2.add("Hans");
      names2.add("Peter");
      names2.add("Lisa");
      names2.print();
   }

}
