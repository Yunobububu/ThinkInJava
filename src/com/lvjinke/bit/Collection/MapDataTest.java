package com.lvjinke.bit.Collection;

import com.lvjinke.bit.Array.RandomGenerator;
import com.lvjinke.bit.Generics.Generator;

import java.util.Iterator;

class Letters implements Generator<Pair<Integer,String>>,Iterable<String>{
    private int sz = 9;
    private int number = 1;
    private char letter = 'A';
    @Override
    public Pair<Integer, String> next() {
        return new Pair<Integer,String>(number++,""+ letter++);
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            @Override
            public boolean hasNext() {
                sz--;
                return sz > 0;
            }

            @Override
            public String next() {
                return "" + letter++;
            }
            @Override
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }
}
public class MapDataTest {
    public static void execute(){
        System.out.println(MapData.map(new Letters(),10));
        System.out.println(MapData.map(new RandomGenerator.Character(),new RandomGenerator.Boolean(),15));
        System.out.println(MapData.map(new Letters(),new RandomGenerator.Character()));


    }
}
