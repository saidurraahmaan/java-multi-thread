package org.s4r.fibonacci;

public class RunFibonacciTask {
    public static void startFibonacciTask (){
        var t1 = new Thread(new FibonacciTask(45,"FiboTask#1"));
        var t2 = new Thread(new FibonacciTask(45,"FiboTask#2"));
        var t3 = new Thread(new FibonacciTask(45,"FiboTask#3"));
        var t4 = new Thread(new FibonacciTask(45,"FiboTask#4"));
        var t5 = new Thread(new FibonacciTask(45,"FiboTask#5"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
