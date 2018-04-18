package com.lvjinke.bit.Concurrency;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.*;

class SleepBlocked implements Runnable{

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
        System.out.println("Exiting SleepBlocked.run()");
    }
}
class IOBlocked implements Runnable{
    private InputStream in;
    public IOBlocked(InputStream in){
        this.in = in;
    }

    @Override
    public void run() {
        System.out.println("waiting for read():");
        try {
            in.read();
        } catch (IOException e) {
            if(Thread.currentThread().isInterrupted()){
                System.out.println("interrupted by i/o");
            }else {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Exiting IOBlocked run()");
    }
}
class SynchronizedBlocked implements Runnable{
    public synchronized void f(){
        while(true){
            Thread.yield();
        }
    }
    public SynchronizedBlocked(){
        new Thread(){
            public void run(){
                f();
            }
        }.run();
    }
    @Override
    public void run() {
        System.out.println("Trying to call f()");
        f();
        System.out.println("Exiting SynchronizedBlocked.run()");
    }
}

public class Interrupting {
    private static ExecutorService exec = Executors.newCachedThreadPool();
    static void test(Runnable r){
        Future<?> f = exec.submit(r);
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        f.cancel(true);
        System.out.println("Interrupt sent to "+ r.getClass().getName());
    }
    public static void execute(){
        test(new SleepBlocked());
        test(new IOBlocked(System.in));
        test(new SynchronizedBlocked());
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Aborting with system.exit(0)");
        System.exit(0);
    }

}
