package com.lvjinke.bit.String;

import java.io.*;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//find word in a file with start[p]
public class JGrep {
    private String filepath;
    public JGrep(String filepath){
        this.filepath = filepath;
    }
    public  String getText() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(new File(filepath)));
        StringBuilder text = new StringBuilder();
        String s;
        while((s = in.readLine()) != null){
            text.append(s);
            text.append("\n");
        }
        in.close();
        return text.toString();
    }

    public void execute() throws IOException {
        String text = getText();
        String regex = "\\b[pP]\\w+";
        Pattern pattern = Pattern.compile(regex);
        String line = "\n";
        Matcher matcher = pattern.matcher(text);
        int lineNumber = 0;
        while(matcher.find()){

            System.out.println(lineNumber++ +":" + matcher.group() + " start: "
                    +matcher.start());
        }
    }
}
