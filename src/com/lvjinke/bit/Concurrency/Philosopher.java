package com.lvjinke.bit.Concurrency;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Philosopher implements Runnable{
    private Chopstick left ;
    private Chopstick right;
    private final int id;
    private int ponderFactor;
    private Random random = new Random(47);
    public Philosopher(Chopstick left,Chopstick right,int id,int ponderFactor){
        this.left = left;
        this.right = right;
        this.id = id;
        this.ponderFactor = ponderFactor;
    }
    private void pause() throws InterruptedException {
        if(ponderFactor == 0){return;}
        TimeUnit.MILLISECONDS.sleep(random.nextInt(ponderFactor * 250));

    }
    @Override
    public void run() {
        try{
            while (!Thread.interrupted()){
                System.out.println(this + " " + "thinking");
                pause();
                System.out.println(this + " " + "grabbign left");
                left.take();
                System.out.println(this + " " + "grabbign right");
                right.take();
                System.out.println(this + " " + "eating");
                pause();
                right.drop();
                left.drop();

            }
        }catch (InterruptedException e) {
            System.out.println(this + " " + "exiting via interrupt");
        }
    }
    public String toString(){
        return "Philosopher " + id;
    }
}
