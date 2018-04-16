package com.lvjinke.bit.Generics;
//自动包装机制不能应用于数组
class RandomIntGenerator<Integer> implements Generator<Integer>{

    @Override
    public Integer next() {
        return null;
    }
}
class FArray{
    public static <T> T[] fill(T[] a,Generator<T> gen){
        for(int i=0;i < a.length;i++){
            a[i] = gen.next();
        }
        return a;
    }
 }
public class PrimitiveGeneric {
    public static void execute(){
        Coffee[] coffees = FArray.fill(new Coffee[7],new CoffeeGenerator<>());
        for(Coffee c :coffees){
            System.out.println(c);
        }
        //int[] b = FArray.fill(new int[7],new RandomIntGenerator());
    }

}
