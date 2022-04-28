package cs3500.calc;

import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CalcModelImplTest {

  @Test
  public void testModel() {
    CalcModel model = new CalcModelImpl();
    assertEquals(15, model.add(10, 5));
  }

  @Test
  public void testController() throws IOException {
    CalcModel model = new CalcModelImpl();
    Readable input = new StringReader("5 6 7 8");
    Appendable outputLog = new StringBuilder();
    CalcController ctrl = new CalcControllerImpl(model, input, outputLog);
    ctrl.go();
    assertEquals("11", outputLog.toString());
    ctrl.go();
    assertEquals("1115", outputLog.toString());
  }

  @Test
  public void testIOException() {
    CalcModel model = new CalcModelImpl();
    Readable input = new StringReader("5 d dad d6 7 8");
    Appendable outputLog = new faillingAppendable();
    CalcController ctrl = new CalcControllerImpl(model, input, outputLog);
    try {
      ctrl.go();
      fail("Expected IOException did not happen");
    } catch (IOException e) {
      assertEquals("Fail", e.getMessage());
    }
  }
}