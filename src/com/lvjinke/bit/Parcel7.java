package com.lvjinke.bit;

import com.lvjinke.bit.innerclasses.Destination;

//returning an instance of anonymous innerclass
public class Parcel7 {
    public Destination destination(){
        return new Destination() {
            private  int i =1;
            private String s = "beijing";
            @Override
            public String readLable() {
                return s;
            }
        };
    }
}
