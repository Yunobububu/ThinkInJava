package com.lvjinke.bit.Enumerated;

import org.junit.Test;

enum Shrbubbery { GROUND,CRAWLING,HANGING}
public class EnumClass {
    @Test
    public void execute(){
        for(Shrbubbery shrbubbery : Shrbubbery.values()){
            System.out.println(shrbubbery + "rodinal :"+ shrbubbery.ordinal());
            System.out.println(shrbubbery.compareTo(Shrbubbery.CRAWLING)+"");
            System.out.println(shrbubbery.equals(Shrbubbery.HANGING)+ "");
            System.out.println(shrbubbery.getDeclaringClass());
            System.out.println(shrbubbery.name());

        }
        for(String s: "HANGING GROUND CRAWLING".split(" ")){
            Shrbubbery shrub = Enum.valueOf(Shrbubbery.class,s);
            System.out.println(shrub);
        }
    }
}
