package com.lvjinke.bit.Collection;

import com.lvjinke.bit.Generics.Generator;

import java.util.LinkedHashMap;
public class MapData<K,V> extends LinkedHashMap<K,V>{
    public MapData(Generator<Pair<K,V>> gen,int quanlity ){
        for(int i = 0;i < quanlity;i++){
            Pair<K,V>  pair = gen.next();
            put(pair.key,pair.value);
        }
    }
    public MapData(Generator<K> genK,Generator<V> genV,int quanlity ){
        for(int i = 0;i < quanlity;i++){
            put(genK.next(),genV.next());
        }
    }

    public MapData(Generator<K> genK,V value,int quanlity ){
        for(int i = 0;i < quanlity;i++){
            put(genK.next(),value);
        }
    }
    public MapData(Iterable<K> k,Generator<V> genV){
        for(K key: k){
            put(key,genV.next());
        }
    }
    public MapData(Iterable<K> k, V value){
        for(K key: k){
            put(key,value);
        }
    }
    //static methods
    public static <K,V> MapData<K,V> map(Generator<Pair<K,V>> gen ,int quanlity){
        return new MapData<>(gen,quanlity);
    }
    public static <K,V> MapData<K,V> map(Generator<K> genK,Generator<V> genV ,int quanlity){
        return new MapData<>(genK,genV,quanlity);
    }
    public static <K,V> MapData<K,V> map(Generator<K> genK ,V v,int quanlity){
        return new MapData<>(genK,v,quanlity);
    }
    public static <K,V> MapData<K,V> map(Iterable<K> genK,Generator<V> genV){
        return new MapData<>(genK,genV);
    }
    public static <K,V> MapData<K,V> map(Iterable<K> genK ,V v){
        return new MapData<>(genK,v);
    }


}
