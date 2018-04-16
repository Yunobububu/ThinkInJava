package com.lvjinke.bit.Generics;

public class Holder<T> {
    private T item;
    public Holder(){}
    public Holder(T item){
        this.item  = item;
    }
    public T get(){
        return item;
    }
    public void set(T item){
        this.item = item;
    }
    public boolean equals(Object o){
        return item.equals(o);
    }

    public static void execute(){
        Holder<Apple> holder = new Holder<>(new Apple());
        Apple apple = holder.get();
        holder.set(apple);
        Holder<? extends Fruit> fruit = holder;
        Fruit f = fruit.get();
        apple = (Apple) fruit.get();
        //Cant call
        //fruit.set();
        System.out.println(f.getClass().getName());
        System.out.println(f.equals(apple));
    }
}
