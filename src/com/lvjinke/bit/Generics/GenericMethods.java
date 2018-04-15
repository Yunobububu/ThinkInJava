package com.lvjinke.bit.Generics;

public class GenericMethods {
    public static <T> void execute(T cl){
        System.out.println(cl.getClass().getSimpleName());
        System.out.println(cl.getClass().getName());
    }
}
