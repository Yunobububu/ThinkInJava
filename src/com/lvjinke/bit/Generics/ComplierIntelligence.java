package com.lvjinke.bit.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComplierIntelligence {
    public static void execute(){
        List<? extends Fruit> fruits = Arrays.asList(new Apple());
        Apple apple = (Apple)fruits.get(0);
        List<Fruit> fruits1 = new ArrayList<Fruit>();
        fruits1.add(new Apple());
        System.out.println(fruits.contains(new Apple()));
        System.out.println(fruits.indexOf(new Apple()));
    }
}
