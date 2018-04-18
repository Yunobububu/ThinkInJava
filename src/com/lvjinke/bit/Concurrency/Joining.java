package com.lvjinke.bit.Concurrency;

class Sleeper extends Thread{
    private int duration;
    private String name;

    public Sleeper(int duration,String name){
        super(name);
        this.duration = duration;
        this.name = name;
        start();
    }
    public void run(){
        try {
            sleep(duration);
        } catch (InterruptedException e) {
            System.out.println(getName()+" was interrupted." + "isInterrupted: "+ isInterrupted());
        }
        System.out.println(getName()+ " has been awakened");
    }
}
class Joiner extends Thread{
    private Sleeper sleeper;
    public Joiner(String name,Sleeper sleeper){
        super(name);
        this.sleeper = sleeper;
        start();
    }
    public void run(){
        try {
            sleeper.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println(getName()+ " join Completed");
    }
}
public class Joining {
    public static void execute(){
        Sleeper sleepy = new Sleeper(1500,"sleepy");
        Sleeper grumpy = new Sleeper(1500,"grumpy");

        Joiner dopy = new Joiner("dopy",sleepy);
        Joiner cou = new Joiner("cou",grumpy);
        grumpy.interrupt();

    }
}
