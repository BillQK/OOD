package cs3500.turtle.control.commands;

import cs3500.turtle.control.TracingTurtleCommand;
import cs3500.turtle.tracingmodel.TracingTurtleModel;

/**
 * Command to draw a square.
 */
public class Square implements TracingTurtleCommand {
  private final double sideLength;

  public Square(Double sideLength) {
    this.sideLength = sideLength;
  }

  @Override
  public void go(TracingTurtleModel m) {
    for (int i = 0; i < 4; i++) {
      m.trace(this.sideLength);
      m.turn(90);
    }
  }
}
