package com.lvjinke.bit.Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericWriting {
    static <T> void writeExct(List<T> list,T item){
        list.add(item);
    }
    static List<Apple> apples = new ArrayList<>();
    static List<Fruit> fruits = new ArrayList<Fruit>();
    static void f1(){
        writeExct(apples,new Apple());
        writeExct(apples,new Jonathan());
        //writeExct(apples,new Orange());
        writeExct(fruits,new Apple());
    }
    static <T> void  writeWithWildCard(List<? super T> list,T item){
        list.add(item);
    }
    static void f2(){
        writeWithWildCard(apples,new Apple());
        writeWithWildCard(fruits,new Apple());
    }
    public static void execute(){
        f1();
        f2();
    }
}
