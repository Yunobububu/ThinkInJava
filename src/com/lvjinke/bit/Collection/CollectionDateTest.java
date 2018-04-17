package com.lvjinke.bit.Collection;

import com.lvjinke.bit.Array.RandomGenerator;
import com.lvjinke.bit.Generics.Generator;

import java.util.LinkedHashSet;
import java.util.Set;

class Goverment implements Generator<String> {
    String poem = "I just want run,oa oa ";
    String[] s = poem.split(" ");
    int index = 0;
    @Override
    public String next() {

        return s[index++];
    }
}
public class CollectionDateTest {
    public static void execute(){
        Set<String> set = new LinkedHashSet<>(
                CollectionData.list(new Goverment(),5)
        );
        set.addAll(CollectionData.list(new Goverment(),5));
        for(String s: set){
            System.out.println(s);
        }
        System.out.println(CollectionData.list(new RandomGenerator.Character(),5));
        System.out.println(CollectionData.list(new RandomGenerator.Boolean(),5));
    }
}
