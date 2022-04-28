package cs3500.turtle.control;

import cs3500.turtle.tracingmodel.TracingTurtleModel;

/**
 * A potential approach to implementing an "undo" feature for turtle commands.
 */
public interface UndoableTTCmd extends TracingTurtleCommand {
  void undo(TracingTurtleModel m);
}
