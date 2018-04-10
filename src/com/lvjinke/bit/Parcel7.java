package com.lvjinke.bit;

import com.lvjinke.bit.innerclasses.Destination;
import com.lvjinke.bit.innerclasses.Parcel1;
import com.lvjinke.bit.innerclasses.Parcel2;

//returning an instance of anonymous innerclass
public class Parcel7 {
    public Destination destination(Parcel2 p2){
        return new Destination() {
            private  int i = 1;
            private Parcel2 p = p2;
            @Override
            public String readLable() {
                p2.whereTo();
                return null;
            }
        };
    }
}
