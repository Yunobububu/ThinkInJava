package com.lvjinke.bit.Concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Meal{
    private final int orderNum;
    public Meal(int num){
        this.orderNum = num;
    }
    public String toString(){
        return "OrderNum: "+ orderNum;
    }


}
class Waiter implements Runnable{
    private  Restaurant restaurant;
    Waiter(Restaurant res){
        this.restaurant = res;
    }
    @Override
    public void run() {
        try{
            while(!Thread.interrupted()){
                synchronized (this) {
                    while (restaurant.meal == null) {
                        wait();
                    }
                }
                System.out.println("waiter get meal "+ restaurant.meal);
                synchronized (restaurant.chef){
                    restaurant.meal = null;
                    restaurant.chef.notifyAll();
                }
            }

        }catch (InterruptedException e){
            System.out.println("waiter Interruped ");
        }

    }
}class Chef implements Runnable{
    private Restaurant restaurant;
    Chef(Restaurant res){
        this.restaurant = res;
    }
    private int count = 0;
    @Override
    public void run() {
        try{
            while(!Thread.interrupted()){
                synchronized (this){
                    while(restaurant.meal != null){
                        wait();
                    }
                }
                if(++count == 10){
                    System.out.println("Out of food,closing");
                    restaurant.exec.shutdownNow();
                }
                System.out.println("Order up!");
                synchronized (restaurant.waiter){
                    restaurant.meal = new Meal(count);
                    restaurant.waiter.notifyAll();
                }
                TimeUnit.MILLISECONDS.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("chef Interrruped");
        }

    }
}
public class Restaurant {
    Meal meal;
    Waiter waiter = new Waiter(this);
    Chef chef = new Chef(this);
    ExecutorService exec = Executors.newCachedThreadPool();
    public Restaurant(){
        exec.execute(waiter);
        exec.execute(chef);
    }
    public static void execute(){
        new Restaurant();
    }

}
