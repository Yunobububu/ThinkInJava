package com.lvjinke.bit.Concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

class Horse1 implements Runnable{
    private static int counter = 0;
    private final  int id = counter++;
    private int strides = 0;
    private Random random = new Random();
    private static CyclicBarrier barrier;
    Horse1(CyclicBarrier barrier){
        this.barrier =barrier;
    }
    public synchronized  int getStrides(){return strides;};
    public String toString(){return "Horse " + id + " ";}
    public String tracks(){
        StringBuilder s = new StringBuilder();
        for(int i = 0;i < getStrides();i++){
            s.append("*");
        }
        s.append(id);
        return s.toString();
    }
    @Override
    public void run() {
        try{
            while(!Thread.interrupted()){
                synchronized (this){
                    strides += random.nextInt(3);
                }
                barrier.await();
            }
        }catch (InterruptedException e){

        }catch (BrokenBarrierException e){
            throw new RuntimeException(e);
        }

    }
}
public class HorseRace {
    static final int FINSH_LINE = 75;
    private List<Horse1> horses = new ArrayList<>();
    private ExecutorService exec = Executors.newCachedThreadPool();
    private CyclicBarrier barrier;
    public HorseRace(int nHorses,int pause){
        barrier = new CyclicBarrier(nHorses, new Runnable() {
            @Override
            public void run() {
                StringBuilder s  = new StringBuilder();
                for(int i = 0;i < FINSH_LINE;i++){
                    s.append("=");
                }
                System.out.println(s);
                for(Horse1 horse:horses){
                    System.out.println(horse.tracks());
                }
                for(Horse1 horse:horses){
                    if(horse.getStrides() >= FINSH_LINE){
                        System.out.println(horse + " won!");
                        exec.shutdownNow();
                        return;
                    }
                    try {
                        TimeUnit.MILLISECONDS.sleep(pause);
                    } catch (InterruptedException e) {
                        System.out.println("barrier-action sleep interrupted");
                    }
                }

            }
        });
        for(int i=0;i < nHorses;i++){
            Horse1 horse = new Horse1(barrier);
            horses.add(horse);
            exec.execute(horse);
        }
    }
    public static  void main(String[] args){
        int nHorse = 7;
        int pause = 200;
        new HorseRace(nHorse,pause);
    }
}
