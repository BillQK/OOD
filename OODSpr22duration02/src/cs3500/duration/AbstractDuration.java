package cs3500.duration;

import java.util.Objects;

abstract class AbstractDuration implements Duration {
  private final String name;

  protected AbstractDuration(String name) {
    this.name = name;
  }

  protected abstract Duration fromSeconds(long inSeconds);

  protected static String asHms(int hours, int minutes, int seconds){
    return String.format("%d:%02d:%02d", hours, minutes, seconds);
  }

  protected static int minutesOf(long inSeconds) {
    return (int) (inSeconds / 60 % 60);
  }

  protected static int secondsOf(long inSeconds) {
    return (int) (inSeconds % 60);
  }

  protected static int hoursOf(long inSeconds) {
    if (inSeconds / 3600 > Integer.MAX_VALUE) {
      throw new ArithmeticException("result cannot fit in type");
    }

    return (int) (inSeconds / 3600);
  }

  public abstract String asHms();

  @Override
  public Duration add(Duration that) {
    return fromSeconds(inSeconds() + that.inSeconds());
  }
  @Override
  public int compareTo(Duration o) {
    return Long.compare(inSeconds(), o.inSeconds());
  }
  @Override
  public String toString(){
    return asHms();
  }
  @Override
  public boolean equals(Object o) {
    if (o instanceof DurationImpl){
      Duration other = (Duration) o;
      return inSeconds() == other.inSeconds();
    }
    else {
      return false;
    }
  }
  @Override
  public int hashCode(){
    return Objects.hash(inSeconds());
  }
}
