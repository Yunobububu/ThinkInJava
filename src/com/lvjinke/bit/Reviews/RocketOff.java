package com.lvjinke.bit.Reviews;

public class RocketOff implements Runnable{
    private int n = 9;
    @Override
    public void run() {
        while(n > 0){
            System.out.print("#"+n);
            n--;
        }
    }
    public String toString(){
        return "The RocketOff Task";
    }
}
