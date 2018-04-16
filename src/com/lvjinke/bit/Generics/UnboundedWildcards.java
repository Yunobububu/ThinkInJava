package com.lvjinke.bit.Generics;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcards {
    static List list1;
    static List<?> list2;
    static List<? extends Object> list3;
    static void assign(List list){
        list1 = list;
        list2 = list;
        list3 = list;
    }
    static void assign2(List<?> list){
        list1 = list;
        list2 = list;
        list3 = list;
    }
    static void assign3(List<? extends Object> list){
        list1 = list;
        list2 = list;
        list3 = list;
    }
    public static void execute(){
        assign(new ArrayList());
        assign2(new ArrayList());
        assign3(new ArrayList());
        assign(new ArrayList<String>());
        assign2(new ArrayList<String>());
        assign3(new ArrayList<String>());


    }
}
