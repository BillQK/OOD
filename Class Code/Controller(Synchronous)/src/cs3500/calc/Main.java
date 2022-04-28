package cs3500.calc;

import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  //if not static, we need object
  public static void main(String[] args) {
    CalcModel model = new CalcModelImpl();
    CalcController controller = new CalcControllerImpl(model,
            new InputStreamReader(System.in),
            System.out); // maybe pass in the view
    try {
      controller.go();
    } catch (IOException e) {
      System.out.println("Something went wrong");
    }

  }
}
