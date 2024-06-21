package org.s4r.watch;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Watch implements Runnable {
    private volatile boolean running = true;
    @Override
    public void run() {
        while (running) {
            printCurrentTime();
            sleepOneSecond();
            if (Thread.interrupted()) {
                System.out.println("Thread is interrupted");
                return;
            }
        }
    }

    private static void sleepOneSecond() {
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void printCurrentTime() {
        var formatter = DateTimeFormatter.ofPattern("HH:mm:s a");
        var formattedCurrentTime = LocalDateTime.now().format(formatter);
        System.out.println(formattedCurrentTime);
    }

     void shutdown(){
        this.running = false;
    }
}
