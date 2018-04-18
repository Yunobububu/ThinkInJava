package com.lvjinke.bit.Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
    public static void execute(){
        ExecutorService exec = Executors.newFixedThreadPool(5);
        for(int i = 0;i< 5;i++){
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
