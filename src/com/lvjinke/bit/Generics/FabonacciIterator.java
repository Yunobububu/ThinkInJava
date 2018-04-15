package com.lvjinke.bit.Generics;

import java.util.Iterator;

public class FabonacciIterator extends Fabonacci implements Iterable<Integer>{

    private int count = 0;
    public FabonacciIterator(){}
    public FabonacciIterator(int count){
        this.count = count;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
              return count > 0;
            };

            @Override
            public Integer next() {
                count--;
                return FabonacciIterator.this.next();
            }
        };
    }
}
