package dev.razafindratelo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Table {
  private double length;
  private double width;
  private String state;
  private String color;

  public double getArea() {
    return length * width;
  }
}
