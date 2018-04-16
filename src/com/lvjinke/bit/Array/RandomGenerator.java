package com.lvjinke.bit.Array;

import com.lvjinke.bit.Generics.Generator;

import java.util.Random;

public class RandomGenerator {
    private static Random random = new Random();
    static char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    public static class Character implements Generator<java.lang.Character>{
        int index = -1;
        @Override
        public java.lang.Character next() {
            return chars[random.nextInt(chars.length)];
        }
    }
    public static class String implements Generator<java.lang.String>{
        @Override
        public java.lang.String next() {

            char[] chars = new char[random.nextInt(20)];
            for(int i = 0;i < chars.length;i++){
                chars[i] = new Character().next();
            }
            return new java.lang.String(chars);
        }
    }
    public static class Boolean implements Generator<java.lang.Boolean>{
        Random random = new Random(30);
        @Override
        public java.lang.Boolean next() {
            return random.nextBoolean();
        }
    }
}
