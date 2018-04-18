package com.lvjinke.bit.Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Car{
    private boolean waxOn = false;
    public synchronized void waxed(){
        waxOn = true;
        notifyAll();
    }
    public synchronized void buffed(){
        waxOn = false;
        notifyAll();
    }
    public synchronized void waitingForWax() throws InterruptedException {
        while(waxOn == false){
            wait();
        }
    }
    public synchronized void waitingForBuff() throws InterruptedException {
        while(waxOn == true){
            wait();
        }
    }

}
class WaxOn implements Runnable{
    private Car car;
    public WaxOn(Car car){ this.car = car;}

    @Override
    public void run() {
        try {
            while(!Thread.interrupted()){
                System.out.println("WaxOn");
                TimeUnit.MILLISECONDS.sleep(200);
                car.waxed();
                car.waitingForBuff();
            }
        } catch (InterruptedException e) {
            System.out.println("Exiting via interrupt");
        }
        System.out.println("Ending Wax On task");
    }
}
class WaxOff implements Runnable{
    private Car car;
    public WaxOff(Car car){this.car = car;}
    @Override
    public void run() {
        try {
            while(!Thread.interrupted()) {

                car.waitingForWax();
                System.out.println("Wax Off");
                TimeUnit.MILLISECONDS.sleep(200);
                car.buffed();
            }
        } catch (InterruptedException e) {
            System.out.println("Exiting via interrupt");
        }
        System.out.println("Ending Wax Off task");
    }
}
public class WaxOMatic {
    public static void execute() throws InterruptedException {
        Car car = new Car();
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new WaxOff(car));
        exec.execute(new WaxOn(car));
        TimeUnit.SECONDS.sleep(10);
        exec.shutdownNow();
    }
}
