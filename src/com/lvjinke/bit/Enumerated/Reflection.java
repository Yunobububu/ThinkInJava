package com.lvjinke.bit.Enumerated;

import com.lvjinke.bit.Concurrency.ExplicitCriticalSection;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

enum Explore{HERE,THERE}
public class Reflection {
    public static void execute(){
        List<String> interNames = new ArrayList<>();
        List<String> methodNames = new ArrayList<>();
        List<String> typeNames = new ArrayList<>();
        Class<?>[] interfaces = Explore.class.getInterfaces();
        for(Class<?> in: interfaces){
            interNames.add(in.getSimpleName());
        }
        Type[] types = Explore.class.getGenericInterfaces();
        for(Type t : types){
            typeNames.add(t.getTypeName());
        }
        Method[] methods = Explore.class.getMethods();
        for(Method m: methods){
            methodNames.add(m.getName());
        }
        System.out.println("interfaces:");
        System.out.println(interNames);
        System.out.println("methodNames:");
        System.out.println(methodNames);
        System.out.println(Explore.class.getSuperclass());
    }
}
