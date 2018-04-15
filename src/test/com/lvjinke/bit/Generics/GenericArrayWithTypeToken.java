package test.com.lvjinke.bit.Generics;

import java.lang.reflect.Array;

public class GenericArrayWithTypeToken<T> {
    private T[] array;

    public GenericArrayWithTypeToken(Class<T> type,int sz){
        array = (T[])Array.newInstance(type,sz);
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
