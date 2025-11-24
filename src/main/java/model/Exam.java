package model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Exam
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@Data
@AllArgsConstructor
public class Exam {

   private final LocalDate date;
   private double grade;

}
