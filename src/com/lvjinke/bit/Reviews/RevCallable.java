package com.lvjinke.bit.Reviews;

import java.util.concurrent.Callable;

public class RevCallable implements Callable<Integer> {
    private int n = 10;
    private static int count ;
    private final int id = count++;

    @Override
    public Integer call() throws Exception {
        return id;
    }
}
