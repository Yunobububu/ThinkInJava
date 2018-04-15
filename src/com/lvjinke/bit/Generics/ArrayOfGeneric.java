package com.lvjinke.bit.Generics;

public class ArrayOfGeneric {
    static final int SIZE = 100;
    static Generic<Integer>[] gia;

    public static void execute(){
        //ClassCastException
//        gia = (Generic<Integer>[]) new Object[SIZE];
        gia = (Generic<Integer>[]) new Generic[SIZE];
        System.out.println(gia.getClass().getName());
        //complie error
        //gia[1] = new Object();
    }
}
