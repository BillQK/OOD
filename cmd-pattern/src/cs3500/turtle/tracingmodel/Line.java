package cs3500.turtle.tracingmodel;

import java.util.Objects;

import cs3500.turtle.model.Position2D;

/**
 * Represents a line, having a starting point and an ending point.
 */
public final class Line {
  private final Position2D start;
  private final Position2D end;

  public Line(Position2D start, Position2D end) {
    this.start = start;
    this.end = end;
  }

  /**
   * Get the start point of the line
   *
   * @return the start point
   */
  public Position2D getStart() {
    return start;
  }

  public Position2D getEnd() {
    return end;
  }

  @Override
  public String toString() {
    return String.format("%s--%s", this.start.toString(), this.end.toString());
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Line)) {
      return false;
    }

    Line line = (Line) o;

    return (this.start.equals(line.start) && this.end.equals(line.end))
            || (this.end.equals(line.start) && this.start.equals(line.end));
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.start, this.end);
  }
}
