package com.lvjinke.bit.Concurrency;

import com.lvjinke.bit.Array.RandomGenerator;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

class Toast{
    public enum Status{DRY,BUTTERED,JAMMED}
    private Status status = Status.DRY;
    private final int id;
    public Toast(int id){ this.id = id;}
    public void butter(){ status = Status.BUTTERED;}
    public void jam(){ status = Status.JAMMED;}
    public Status getStatus(){
        return status;
    }
    public int getId(){ return id;}
    public String toString(){
        return "Toast "+ id +": "+status;
    }
}
class ToastQueue extends LinkedBlockingQueue<Toast>{}
class Toaster implements Runnable{
    private ToastQueue toasts;
    private int count = 0;
    private Random random = new Random(47);
    public Toaster(ToastQueue tq){ this.toasts = tq;}

    @Override
    public void run() {
        try{
            while(!Thread.interrupted()){
                TimeUnit.MILLISECONDS.sleep(100+ random.nextInt(500));
                Toast t = new Toast(count++);
                System.out.println(t);
                toasts.put(t);
            }
        }catch (InterruptedException e){
            System.out.println("Toaster interrupted");
        }
        System.out.println("Toaster off");
    }
}
class Butter implements Runnable{
    private ToastQueue dryQueue,butteredQueue;
    public Butter(ToastQueue dry,ToastQueue butter){
        this.dryQueue = dry;
        this.butteredQueue =butter;
    }
    @Override
    public void run() {
        try{
            while(!Thread.interrupted()){
                Toast t = dryQueue.take();
                t.butter();
                System.out.println(t);
                butteredQueue.put(t);
            }
        }catch (InterruptedException e){
            System.out.println("Butter Interrupted");
        }
        System.out.println("Buffer off");
    }
}
class Jammer implements Runnable{
    private ToastQueue butteredQueue,finishedQueue;
    public Jammer(ToastQueue butteredQueue,ToastQueue finishedQueue){
        this.butteredQueue = butteredQueue;
        this.finishedQueue = finishedQueue;
    }

    @Override
    public void run() {
        try{
            while(!Thread.interrupted()){
                Toast t = butteredQueue.take();
                t.jam();
                System.out.println(t);
                finishedQueue.put(t);
            }
        }catch (InterruptedException e){
            System.out.println("Jammer Interrupted");
        }
        System.out.println("Jammer off");
    }
}
class Eater implements Runnable{

    private ToastQueue finishedQueue;
    private int counter = 0;
    public Eater(ToastQueue finishedQueue){
        this.finishedQueue = finishedQueue;
    }
    @Override
    public void run() {
        try{
            while(!Thread.interrupted()){
                Toast t = finishedQueue.take();
                if(t.getId() != counter++ ||
                        t.getStatus() !=Toast.Status.JAMMED){
                    System.out.println(">>>>Error"+ t);
                    System.exit(1);
                }else {
                    System.out.println("CHomp! " + t);
                }

            }
        }catch (InterruptedException e){
            System.out.println("Eater interruped");
        }
        System.out.println("Eater off");
    }
}
public class ToastOmatic {
    public static void execute() throws InterruptedException {
        ToastQueue dryQueue = new ToastQueue();
        ToastQueue butterQueue = new ToastQueue();
        ToastQueue finishQueue = new ToastQueue();
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new Toaster(dryQueue));
        exec.execute(new Butter(dryQueue,butterQueue));
        exec.execute(new Jammer(butterQueue,finishQueue));
        exec.execute(new Eater(finishQueue));
        TimeUnit.SECONDS.sleep(5);
        exec.shutdownNow();
    }
}
