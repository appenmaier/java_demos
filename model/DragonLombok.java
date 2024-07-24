package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Drache
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class DragonLombok {

  private final String name;
  private final DragonType type;
  private int age;

}
