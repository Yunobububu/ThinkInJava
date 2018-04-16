package com.lvjinke.bit.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BerylliumSphere{
    private static long counter;
    private final long id = counter++;

    BerylliumSphere(){}
    public String toString(){
        return "BerylliumSphere " + id;
    }
}
public class ContainerComparision {
    public static void execute(){
        BerylliumSphere[] bil = new BerylliumSphere[5];
        for(int i = 0;i < 5;i++){
            bil[i] = new BerylliumSphere();
        }
        System.out.println(Arrays.toString(bil));
        List<BerylliumSphere> lists = new ArrayList<>();
        for(int i = 0;i < 5;i++){
            lists.add(new BerylliumSphere());
        }
        for(BerylliumSphere bls:lists){
            System.out.println(bls);
        }
    }
}
