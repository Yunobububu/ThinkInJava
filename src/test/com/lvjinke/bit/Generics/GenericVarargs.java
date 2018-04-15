package test.com.lvjinke.bit.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericVarargs {
    public static <T> List<T> makeList(T... args){
        List<T> list = new ArrayList<>();
        for(T t: args){
            list.add(t);
        }
        return list;
    }
}
