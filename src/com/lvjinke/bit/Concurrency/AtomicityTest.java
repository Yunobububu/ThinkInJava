package com.lvjinke.bit.Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AtomicityTest implements Runnable {
    private int i = 0;
    private int getValue(){return i;};
    private synchronized void enevIncrement(){i++;i++;};
    @Override
    public void run() {
        while(true){
            enevIncrement();
        }
    }
    public static void execute(){
        ExecutorService exec = Executors.newCachedThreadPool();
        AtomicityTest at = new AtomicityTest();
        exec.execute(at);
        while(true){
            int val = at.getValue();
            if(val % 2 == 0){
                System.out.println(val);
                System.exit(0);
            }
        }
    }
}
