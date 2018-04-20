package com.lvjinke.bit.Concurrency;

import org.junit.Test;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

class PrioritizedTask implements Runnable,Comparable<PrioritizedTask>{
    private Random random = new Random(47);
    private static int counter = 0;
    private final int id = counter++;
    private final int priority;
    protected static List<PrioritizedTask> sequence = new ArrayList<>();
    public PrioritizedTask(int priority){
        this.priority = priority;
        sequence.add(this);
    }
    @Override
    public int compareTo(PrioritizedTask o) {
        return priority < o.priority ? 1 :
                (priority > o.priority ? -1 : 0);
    }

    @Override
    public void run() {
        try{
            TimeUnit.MILLISECONDS.sleep(250);
        }catch (InterruptedException e){

        }
        System.out.println(this);
    }
    public String toString(){
        return priority + " Task " + id;
    }
    public String summary(){
        return "(" + id + ":" + priority + ")";
    }
    public static class EndSential extends PrioritizedTask{
        private ExecutorService exec;
        public EndSential(ExecutorService exec){
            super(-1);
            this.exec = exec;
        }
        public void run(){
            int count = 0;
            for(PrioritizedTask pt:sequence){
                System.out.println(pt.summary());
                if(++count % 5 == 0){
                    System.out.println();
                }
            }
            System.out.println(this + " Calling shutdownNow()");
            exec.shutdownNow();
        }
    }
}
class PrioritizedTaskProducer implements Runnable{
    private Random random = new Random(47);
    private Queue<Runnable> queue;
    private ExecutorService exec;
    public PrioritizedTaskProducer(Queue<Runnable> queue,ExecutorService e){
        this.exec = e;
        this.queue = queue;
    }
    @Override
    public void run() {
        for(int i = 0;i < 20;i++){
            queue.add(new PrioritizedTask(random.nextInt(10)));
            //Thread.yield();
        }
        try{
            for(int i = 0;i < 10; i++){
               TimeUnit.MILLISECONDS.sleep(100);
               queue.add(new PrioritizedTask(10));

            }
        }catch (InterruptedException e){}
        queue.add(new PrioritizedTask.EndSential(exec));
        System.out.println("Finished PrioritizedTaskProducer");

    }
}
class PriotitizedTaskConsumer implements Runnable{
    private PriorityBlockingQueue<Runnable> q;
    public PriotitizedTaskConsumer(PriorityBlockingQueue q){
        this.q = q;
    }

    @Override
    public void run() {
        try{
            while(!Thread.interrupted()){
                q.take().run();
            }
        }catch(InterruptedException e){}
        System.out.println("Finished PrioritizedTaskConsumer");
    }
}
public class PriorityBlockingQueueDemo {

    public  void execute(){
        ExecutorService exec = Executors.newCachedThreadPool();
        PriorityBlockingQueue<Runnable> queue = new PriorityBlockingQueue<>();
        exec.execute(new PrioritizedTaskProducer(queue,exec));
        exec.execute(new PriotitizedTaskConsumer(queue));

    }
}
