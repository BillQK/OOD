package cs3500.turtle.control.commands;

import cs3500.turtle.control.TracingTurtleCommand;
import cs3500.turtle.tracingmodel.TracingTurtleModel;

/**
 * Command to turn by a specified angle
 */
public class Turn implements TracingTurtleCommand {
  private final double angle;

  public Turn(Double angle) {
    this.angle = angle;
  }

  @Override
  public void go(TracingTurtleModel m) {
    m.turn(this.angle);
  }
}
