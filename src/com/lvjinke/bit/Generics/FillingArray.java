package com.lvjinke.bit.Generics;

import java.util.Arrays;

public class FillingArray {
    public static void execute(){
        int size = 6;
        boolean[] a1 = new boolean[size];
        int[] a2 = new int[size];
        byte[] a3 = new byte[size];
        short[] a4 =new short[size];
        Arrays.fill(a1,true);
        Arrays.fill(a2,4);
        Arrays.fill(a3,(byte)11);
        Arrays.fill(a4,(short)17);
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(a3));
        System.out.println(Arrays.toString(a4));
    }
}
