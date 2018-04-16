package com.lvjinke.bit.Generics;

import java.util.Random;

public class CountingGenerator {
    public static class Boolean implements Generator<java.lang.Boolean>{
        private static boolean value = true;
        @Override
        public java.lang.Boolean next() {
            return (value = !value);
        }
    }
    public static class Integer implements Generator<java.lang.Integer>{
        Random random = new Random(100);
        @Override
        public java.lang.Integer next() {
            return random.nextInt(50);
        }
    }


    public static void execute(Class<?> type){
        int size = 5;
        for(Class<?> cl: type.getClasses()){
            try{
                System.out.println(cl.getSimpleName()+":");
                Generator<?> g = (Generator<?>) cl.newInstance();
                for(int i = 0;i < size;i++){
                    System.out.print(g.next()+" ");
                }
                System.out.println();
            }catch (Exception e){
                throw new RuntimeException(e);
            };

        }
    }
}
