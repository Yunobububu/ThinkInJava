package com.lvjinke.bit.Generics;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;

public class Sets<T> {
    //合集
    public static <T> Set<T> union(Set<T> cl,Set<T> ccl){
        Set<T> result = new HashSet<>(cl);
        result.addAll(ccl);
        return result;
    }
    //交集
    public static <T> Set<T> intersection(Set<T> a,Set<T> b){
        Set<T> result = new HashSet<>(a);
        result.retainAll(b);
        return result;
    }
    public static <T> Set<T> difference(Set<T> superSet,Set<T> subSet){
        Set<T> result = new HashSet<>(superSet);
        result.removeAll(subSet);
        return result;
    }
    //补集
    public static <T> Set<T> complement(Set<T> a,Set<T> b){
        return difference(union(a,b),intersection(a,b));
    }

    public static class GenericArrayWithTypeToken<T> {
        private T[] array;

        public GenericArrayWithTypeToken(Class<T> type,int sz){
            array = (T[]) Array.newInstance(type,sz);
        }
        public void put(T item,int index){
            array[index] = item;
        }
        public T[] rep(){
            return array;
        }
        public T get(int index){
            return array[index];
        }
    }
}
