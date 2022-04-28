package cs3500.turtle.tracingmodel;

import java.util.ArrayList;
import java.util.List;

import cs3500.turtle.model.Position2D;
import cs3500.turtle.model.SimpleTurtle;

/**
 * A turtle implementation that includes the ability to trace lines as well as move and turn.
 */
public class SmarterTurtle extends SimpleTurtle implements TracingTurtleModel {
  //list of lines traced since this object was created
  private final List<Line> lines;

  public SmarterTurtle() {
    lines = new ArrayList<>();
  }

  @Override
  public void trace(double distance) {
    Position2D cur = this.getPosition();
    move(distance);
    lines.add(new Line(cur, this.getPosition()));
  }

  @Override
  public List<Line> getLines() {
    return new ArrayList<>(lines);
    // below only necessary if Line were mutable (it's not)
    // List<Line> ret = new ArrayList<>();
    // for(Line l : lines) {
    //   ret.add(new Line(l.getStart(), l.getEnd()));
    // }
    // return ret;
  }
}
