package model;

import java.util.Objects;

/**
 * Studierender
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Student {

  private final String matriculationNumber;

  public Student(String matriculationNumber) {
    this.matriculationNumber = matriculationNumber;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Student other = (Student) obj;
    return Objects.equals(matriculationNumber, other.matriculationNumber);
  }

  public String getMatriculationNumber() {
    return matriculationNumber;
  }

  @Override
  public int hashCode() {
    return Objects.hash(matriculationNumber);
  }

  @Override
  public String toString() {
    return "Student [matriculationNumber=" + matriculationNumber + "]";
  }

}
