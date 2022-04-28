package cs3500.turtle.control.commands;

import cs3500.turtle.control.TracingTurtleCommand;
import cs3500.turtle.tracingmodel.TracingTurtleModel;

/**
 * Command to save state (push onto the state stack).
 */
public class Save implements TracingTurtleCommand{

  @Override
  public void go(TracingTurtleModel m) {
    m.save();
  }
}
