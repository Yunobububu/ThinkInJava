package com.lvjinke.bit.Concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ExplicitPairManager extends PairManager{
    private Lock lock = new ReentrantLock();
    public synchronized void increment(){
        lock.lock();
        try{
            p.incrementX();
            p.incrementY();
            store(getPair());
        }finally {
            lock.unlock();
        }
    }
}
class ExplicitPairMangager2 extends PairManager{
    private Lock lock = new ReentrantLock();

    @Override
    public void increment() {
        Pair temp;
        lock.lock();
        try{
            p.incrementY();
            p.incrementX();
            temp = getPair();
        }finally {
            lock.unlock();
        }
        store(temp);
    }
}
public class ExplicitCriticalSection {
    public static void execute(){
        PairManager pam1 = new ExplicitPairManager();
        PairManager pam2 = new ExplicitPairMangager2();
        CirticalSeciton.testApproches(pam1,pam2);
    }
}
