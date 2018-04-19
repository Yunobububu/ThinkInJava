package com.lvjinke.bit.Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DeadLockingDinningPhilosopher {
    public static void execute() throws InterruptedException {
        int ponder = 0;
        int size = 5;
        ExecutorService exec = Executors.newCachedThreadPool();
        Chopstick[] chopsticks = new Chopstick[size];
        for(int i = 0;i < size;i++){
            chopsticks[i] = new Chopstick();
        }
        for(int i = 0;i < size;i++){
            exec.execute(new Philosopher(chopsticks[i],chopsticks[(i + 1) % size],i,size));
        }
        TimeUnit.SECONDS.sleep(20);
    }
}
