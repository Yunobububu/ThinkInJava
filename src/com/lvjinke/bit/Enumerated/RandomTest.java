package com.lvjinke.bit.Enumerated;
enum Activity{ LYING,HOPPING,DODGING,FALLING,FLYING,RUNNING,JUMPING}
public class RandomTest {
    public static void execute(){
        for(int i = 0;i < 10; i++){
            Activity activity = EnumRandomSelect.random(Activity.class);
            System.out.print(activity+",");
        }
    }
}
