package com.lvjinke.bit.Generics;

public class BasicGenerator<T> implements Generator<T>{
    private Class<T> type;
    public BasicGenerator(){}
    public BasicGenerator(Class<T> cl){
        this.type = cl;
    }
    @Override
    public T next() {
        try{
            return (T)type.newInstance();

        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public static <T> Generator<T> creat(Class<T> type){
        return new BasicGenerator<T>(type);
    }
}
