package main;

import java.io.File;
import java.io.IOException;
import model.Log;

/**
 * Schreiben und Lesen serialisierter Objekte
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class D560_Serialization {

  public static void main(String[] args)
      throws IOException, InterruptedException, ClassNotFoundException {

    Log log = new Log();
    File file = new File("src/resources/log.dat");
    /* version 1.0: File file = new File("src/resources/log.txt"); */

    if (file.exists()) {
      log.load(file);
    } else {
      log.createLogEntry("Eintrag 1");
      Thread.sleep(1000);
      log.createLogEntry("Eintrag 2");
      Thread.sleep(1000);
      log.createLogEntry("Eintrag 3");
      log.save(file);
    }

    log.printLogEntries();

  }
  /*
   * version 1.0: public static void main(String[] args) throws IOException, InterruptedException
   * {...}
   */

}
