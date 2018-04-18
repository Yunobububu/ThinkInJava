package com.lvjinke.bit.Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExceptionThread implements Runnable{
    @Override
    public void run() {
        throw new RuntimeException();
    }
    public static void execute(){
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new ExceptionThread());
        exec.shutdown();
    }
}
