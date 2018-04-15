package com.lvjinke.bit.Generics;

public class GenericArray<T> {
    private T[] array;
    public GenericArray(int sz){
        array = (T[])new Object[sz];
    }
    public T get(int index){
        return array[index];
    }
    public void set(int index,T t){
        array[index] = t;
    }
    public T[] rep(){
        return array;
    }

}
