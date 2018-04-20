package com.lvjinke.bit.Enumerated;

import  static com.lvjinke.bit.Enumerated.Food.*;
public enum Course {
    APPETIZER(Appletizer.class),MAINCOURSE(MainCourse.class),COFFEE(Coffee.class),DESSERT(Coffee.class);
    private Food[] values;
    private Course(Class<? extends Food> c){
        values = c.getEnumConstants();
    }
    public Food randomSelection(){
        return  EnumRandomSelect.random(values);
    }
}
