package edu.grinnell.csc207;

import edu.grinnell.csc207.util.BasicCounter;
import edu.grinnell.csc207.util.BoundedCounter;
import edu.grinnell.csc207.util.Counter;
import edu.grinnell.csc207.util.DecrementableCounter;
import edu.grinnell.csc207.util.DoubleCounter;
import edu.grinnell.csc207.util.NamedCounter;
// import edu.grinnell.csc207.util.BasicCounter;
import edu.grinnell.csc207.util.Tally;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.PrintWriter;

import org.junit.jupiter.api.Test;

/**
 * Tests of our counter class.
 *
 * @author Samuel A. Rebelsky
 * @author Sam Schmidt
 * @author Paden Houck
 */
public class CounterTests {

    /**
     * Some basic tests of our BasicCounter objects.
     */
    @Test
    public void test1() throws Exception {
        Counter alpha = new NamedCounter("alfa", 0);
        Counter beta = new DoubleCounter(123);
        BasicCounter gamma = new BoundedCounter(-5,3);

        assertEquals(0, alpha.get(), "original alpha");
        assertEquals(123, beta.get(), "original beta");
        assertEquals(-5, gamma.get(), "original gamma");
        for (int i = 0; i < 10; i++) {
            alpha.increment();
            beta.increment();
            gamma.increment();
        } // for
        assertEquals(10, alpha.get(), "updated alpha");
        assertEquals(143, beta.get(), "updated beta");
        assertEquals(5, gamma.get(), "updated gamma");
        alpha.reset();
        beta.reset();
        gamma.reset();
        assertEquals(0, alpha.get(), "reset alpha");
        assertEquals(123, beta.get(), "reset beta");
        assertEquals(-5, gamma.get(), "reset gamma");

        gamma.reset();
        assertEquals(-5, gamma.get(), "reset gamma");
        //gamma.decrement();
        assertEquals(-6, gamma.get(), "decremented gamma");
    } // test1()
} // class CounterTests
