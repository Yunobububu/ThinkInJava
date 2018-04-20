package com.lvjinke.bit.Enumerated;

import com.lvjinke.bit.Generics.Generator;

import java.util.Random;

enum CartonCharacter implements Generator<CartonCharacter>{
    SLAPPY,SPANK,PUNCHY,SLIPPY,BOUNCY,NUTTY,BOB;
    Random random = new Random(47);
    public CartonCharacter next(){
        return values()[random.nextInt(values().length)];
    }

}
public class EnumImplementation {
    private  static <T> void printNext(Generator<T> gen){
        System.out.println(gen.next()+",");
    }
    public static void execute(){
        CartonCharacter cc = CartonCharacter.BOB;
        for(int i =0;i < 10;i++){
            printNext(cc);
        }
    }
}

