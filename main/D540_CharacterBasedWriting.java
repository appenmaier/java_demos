package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Zeichenorientiertes Schreiben
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D540_CharacterBasedWriting {

  public static void main(String[] args) {

    File file = new File("resources/persons.txt");

    /* bis Java 7 */
    // BufferedWriter bufferedWriter = null;
    //
    // try {
    // FileWriter fileWriter = new FileWriter(file);
    // bufferedWriter = new BufferedWriter(fileWriter);
    // bufferedWriter.write("Hans;33;m");
    // bufferedWriter.newLine();
    // bufferedWriter.write("Peter;19;d");
    // bufferedWriter.newLine();
    // bufferedWriter.write("Lisa;27;w");
    // bufferedWriter.newLine();
    // } catch (IOException e) {
    // e.printStackTrace();
    // } finally {
    // if (bufferedWriter != null) {
    // try {
    // bufferedWriter.close();
    // } catch (IOException e) {
    // e.printStackTrace();
    // }
    // }
    // }

    /* seit Java 7 */
    try (FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
      bufferedWriter.write("Hans;33;m");
      bufferedWriter.newLine();
      bufferedWriter.write("Peter;19;d");
      bufferedWriter.newLine();
      bufferedWriter.write("Lisa;27;w");
      bufferedWriter.newLine();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
