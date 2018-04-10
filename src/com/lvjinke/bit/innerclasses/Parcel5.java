package com.lvjinke.bit.innerclasses;
//局部内部类：在方法中
public class Parcel5 {
    public Destination destination(String s){
        class PDestination implements Destination{
            private String lable;
            private PDestination(String whereTo){
                lable = whereTo;
            }

            @Override
            public String readLable() {
                return lable;
            }
        }
        return new PDestination(s);
    }
}
