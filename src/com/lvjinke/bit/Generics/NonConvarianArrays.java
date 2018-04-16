package com.lvjinke.bit.Generics;

import java.util.ArrayList;
import java.util.List;

public class NonConvarianArrays {
    public static void execute() {
        //Complile Error
        //List<Fruit> fruits = new ArrayList<Apple>();
        List<? extends Fruit> fruits = new ArrayList<Apple>();
//      complie error
//      fruits.add(new Apple());

    }
}
