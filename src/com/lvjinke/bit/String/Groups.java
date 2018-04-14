package com.lvjinke.bit.String;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups {
    private String poem = "Night gathers and my watch starts,\n" +
            "I'll hold no land,marry n_o wife,father no children,\n " +
            "I'm the sword of the night,shelter of the Conutrym\n" +
            "I'll watch from the day until my last day";
    private String regex = "[a-zA-Z]+";

    public void execute(){
        String xs = Arrays.toString(poem.split(","));
        System.out.println(xs);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(xs);
        Map<String,Integer> words = new HashMap<>();
        while(matcher.find()){
            //int count = 0;
            words.put(matcher.group(),
                    words.get(matcher.group()) == null ? 1 : words.get(matcher.group())+1);
        }
        for(String s: words.keySet()){
            System.out.println(s+":"+words.get(s));
        }
    }


}
