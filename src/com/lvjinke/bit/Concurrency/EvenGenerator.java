package com.lvjinke.bit.Concurrency;

public class EvenGenerator extends IntGenerator{
    private  int currentEvenValue = 0;
    @Override
    public synchronized int next() {
        ++ currentEvenValue;
        ++ currentEvenValue;
        return currentEvenValue;
    }
    public static void execute(){
        EvenChecker.test(new EvenGenerator());
    }
}
