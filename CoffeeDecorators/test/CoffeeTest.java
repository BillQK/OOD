import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CoffeeTest {

  private Coffee c, esp;

  @Before
  public void setup() {
    c = new RegularCoffee();
    c = new WithMilk(c);
    c = new WithSprinkles(c);

    esp = new LoyaltyDiscount(new WithSprinkles(new Espresso()));
  }

  @Test
  public void testCoffees() {
    assertEquals(2.25, c.getPrice(), 0.001);
    assertEquals("espresso, with sprinkles, with discount", esp.getDescription());
  }

}
