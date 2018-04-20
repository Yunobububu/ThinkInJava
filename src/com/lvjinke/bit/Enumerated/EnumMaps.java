package com.lvjinke.bit.Enumerated;

import java.util.EnumMap;
import java.util.Map;

import static com.lvjinke.bit.Enumerated.Alarms.KITCHEN;
import static com.lvjinke.bit.Enumerated.Alarms.STAIR1;
import static com.lvjinke.bit.Enumerated.Alarms.STAIR2;

interface Command{void action();}
public class EnumMaps {
    public static void execute(){
        EnumMap<Alarms,Command> em = new EnumMap<Alarms, Command>(Alarms.class);
        em.put(KITCHEN, new Command() {
            @Override
            public void action() {
                System.out.println("KITCHEN fire");
            }
        });
        em.put(STAIR1, new Command() {
            @Override
            public void action() {
                System.out.println("STAIR1 fire");
            }
        });
        for(Map.Entry<Alarms,Command> e:em.entrySet()){
            System.out.println(e.getKey()+":");
            e.getValue().action();
        }
        try{
            em.get(STAIR2).action();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
