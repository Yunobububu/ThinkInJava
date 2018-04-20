package com.lvjinke.bit.Enumerated;
import static com.lvjinke.bit.Enumerated.Spiciness.*;

public class Burrito {
    Spiciness degree;
    public Burrito(){}
    public Burrito(Spiciness degree){
        this.degree = degree;
    }
    public String toString(){return "Burrito is " + degree;}
    public void execute(){
        System.out.println(new Burrito(NOT));
        System.out.println(new Burrito(FLAMING));
        System.out.println(new Burrito(MILD));

    }
}

