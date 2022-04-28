package cs3500.calc;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcControllerImpl implements CalcController {
  private final CalcModel model;
  private final Readable input;
  private final Appendable output;
  private final Scanner scan;

  public CalcControllerImpl(CalcModel model, Readable input, Appendable output) {
    this.model = model;
    this.input = input;
    this.output = output;
    scan = new Scanner(input);
  }

  @Override
  public void go() throws IOException {
    Integer a = null;
    while (a == null) {
      try {
         a = scan.nextInt();
      } catch (InputMismatchException ime){
        output.append("Invalid Integer: " + scan.next() + "\n");
      }
    }
    Integer b = null;
    while (b == null ) {
      String value = scan.next();
      try {
        b = Integer.parseInt(value);
      } catch (NumberFormatException nfo) {
        output.append("Invalid Integer: " + value + "\n");
      }
    }

    // send this to the view model
    output.append(Integer.toString(model.add(a, b)));
  }
}
