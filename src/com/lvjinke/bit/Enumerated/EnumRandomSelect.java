package com.lvjinke.bit.Enumerated;

import java.util.Random;

public class EnumRandomSelect {
        private static Random random = new Random(47);
        public static <T extends Enum> T random(Class<T> c){
            return random(c.getEnumConstants());
        }
        public static <T> T random(T[] values){
            return values[random.nextInt(values.length)];
        }

}
