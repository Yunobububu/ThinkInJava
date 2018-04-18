package com.lvjinke.bit.Concurrency;

import java.util.concurrent.TimeUnit;

public class SleepingTask extends LiftOff{
    public void run(){
        while(countDown-- > 0){
            System.out.println(status());
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
