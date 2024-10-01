package edu.grinnell.csc207.util;

public class BoundedCounter extends BasicCounter {
    int bound;
    /**
     * @param initialCount
     */
    public BoundedCounter(int initialCount, int initialBound) {
        super(initialCount);
        this.bound = initialBound;
    }
    @Override
    public void increment() throws Exception{
        // TODO Auto-generated method stub
        super.increment();
        if (this.count > this.bound) {
            throw new Exception();
        }
    }
}
