package com.lvjinke.bit.Enumerated;

import java.util.concurrent.LinkedBlockingQueue;

import static com.lvjinke.bit.Enumerated.Light.*;

enum Light{RED,GREEN,YELLOW}
public class TrafficLight {
    Light light = Light.GREEN;
    public void change(){
        switch(light){
            case RED: light = Light.GREEN;
            break;
            case GREEN:light = Light.YELLOW;
            break;
            case YELLOW:light = Light.RED;
            break;
        }
    }
    public String toString(){
        return "The traffic is :" + light;
    }
    public static void exexcute(){
        TrafficLight t = new TrafficLight();
        for(int i = 0;i < 7;i++){
            System.out.println(t);
            t.change();
        }
    }
}
