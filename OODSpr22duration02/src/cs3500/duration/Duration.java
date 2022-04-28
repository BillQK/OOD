// can duration be negative? No
// what is the resolution of duration? 1 second

// what do we want do?
// add / subtract
// represent as string
// compare one duration to another
// check one duration for equality with another
// get in hours or minutes?

package cs3500.duration;

/**
 * Durations, with a resolution of seconds. All durations are non-negative.
 *
 * <p>Different {@code Duration} implementations should work together,
 * meaning that:
 *
 * <ul>
 *   <li>Two durations must be equal if they have the same number of seconds.</li>
 *   <li>The hash code of a duration is the result of calling
 *        {@link Long#hashCode(long)} on its length in seconds.</li>
 * </ul>
 * </p>
 */
public interface Duration extends Comparable<Duration> {

  /**
   * Add the given Duration to this Duration.
   *
   * @param b the Duration to be added
   * @return the Duration representing the sum
   */
  Duration add(Duration b);

  /**
   *
   * @return
   */
  String asHms();

  //int compareTo(Duration b);
  // a.compareTo(b) : negative ==> a < b
  //                : zero ==> a equals b
  //                : positive ==> a > b

  long inSeconds();
}
