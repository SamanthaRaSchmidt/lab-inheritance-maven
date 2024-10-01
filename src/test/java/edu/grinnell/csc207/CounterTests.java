package edu.grinnell.csc207;

import edu.grinnell.csc207.util.BasicCounter;
import edu.grinnell.csc207.util.Counter;
// import edu.grinnell.csc207.util.BasicCounter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.PrintWriter;

import org.junit.jupiter.api.Test;

/**
 * Tests of our counter class.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 * @author Your Name Here
 */
public class CounterTests {
    public static void main(String[] args) throws Exception {
    // Set up output
    PrintWriter pen = new PrintWriter(System.out, true);

    // Set up some counters
    Counter alpha = new BasicCounter(0);
    Counter beta = new BasicCounter(123);
    Counter gamma = new BasicCounter(-5);

    // Print original values
    pen.println("Original alpha = " + alpha);
    pen.println("Original beta = " + beta);
    pen.println("Original gamma = " + gamma);
  
    // Print incremented values
    alpha.increment();
    beta.increment();
    gamma.increment();
    pen.println("Updated alpha = " + alpha);
    pen.println("Updated beta = " + beta);
    pen.println("Updated gamma = " + gamma);

    // And we're done
    pen.close();
  } // main(String[])
    /**
     * Some basic tests of our BasicCounter objects.
     */
    @Test
    public void test1() throws Exception {
        Counter alpha = new BasicCounter(0);
        Counter beta = new BasicCounter(123);
        Counter gamma = new BasicCounter(-5);
        assertEquals(0, alpha.get(), "original alpha");
        assertEquals(123, beta.get(), "original beta");
        assertEquals(-5, gamma.get(), "original gamma");
        for (int i = 0; i < 10; i++) {
            alpha.increment();
            beta.increment();
            gamma.increment();
        } // for
        assertEquals(10, alpha.get(), "updated alpha");
        assertEquals(133, beta.get(), "updated beta");
        assertEquals(5, gamma.get(), "updated gamma");
        alpha.reset();
        beta.reset();
        gamma.reset();
        assertEquals(0, alpha.get(), "reset alpha");
        assertEquals(123, beta.get(), "reset beta");
        assertEquals(-5, gamma.get(), "reset gamma");
    } // test1()
} // class CounterTests
