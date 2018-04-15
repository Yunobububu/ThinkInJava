package com.lvjinke.bit.Generics;

import java.util.ArrayList;

public enum  Watercolors {
    ZNIC,LEMON_YELLLOW,DEEP_YELLOW,ORANGE,VIOLET,
    ROSE_MADDER,RAW_UMBER,CRIMSON,YELLOW_OCHER,BURNT_SIENNA,
    IVORY_BACLK,PHTHALO_BLUE;

    public static class ErasedTypeEquivalence {
        public static void execute(){
            ArrayList<String> arrayList = new ArrayList<>();
            ArrayList<Integer> integer = new ArrayList<>();
            System.out.println(arrayList.getClass() == integer.getClass());

        }
    }
}
