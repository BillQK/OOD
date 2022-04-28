package cs3500.turtle.control.commands;

import cs3500.turtle.control.TracingTurtleCommand;
import cs3500.turtle.tracingmodel.TracingTurtleModel;

/**
 * Command to trace a line for a specified distance.
 */
public class Trace implements TracingTurtleCommand {
  private final double dist;

  public Trace(Double dist) {
    this.dist = dist;
  }

  @Override
  public void go(TracingTurtleModel m) {
    m.trace(this.dist);
  }
}
