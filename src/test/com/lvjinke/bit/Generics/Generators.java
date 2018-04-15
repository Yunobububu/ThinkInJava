package test.com.lvjinke.bit.Generics;

import com.lvjinke.bit.Generics.Generator;

import java.util.Collection;

public class Generators {
    public static <T> Collection<T> fill(Collection<T> collection, Generator<T> gen,int n){
        for(int i=0;i < n;i++){
            collection.add(gen.next());
        }
        return collection;
    }
}
