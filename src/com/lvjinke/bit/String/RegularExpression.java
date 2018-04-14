package com.lvjinke.bit.String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    private  String poem;
    private  String regex;

    public RegularExpression(){}
    public RegularExpression(String poem,String regex){
        this.poem = poem;
        this.regex = regex;
    }
    public  void execute(){
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(poem);
        while(matcher.find()){
            System.out.println(matcher.group()+":" +"start at:"
                    +matcher.start()+"end:"+matcher.end());
        }
    }

}
