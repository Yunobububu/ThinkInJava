package com.lvjinke.bit.Enumerated;

public class Meal {
    public static void execute(){
        for(int i = 0;i < 5;i++){
            for(Course course:Course.values()){
                Food food = course.randomSelection();
                System.out.println(food);
            }
            System.out.println("--------");
        }
    }
}
