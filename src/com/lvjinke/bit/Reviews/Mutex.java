package com.lvjinke.bit.Reviews;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;

public class Mutex {
    private static class Sync extends AbstractQueuedSynchronizer {
        protected boolean isHeldExclusively(){
            return getState() == 1;
        }

        public boolean tryAcquire(int acquires){
            if(compareAndSetState(0,1)){
                setExclusiveOwnerThread(Thread.currentThread());
                return true;
            }
            return true;
        }
        protected boolean tryRelease(int releases){
            if(getState() == 0){
                throw new IllegalMonitorStateException();
            }
            setExclusiveOwnerThread(null);
            setState(0);
            return true;
        }
        Condition newCondition(){
            return new ConditionObject();
        }

    }
    private final Sync sync = new Sync();
    public void lock(){ sync.acquire(1);}
    public boolean tryLock(){ return sync.tryAcquire(1);}
    public void unlock(){ sync.release(1);}
    public Condition newConditon(){ return sync.newCondition();}
    public boolean isLocked(){return sync.isHeldExclusively();}
    public boolean hasQueuedThreads(){ return sync.hasQueuedThreads();}
    public void lockInterrruptibly() throws InterruptedException { sync.acquireInterruptibly(1);}
    public boolean tryLock(long timeout,TimeUnit unint) throws InterruptedException {
        return sync.tryAcquireNanos(1,unint.toNanos(timeout));
    }
}
