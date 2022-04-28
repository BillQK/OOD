import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cs3500.duration.Duration;
import cs3500.duration.DurationImpl;

import static org.junit.Assert.assertEquals;

public class DurationTest {

  private Duration myDuration;

  @Before
  public void setup() {
    myDuration = new DurationImpl(8, 12, 23);
  }

  @Test
  public void testSort() {
    List<Duration> lod = new ArrayList<>();
    // .. populate list
    lod.add(new DurationImpl(8, 9, 10));
    lod.add(new DurationImpl(4, 9, 15));
    Collections.sort(lod);
    assertEquals("04:09:15", lod.get(0).asHms());
  }

  @Test
  public void testAsHms() {
    Duration d = new DurationImpl(6, 7, 8);
    assertEquals("06:07:08", d.asHms());
  }

  @Test
  public void testAdd() {
    Duration d = new DurationImpl(5, 6, 7);
    Duration d2 = new DurationImpl(4, 3, 8);
    Duration sum = d.add(d2);
    assertEquals(new DurationImpl(9, 9, 15), sum);
  }
}
