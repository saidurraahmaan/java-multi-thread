package org.s4r.runnable;

import java.util.concurrent.TimeUnit;

public class RunnableThreadRunner {
    public static void runRunnableThread() {
        var runnableThread = new RunnableThread();
        var thread = new Thread(runnableThread);
        thread.setName("Runnable Thread");
        thread.start();
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
