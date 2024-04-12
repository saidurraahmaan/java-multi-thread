package org.s4r;

import org.s4r.unsafe.UnsafeSequence;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        var counter = new UnsafeSequence();

        int numThreads = 10;
        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter.getNext();
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Final count: " + counter.getNext());

    }
}