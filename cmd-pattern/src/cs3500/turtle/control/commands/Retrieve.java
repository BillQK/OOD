package cs3500.turtle.control.commands;

import cs3500.turtle.control.TracingTurtleCommand;
import cs3500.turtle.tracingmodel.TracingTurtleModel;

/**
 * Command to retrieve state (pop the state stack).
 */
public class Retrieve implements TracingTurtleCommand {
  @Override
  public void go(TracingTurtleModel m) {
    m.retrieve();
  }
}
