package com.lvjinke.bit.Concurrency;

public class MoreThreads {
    public static void execute(){
        for(int i = 0;i < 5;i++){
            new Thread(new LiftOff()).start();
        }
        System.out.println("Waiting for liftoff:");
    }
}
