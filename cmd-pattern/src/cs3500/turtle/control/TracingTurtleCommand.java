package cs3500.turtle.control;

import cs3500.turtle.tracingmodel.TracingTurtleModel;

/**
 * Represents a single command that can be performed in turtle graphics. Main interface for the
 * command pattern implementation.
 */
public interface TracingTurtleCommand {

  /**
   * Executes the command.
   *
   * @param m the model
   */
  void go(TracingTurtleModel m);
}
