package com.lvjinke.bit.Generics;

interface HasColor{ java.awt.Color getColor();}
class Colored<T extends HasColor>{
    T item;
    Colored(T item){
        this.item = item;
    }
    java.awt.Color getColor(){
        return item.getColor();
    }
}

class Dimension{ public int x , y , z;}

class ColoredDimension<T extends Dimension & HasColor>{
    T item;
    ColoredDimension(T item){
        this.item = item;
    }
    T getItem(){
        return item;
    }
    java.awt.Color getColor(){
        return item.getColor();
    }
    int getX(){return  item.x;}
    int getY(){return  item.y;}
    int getZ(){return  item.z;}
}
interface Weight{ int weight();}
class Solid<T extends Dimension & HasColor & Weight>{
    T item;
    Solid(T item){
        this.item = item;
    }
    java.awt.Color getColor(){
        return item.getColor();
    }
    T getItem(){
        return item;
    }
    int getX(){return  item.x;}
    int getY(){return  item.y;}
    int getZ(){return  item.z;}
    int weight(){return item.weight();}

}
class Bounds extends Dimension implements  HasColor,Weight{
    public java.awt.Color getColor(){
        return null;
    }
    public int weight(){ return 0;}
}
public class BasicBounds {
    public static void execute(){
        Solid<Bounds> solid = new Solid<>(new Bounds());
        System.out.println(solid.getColor());
        System.out.println(solid.getX());
        System.out.println(solid.weight());
    }
}
