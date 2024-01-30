package main;

import model.TableLamp;

/**
 * Statische und nicht-statische Elemente
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class D310_StaticAndNonStaticElements {

  public static void main(String[] args) {

    System.out.println(TableLamp.getNumberOfTableLamps());

    /*
     * version 1.0: TableLamp tableLamp1 = new TableLamp(); TableLamp tableLamp2 = new TableLamp();
     * TableLamp tableLamp3 = new TableLamp();
     */

    System.out.println(TableLamp.getNumberOfTableLamps());

  }

}
