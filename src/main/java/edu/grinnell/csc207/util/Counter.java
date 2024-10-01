package edu.grinnell.csc207.util;

/**
 * Things that count.
 */
public interface Counter {
  /**
   * Count something.
   *
   * @throws Exception
   *   When the count gets too large.
   */
  public void increment() throws Exception;

  /**
   * Reset the counter.
   */
  public void reset();

  /**
   * Get the value of the counter.
   *
   * @return the current value of the counter
   */
  public int get();
} // interface Counter
