package com.lvjinke.bit.Enumerated;

import java.util.EnumSet;

import static com.lvjinke.bit.Enumerated.Alarms.*;

public class EnumSets {
    public static void execute(){
        EnumSet<Alarms> points = EnumSet.noneOf(Alarms.class);
        points.add(BATHROOM);
        System.out.println(points);
        points.addAll(EnumSet.of(STAIR1,STAIR2,KITCHEN));
        System.out.println(points);
        points.removeAll(EnumSet.of(KITCHEN,STAIR2));
        System.out.println(points);
        points.removeAll(EnumSet.range(STAIR1,KITCHEN));
        System.out.println(points);

    }
}
