package edu.grinnell.csc207.util;

public class BasicCounter implements Counter {
    /**
     * the count of the counter.
     */
    int count = 0;
    /**
     * the initial count of the counter.
     */
    int start;

    public BasicCounter(int initialCount) {
        this.count = initialCount;
        this.start = initialCount;
        //System.err.println("BasicCounter");
    }

    @Override
    public void increment() throws Exception {
        count++;
    }

    @Override
    public void reset() {
        count = start;
    }

    @Override
    public int get() {
        return this.count;
    }

    public String toString() {
            return "[" + this.count + "]";

    }
    
}
