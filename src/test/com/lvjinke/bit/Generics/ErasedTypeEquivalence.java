package test.com.lvjinke.bit.Generics;

import java.util.ArrayList;

public class ErasedTypeEquivalence {
    public static void execute(){
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<Integer> integer = new ArrayList<>();
        System.out.println(arrayList.getClass() == integer.getClass());

    }
}
