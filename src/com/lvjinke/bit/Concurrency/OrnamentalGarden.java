package com.lvjinke.bit.Concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Count{
    private int count = 0;
    private Random random = new Random(47);
    public synchronized int increment(){
        int temp = count;
        if(random.nextBoolean()){
            Thread.yield();
        }
        return (count = ++temp);
    }
    public synchronized int value(){return count;}
}
class Entrance implements Runnable{
    private static Count count = new Count();
    private static List<Entrance> entrances = new ArrayList<>();
    private int number;
    private final int id;
    private static volatile boolean canceled = false;
    public static void cancle(){canceled = true;}
    public Entrance(int id ){
        this.id = id;
        entrances.add(this);
    }

    @Override
    public void run() {
        while (!canceled){
            synchronized (this){
                ++number;
            }
            System.out.println(this + " Total: "+count.increment());
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("sleep interrupted");
            }
            System.out.println("stopping "+ this);
        }
    }
    public synchronized int getValue(){
        return number;
    }
    public String toString(){
        return "Entrance "+ id +":" +getValue();
    }
    public static int getTotal(){
        return count.value();
    }
    public static int sumEntrances(){
        int sum = 0;
        for(Entrance entrance:entrances){
            sum += entrance.getValue();
        }
        return sum;
    }

}
public class OrnamentalGarden {
    public static void execute(){
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0;i < 5;i++){
            exec.execute(new Entrance(i));
        }
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Entrance.cancle();
        exec.shutdown();
        try {
            if(!exec.awaitTermination(250,TimeUnit.MILLISECONDS)){
                System.out.println("Some tasks were not terminanted");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Total: "+Entrance.getTotal());
        System.out.println("Sum of Entrances:" + Entrance.sumEntrances());
    }

}
