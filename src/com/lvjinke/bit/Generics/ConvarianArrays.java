package com.lvjinke.bit.Generics;
class Fruit{}
class Apple extends Fruit{}
class Jonathan extends Apple{}
class Orange extends Fruit{}
public class ConvarianArrays {
    public static void extcute() {
        Fruit[] fruits = new Apple[10];
        fruits[0] = new Apple();
        fruits[1] = new Jonathan();
        try{
            fruits[3] = new Orange();
        }catch (Exception e){
            System.out.println(e);
        }
        try{
            fruits[4] = new Fruit();
        }catch(Exception e){
            System.out.println(e);
        }

    }

}
