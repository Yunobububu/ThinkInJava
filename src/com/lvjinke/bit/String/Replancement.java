package com.lvjinke.bit.String;
/*!
  "Night gathers, and now my watch begins.
 It shall not end until my death.
I shall   take no wife, hold no lands,
father no children.
        I shall wear no    crowns and win no glory.
I shall live and die at my post.
I am the sword in the darkness. I am the
watcher on the walls.  I am the fire that
burns against the cold,   the    light that brings
 the dawn, the horn that wakes the sleepers,
 the shield that guards  the realms of men.
I pledge my life and honor to the Night's Watch,
for this night and all the nights to come."
 !*/
import java.io.*;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replancement {

    public String getNotes() throws IOException {
        String filepath = "./src/com/lvjinke/bit/String/Replancement.java";
        BufferedReader in = new BufferedReader(new FileReader(new File(filepath)));
        StringBuffer sb = new StringBuffer();
        String s;
        while((s = in.readLine())!= null){
            sb.append(s);
            sb.append("\n");
        }
        in.close();
        String notes = null;
        String regex = "/\\*!(.*)!\\*/";
        Pattern pattern = Pattern.compile(regex,Pattern.DOTALL);
        Matcher matcher = pattern.matcher(sb);
        while(matcher.find()){
            notes = matcher.group();
        }
        return notes;
    }

    public void execute() throws IOException {
        String notes = this.getNotes();
        String results =notes.replaceAll(" {2,}"," ");
        System.out.println(results);
        System.out.println(notes.replaceAll("(?m)^ +",""));
        String regex = "[aeiou]";
        StringBuffer sb = new StringBuffer();
        Pattern pattern = Pattern.compile(regex,Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(results);
        while(matcher.find()){
            matcher.appendReplacement(sb,matcher.group().toUpperCase());
        }
        matcher.appendTail(sb);
        System.out.println(sb);


    }


}
