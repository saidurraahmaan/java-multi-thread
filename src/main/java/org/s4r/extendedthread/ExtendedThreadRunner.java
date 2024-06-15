package org.s4r.extendedthread;

import java.util.concurrent.TimeUnit;

public class ExtendedThreadRunner {

    public static void runExtendedThread() {
        var extendedThread = new ExtendedThread();
        extendedThread.setName("Extended Thread");
        extendedThread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("[" + i + "] Inside " + Thread.currentThread().getName());
            sleepOneSecond();
        }

    }

    private static void sleepOneSecond() {
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
