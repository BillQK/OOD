package cs3500.turtle.control.commands;

import cs3500.turtle.control.TracingTurtleCommand;
import cs3500.turtle.control.UndoableTTCmd;
import cs3500.turtle.tracingmodel.TracingTurtleModel;

/**
 * Command to move the turtle a specified distance.
 */
public class Move implements TracingTurtleCommand {
  private final double dist;

  public Move(Double dist) {
    this.dist = dist;
  }

  @Override
  public void go(TracingTurtleModel model) {
    model.move(this.dist);
  }

//  @Override
//  public void undo(TracingTurtleModel m) {
//
//  }
}
