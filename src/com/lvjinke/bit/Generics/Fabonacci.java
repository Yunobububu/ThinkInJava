package com.lvjinke.bit.Generics;

public class Fabonacci implements Generator<Integer>{
    private int count = 0;

    @Override
    public Integer next() {
        return f(count++);
    }
    private int f(int n){
        if(n < 2) return 1;
        return f(n-1) +f(n-2);
    }
}
