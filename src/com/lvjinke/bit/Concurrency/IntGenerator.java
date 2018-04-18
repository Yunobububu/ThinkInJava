package com.lvjinke.bit.Concurrency;

public abstract class IntGenerator {
    private volatile boolean cancled = false;
    public abstract int next();
    public void cancel(){
        cancled = true;
    }
    public boolean isCancled(){ return cancled;}
}
