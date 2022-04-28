package cs3500.turtle.control.commands;


import cs3500.turtle.control.TracingTurtleCommand;
import cs3500.turtle.tracingmodel.TracingTurtleModel;

/**
 * A command that draws a Koch snowflake fractal pattern using the turtle.
 */
public class Koch implements TracingTurtleCommand {

  private final double d;
  private final int depth;

  public Koch(double distance,int depth) {
    d = distance;
    this.depth = depth;
  }
  @Override
  public void go(TracingTurtleModel m) {
    drawKoch(d, depth, m);
    m.turn(-120);
    drawKoch(d, depth, m);
    m.turn(-120);
    drawKoch(d, depth, m);
    m.turn(-120);
  }

  private void drawKoch(double distance, int depth, TracingTurtleModel model) {
    if (depth > 0) {
      drawKoch(distance / 3,depth - 1, model);
      model.turn(60);
      drawKoch(distance / 3,depth - 1, model);
      model.turn(-120);
      drawKoch(distance / 3,depth - 1, model);
      model.turn(60);
      drawKoch(distance / 3,depth - 1, model);
    } else {
      model.trace(distance);
    }
  }
}
