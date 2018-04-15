package com.lvjinke.bit.Generics;

import java.util.EnumSet;
import java.util.Set;

import static com.lvjinke.bit.Generics.Watercolors.*;

public class WatercolorsSet {
    public static void execute(){
        Set<Watercolors> set = EnumSet.range(ZNIC,IVORY_BACLK);
        Set<Watercolors> set1 = EnumSet.range(DEEP_YELLOW,VIOLET);
        System.out.println(Sets.union(set,set1));
        System.out.println(Sets.intersection(set,set1));
        System.out.println(Sets.complement(set,set1));
    }

    public static class ClassTypeCapture<T> {
        private Class<T> cl;
        public ClassTypeCapture(){}
        public ClassTypeCapture(Class<T> cl){
            this.cl = cl;
        }
        public  void execute(Class<?> cll){

            try{

                System.out.println(this.cl.isInstance(cll.newInstance()));
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }
    }
}
