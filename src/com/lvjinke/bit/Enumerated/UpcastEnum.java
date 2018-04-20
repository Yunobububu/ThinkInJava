package com.lvjinke.bit.Enumerated;

enum Search {HITHER,YOU}
public class UpcastEnum {
    public static void execute(){
        Search[] searches = Search.values();
        Enum e = Search.HITHER;
        for(Enum en:e.getClass().getEnumConstants()){
            System.out.println(en);
        }
    }
}
