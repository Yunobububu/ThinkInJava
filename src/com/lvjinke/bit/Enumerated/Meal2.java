package com.lvjinke.bit.Enumerated;


import java.util.Random;

public class Meal2 {
    interface Food{
        enum Fruit implements Food{APPLE,BANNA,ORANGE,PEACH,WATERMELON}
        enum MainCourse implements Food{RICE,NOODLE,RICENOODLE,PIZZA}
        enum SOUP implements Food{EGG,MATTON,BEEF,MARCHROOM}
    }

    enum Course{
        F(Food.Fruit.class),M(Food.MainCourse.class),S(Food.SOUP.class);
        private Food[] values;
        private Course(Class<? extends Food> kind){
            values = kind.getEnumConstants();
        }

    }
    private static Course courseSelection(){
        return EnumRandomSelect.random(Course.class);
    }
    public static Food foodSelection(){
        Random random = new Random();
        Food food = courseSelection().values[random.nextInt(courseSelection().values.length)];
        return  food;
    }
    public static void execute(){
        for(int i = 0;i < 5;i++){

            System.out.println(foodSelection());
        }
    }

}
