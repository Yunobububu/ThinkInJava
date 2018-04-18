package com.lvjinke.bit.Concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MutexEvenGenerator extends IntGenerator{
    private int currentEvenValue = 0;
    private Lock lock = new ReentrantLock();
    public int next(){
        try{
            lock.lock();
            ++ currentEvenValue;
            Thread.yield();
            ++ currentEvenValue;
            return currentEvenValue;

        }finally {
            lock.unlock();
        }
    }


}
