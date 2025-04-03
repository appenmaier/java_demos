package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Protokoll
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class Log {

   /**
    * Protokoll-Eintrag
    *
    * @author Daniel Appenmaier
    * @version 2.0
    *
    */
   private record LogEntry(long timeStamp, String content) implements Serializable {
   }
   /* version 1.0: private record LogEntry(long timeStamp, String content) {...} */

   private ArrayList<LogEntry> logEntries;

   public Log() {
      logEntries = new ArrayList<>();
   }

   public void createLogEntry(String content) {
      logEntries.add(new LogEntry(System.currentTimeMillis(), content));
   }

   @SuppressWarnings("unchecked")
   public void load(File file) throws IOException, ClassNotFoundException {
      try (FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
         logEntries = (ArrayList<Log.LogEntry>) objectInputStream.readObject();
      } catch (IOException e) {
         throw new IOException();
      }
   }
   /*
    * version 1.0: public void load(File file) throws IOException { try (FileReader fileReader = new
    * FileReader(file); BufferedReader bufferedReader = new BufferedReader(fileReader)) { String
    * line; while ((line = bufferedReader.readLine()) != null) { String[] tokens = line.split(";");
    * // long timeStamp = Long.valueOf(tokens[0]); String content = tokens[1];
    * createLogEntry(content); } } catch (IOException e) { throw new IOException(); } }
    */

   public void printLogEntries() {
      logEntries.forEach(System.out::println);
   }

   public void save(File file) throws IOException {
      try (FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
         objectOutputStream.writeObject(this.logEntries);
      } catch (IOException e) {
         throw new IOException();
      }
   }
   /*
    * version 1.0: public void save(File file) throws IOException { try (FileWriter fileWriter = new
    * FileWriter(file); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) { for
    * (LogEntry logEntry : logEntries) { String line = logEntry.timeStamp() + ";" +
    * logEntry.content(); bufferedWriter.write(line); bufferedWriter.newLine(); } } catch
    * (IOException e) { throw new IOException(); } }
    */

}
