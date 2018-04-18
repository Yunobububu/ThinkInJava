package com.lvjinke.bit.Concurrency;

import java.util.concurrent.TimeUnit;

public class SimplePriorities implements Runnable{
    private int countDown = 9;
    private int priority;
    private volatile double d;

    public SimplePriorities(int priority){
        this.priority = priority;
    }
    public String toString(){
        return Thread.currentThread().getName() + ":" + countDown;
    }
    @Override
    public void run() {
        Thread.currentThread().setPriority(priority);
        while(true) {
            for (int i = 0; i < 10000; i++) {
                d += (Math.PI + Math.E) / (double) i;
                if (i % 1000 == 0) {
                    //Thread.yield()
                    //TimeUnit.MILLISECONDS.sleep(1);
                }
            }
            System.out.println(this);
            if(-- countDown== 0) return;
        }
    }
}
