package com.lvjinke.bit.Generics;

import java.util.*;

public class RandomList<T>{
    private List<T> list = new ArrayList<>();
    public RandomList(){}
    public RandomList(Collection<T> collection){
        list.addAll(collection);
    }
    public T select(){
        Random random = new Random();
        if(list != null){

            return list.get(random.nextInt(list.size()));
        }else{
            return null;
        }
    }

    public static class GenericVarargs {
        public static <T> List<T> makeList(T... args){
            List<T> list = new ArrayList<>();
            for(T t: args){
                list.add(t);
            }
            return list;
        }
    }
}
