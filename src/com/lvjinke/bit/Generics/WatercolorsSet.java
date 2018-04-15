package com.lvjinke.bit.Generics;

import java.util.EnumSet;
import java.util.Set;

import static com.lvjinke.bit.Generics.Watercolors.*;

public class WatercolorsSet {
    public static void execute(){
        Set<Watercolors> set = EnumSet.range(ZNIC,IVORY_BACLK);
        Set<Watercolors> set1 = EnumSet.range(DEEP_YELLOW,VIOLET);
        System.out.println(Sets.union(set,set1));
        System.out.println(Sets.intersection(set,set1));
        System.out.println(Sets.complement(set,set1));
    }
}
