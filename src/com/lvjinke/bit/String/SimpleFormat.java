package com.lvjinke.bit.String;

public class SimpleFormat {
    public static void execute(){
        int i = 1042;
        double j = 3023.23243;
        System.out.println("Row1:" + i + j);
        System.out.format("Row 2:[%d %.2f]" , i, j);

    }
}
