package cs3500.turtle.model;

import java.util.Objects;
import java.util.Stack;

/**
 * This class manages a 2D turtle, having position and heading
 */
public class SimpleTurtle implements TurtleModel {
  // the position of the turtle
  private Position2D position;
  // the heading of the turtle in degrees
  private double heading;
  // stacks to save and retrieve turtle states
  private final Stack<Position2D> stackPositions;
  private final Stack<Double> stackHeadings;

  /**
   * Initializes the turtle to the default state.
   * Default state = position (0,0) and heading (0) meaning
   * looking in the +X direction.
   */
  public SimpleTurtle() {
    this(new Position2D(0, 0), 0);
  }
  /**
   * Initializes the turtle to the given position and heading.
   */
  public SimpleTurtle(Position2D startPos, double startHeading) {
    if (startPos == null) {
      throw new IllegalArgumentException("Starting position can't be null");
    }
    position = startPos;
    heading = startHeading;
    stackPositions = new Stack<>();
    stackHeadings = new Stack<>();
  }

  @Override
  public void move(double distance) {
    //trigonometry to move by distance along angle
    double x = distance * Math.cos(Math.toRadians(heading));
    double y = distance * Math.sin(Math.toRadians(heading));

    position = new Position2D(position.getX() + x, position.getY() + y);
  }

  @Override
  public void turn(double angleDegrees) {
    heading += angleDegrees;
  }

  @Override
  public void save() {
    stackPositions.push(position);
    stackHeadings.push(heading);
  }

  @Override
  public void retrieve() {
    if (stackPositions.isEmpty() || stackHeadings.isEmpty()) {
      throw new IllegalStateException("no state to retrieve");
    }
    position = stackPositions.pop();
    heading = stackHeadings.pop();
  }

  @Override
  public Position2D getPosition() {
    return position;
  }

  @Override
  public double getHeading() {
    return heading;
  }
}
