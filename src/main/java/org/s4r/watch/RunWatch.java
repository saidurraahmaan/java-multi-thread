package org.s4r.watch;

public class RunWatch {
    public static void startClock (){
        var watch = new Watch();
        var watchThread = new Thread(watch);
        watchThread.start();

        try {
            Thread.sleep(5000);
            watch.shutdown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
