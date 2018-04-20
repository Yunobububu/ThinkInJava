package com.lvjinke.bit.Enumerated;

import java.util.EnumSet;

public class CarWash {
    public enum Cycle{
        UNDERBODY{
            void action(){System.out.println("Spraying underbody");};
        },
        WHEELWASH{
            void action(){System.out.println("Wash the wheel");};
        },
        BASIC{
            void action(){System.out.println("The basic wash");};
        },
        HOTWAX{
            void action(){System.out.println("Applying hot wax");};
        },
        RINSE{
            void action(){System.out.println("Rinsing");};
        };
        abstract void action();
    }
    EnumSet<Cycle> cycles  = EnumSet.of(Cycle.BASIC,Cycle.BASIC,Cycle.BASIC,Cycle.BASIC);
    public void add(Cycle cycle){
        cycles.add(cycle);
    }
    public void washcar(){
        for(Cycle cycle: cycles){
            cycle.action();
        }
    }
    public String toString(){return cycles.toString();}

    public static void execute(){
        CarWash wash = new CarWash();
        System.out.println(wash);
        wash.washcar();
        wash.add(Cycle.HOTWAX);
        wash.add(Cycle.HOTWAX);
        wash.add(Cycle.RINSE);
        wash.add(Cycle.WHEELWASH);
        System.out.println(wash);
        wash.washcar();
    }
}
