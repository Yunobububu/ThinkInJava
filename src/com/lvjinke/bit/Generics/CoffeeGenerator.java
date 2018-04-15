package com.lvjinke.bit.Generics;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator<Coffee> implements Generator<Coffee>,Iterable<Coffee>{
    Class[] types = {Latte.class,Breve.class,Mocha.class};
    private int sz;
    public CoffeeGenerator(){}
    public CoffeeGenerator(int times){
        this.sz = times;
    }
    @Override
    public Coffee next() {
        Random random = new Random();
        try {
            return (Coffee) types[random.nextInt(types.length)].newInstance();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }


    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }
    class CoffeeIterator implements Iterator<Coffee>{

        int count = sz;
        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }
    }

}

