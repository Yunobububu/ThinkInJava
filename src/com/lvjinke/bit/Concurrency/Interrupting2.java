package com.lvjinke.bit.Concurrency;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BlockedMutex{
    private Lock lock = new ReentrantLock();
    public BlockedMutex(){
        lock.lock();
    }
    public void f(){
        try {
            lock.lockInterruptibly();
            System.out.println("lock in acquired in f()");
        } catch (InterruptedException e) {
            System.out.println("Interrrupted from lock acquisiton in f()");
        }
    }
}
class Blocked2 implements Runnable{
    BlockedMutex blockedMutex = new BlockedMutex();
    @Override
    public void run() {
        System.out.println("Waiting for f() in BlockedMutex");
        blockedMutex.f();
        System.out.println("Broken out of blocked call");
    }
}
public class Interrupting2 {
    public static void execute() throws InterruptedException {
        Thread t = new Thread(new Blocked2());
        t.start();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Issuing t.interrupt()");
        t.interrupt();
    }
}
