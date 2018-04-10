package com.lvjinke.bit.innerclasses;

public class Parcel2 {
    private Parcel1 p = new Parcel1();
    private Parcel1.Destination contents = p.new Destination();

    public void whereTo(){
        contents.execute();
    }
}
