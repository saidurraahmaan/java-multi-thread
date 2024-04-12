package org.s4r.first;

public class First {
    public static void execute() {

        try {
            var counter = new SafeSequence();

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

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
