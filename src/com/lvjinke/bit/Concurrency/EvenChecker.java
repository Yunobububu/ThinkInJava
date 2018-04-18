package com.lvjinke.bit.Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenChecker implements Runnable{
    private IntGenerator generator;
    private final int id;
    public EvenChecker(int id,IntGenerator gen){
        this.id = id;
        this.generator = gen;
    }
    @Override
    public void run() {
        while(!generator.isCancled()){
            int val = generator.next();
            if(val % 2 != 0){
                System.out.println(val + " not even!");
                generator.cancel();
            }
        }
    }
    public static void test(IntGenerator gen,int count){
        System.out.println("press Con + c to exit");
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0;i < count;i++){
            exec.execute(new EvenChecker(count,gen));
        }
        exec.shutdown();
    }
    public static void test(IntGenerator gen){
        test(gen,10);
    }
}
