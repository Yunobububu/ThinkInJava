package com.lvjinke.bit.Generics;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ContainerDifferenceMethod {
    public static Set<String> methodsSet(Class<?> type){
        Set<String> result = new TreeSet<>();
        Method[] methods = type.getMethods();
        for(Method m: methods){
            result.add(m.getName());
        }
        return result;
    }

    public static void interfaces(Class<?> type){
        System.out.println("interfaces in "+ type.getSimpleName()+":");
        List<String> interfaces = new ArrayList<>();
        Class<?>[] classes = type.getInterfaces();
        for(Class cl:classes){
            interfaces.add(cl.getSimpleName());
        }
        System.out.println(interfaces);
    }



}
