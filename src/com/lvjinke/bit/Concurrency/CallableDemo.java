package com.lvjinke.bit.Concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class TaskWithResult implements Callable<String> {
    private int id;
    public TaskWithResult(){}
    public TaskWithResult(int id){
        this.id = id;
    }
    @Override
    public String call() throws Exception {
        return "return with result: "+ id;
    }
}
public class CallableDemo {
    public static void execute(){
        ExecutorService exec = Executors.newCachedThreadPool();
        List<Future<String>> results = new ArrayList<>();
        for(int i = 0;i < 5;i++){
            results.add(exec.submit(new TaskWithResult(i)));
        }
        for(Future<String> f: results){
            try{
                System.out.println(f.get());
            }catch (Exception e){
                System.out.println(e);
            }finally {
                exec.shutdown();
            }
        }
    }
}
