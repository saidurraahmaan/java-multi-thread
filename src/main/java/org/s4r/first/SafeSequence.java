package org.s4r.first;

public class SafeSequence {
    private int value;

    public synchronized int getNext() {
        return value++;
    }
}
