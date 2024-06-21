package org.s4r.fibonacci;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FibonacciTask implements Runnable {
    private long n;
    private String id;

    public FibonacciTask(long n, String id) {
        this.n = n;
        this.id = id;
    }

    private BigDecimal getFibo(long n) {
        if (n == 0) {
            return BigDecimal.ZERO;
        } else if (n == 1) {
            return BigDecimal.ONE;
        } else {
            return getFibo(n - 1).add(getFibo(n - 2));
        }

    }

    @Override
    public void run() {
        var isoFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println("String task " + id + " at " + isoFormatter.format(LocalDateTime.now()));
        var fibo = getFibo(n);
        System.out.println("Ending task " + id + " at " + isoFormatter.format(LocalDateTime.now()));
    }
}
