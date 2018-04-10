package com.lvjinke.bit.IO;

import java.io.*;
import java.util.regex.Pattern;

public class AddLineNumber {
    private static String filename = null;

    public AddLineNumber(){}
    public AddLineNumber(String name){
        this.filename = name;
    }

    public static void addLineNumber() throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read(filename)));
        String s = null;
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
        int lineCount = 1;
        while((s = in.readLine()) != null){
            pw.println(lineCount + ":" + s);
            lineCount++;
        }
        pw.close();
        System.out.println(BufferedInputFile.read(filename));
    }
    //删除行号
    private void removLineNumber(){
        String regx = "\\{1,2,3\\}:";
        Pattern pattern = Pattern.compile(regx);
        //Matcher matcher = pattern.pattern();

    }
}
