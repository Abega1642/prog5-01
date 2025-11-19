package dev.razafindratelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TableTest {
  @Test
  void should_get_zero_with_getArea() {
    var table = new Table(0, 0, "not existing", null);
    assertEquals(0, table.getArea());
  }

  @Test
  void should_get_10_with_getArea() {
    var table = new Table(5, 2, "small", "black");
    assertEquals(10, table.getArea());
  }
}
