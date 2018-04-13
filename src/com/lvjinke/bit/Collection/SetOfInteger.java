package com.lvjinke.bit.Collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetOfInteger {
    public static void execute(){
        Random random = new Random(50);
        Set<Integer> set = new TreeSet<>();
        for(int i =0;i < 1000;i++){
            set.add(random.nextInt(30));
        }
        for(int i: set){
            System.out.println(i);
        }

    }
}
