package com.lvjinke.bit.Concurrency;

import java.util.concurrent.TimeUnit;

public class SimpleDaemons implements Runnable{

    @Override
    public void run() {
        while(true){
            try {
                TimeUnit.MILLISECONDS.sleep(1);
                System.out.println(Thread.currentThread() + "" + this);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
