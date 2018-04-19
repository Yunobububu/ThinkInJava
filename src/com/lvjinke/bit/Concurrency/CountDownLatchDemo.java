package com.lvjinke.bit.Concurrency;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class TaskPortion implements Runnable{

    private static int counter = 0;
    private final int id = counter++;
    private static Random random = new Random(47);
    private final CountDownLatch lanch;
    TaskPortion(CountDownLatch lanch){ this.lanch = lanch;}
    @Override
    public void run() {
        try{
            doWork();
            lanch.countDown();
        }catch (InterruptedException e){
            System.out.println();
        }
    }
    public void doWork() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(random.nextInt(40));
        System.out.println(this+ "completed");
    }
    public String toString(){
        return String.format("%d ",id);
    }
}
class WaitingTask implements Runnable{
    private static int counter = 0;
    private final int id = counter++;
    private final CountDownLatch latch;
    WaitingTask(CountDownLatch latch){ this.latch = latch;}

    @Override
    public void run() {
        try{
            latch.await();
        }catch (InterruptedException e){
            System.out.println(this+ " interrrupted");
        }
        System.out.println("latch barrier passed for "+ this);
    }
    public String toString(){
        return String.format("WaitingTask %d ",id);
    }
}
public class CountDownLatchDemo {
    static final int SIZE = 100;
    public static void execute(){
        ExecutorService exec = Executors.newCachedThreadPool();
        CountDownLatch latch = new CountDownLatch(SIZE);
        for(int i = 0;i < 10;i++){
            exec.execute(new WaitingTask(latch));
        }
        for(int i = 0;i < SIZE;i++){
            exec.execute(new TaskPortion(latch));
        }
        System.out.println("lanuched all tasks");
        exec.shutdownNow();
    }
}
