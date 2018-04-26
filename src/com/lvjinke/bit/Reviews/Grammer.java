package com.lvjinke.bit.Reviews;

public class Grammer {
    public static void execute(){
        int t  = 2;
        int p = 5;
        p = (t !=(t = 3) ? t : p);
        System.out.println(p);
    }
}
