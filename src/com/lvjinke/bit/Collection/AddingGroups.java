package com.lvjinke.bit.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class AddingGroups {
    public static void execute(){
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1,4,5,5,6));

        Integer[] integers = {3,556,63,23};
        collection.addAll(Arrays.asList(integers));
        for(Integer integer: collection){
            System.out.println(integer);
        }
        List<Integer> list = Arrays.asList(1,4,53);
        //it'll throw UnSupported Opreation
        //list.add(1);

    }
}
