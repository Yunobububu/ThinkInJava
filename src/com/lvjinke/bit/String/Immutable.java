package com.lvjinke.bit.String;

//String 不可变类，调用String实例时传递的是一个指向String的实例，其本身并无变化
public class Immutable {
    public static String toUp(String s){
        return  s.toUpperCase();
    }
}
