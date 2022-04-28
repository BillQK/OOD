package cs3500.duration;

public class CompactDuration extends AbstractDuration {
  private final long inSeconds;

  public CompactDuration(long inSeconds) {
    super("Compact Duration");
    if (inSeconds < 0) {
      throw new IllegalArgumentException("Must be non-negative");
    }
    this.inSeconds = inSeconds;
  }

  protected Duration fromSeconds(long inSeconds) {
    return new CompactDuration(inSeconds);
  }

  @Override
  public String asHms() {
    return asHms(hoursOf(inSeconds),
            minutesOf(inSeconds),
            secondsOf(inSeconds));
  }

  @Override
  public long inSeconds() {
    return inSeconds;
  }

}
