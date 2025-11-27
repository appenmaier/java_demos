package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Log
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Log {

   private record LogEntry(long timeStamp, String content) implements Serializable {
   }

   private List<LogEntry> logEntries;

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

}
