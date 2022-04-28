package cs3500.duration;

import java.util.Objects;

/**
 * Represents a basic form of a Duration.
 */
public class DurationImpl extends AbstractDuration {
  private final int hours;
  private final int minutes;
  private final int seconds;

  /**
   * Construct a Duration
   *
   * @param hours   the hours of the Duration
   * @param minutes the minutes of the Duration
   * @param seconds the seconds of the Duration
   */
  public DurationImpl(int hours, int minutes, int seconds) {
    super("DurationImpl");
    if (hours < 0 || minutes < 0 || seconds < 0) {
      throw new IllegalArgumentException("Duration specifiers can't be negative");
    }
    // deal with spiller: e.g. 67 minutes sor 130 seconds
    if (seconds > 59) {
      minutes += seconds / 60;
      seconds %= 60;
    }
    if (minutes > 59) {
      hours += minutes / 60;
      minutes %= 60;
    }
    this.hours = hours;
    this.minutes = minutes;
    this.seconds = seconds;
  }

  public DurationImpl(long inSeconds) {
    super("DurationImpl");
    if (inSeconds() < 0) {
      throw new IllegalArgumentException("Must be non-negative");
    }
    this.seconds = secondsOf(inSeconds);
    this.minutes = minutesOf(inSeconds);
    this.hours = hoursOf(inSeconds);
  }

  protected Duration fromSeconds(long inSeconds) {
    return new DurationImpl(inSeconds);
  }

  @Override
  public String asHms() {
    return asHms(hours,minutes,seconds);
  }

  @Override
  public long inSeconds() {
    return 3600 * (long) hours + 60 * (long) minutes + seconds;
  }
}

