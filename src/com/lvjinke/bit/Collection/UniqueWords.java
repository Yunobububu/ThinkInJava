package com.lvjinke.bit.Collection;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

public class UniqueWords {
    public static void execute() throws IOException {
        BufferedReader in = new BufferedReader(
                new FileReader(
                new File("./src/com/lvjinke/bit/Collection/sword.txt")));

        String s = null;
        StringBuilder sb = new StringBuilder();
        while((s=in.readLine())!= null){
            sb.append(s);
            sb.append(" ");
        }
        Set<String> words = new TreeSet<String>();
        System.out.println(sb);
        String[] fileWords = sb.toString().split(" ");
        for(String st: fileWords){
            words.add(st);
        }
        System.out.println(words);

    }

}
