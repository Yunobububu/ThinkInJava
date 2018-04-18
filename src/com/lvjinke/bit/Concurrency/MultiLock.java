package com.lvjinke.bit.Concurrency;

public class MultiLock {
    public synchronized void f1(int count){
        if(count-- > 0){
            System.out.println("f1() calling f2() wiith count "+ count);
            f2(count);
        }
    }
    public synchronized void f2(int count){
        if(count-- > 0){
            System.out.println("f2() calling f1() wiith count "+ count);
            f1(count);
        }
    }
    public static void execute(){
        final MultiLock multiLock = new MultiLock();
        new Thread(){
            public void run(){
                multiLock.f1(10);
            }
        }.start();
    }
}
