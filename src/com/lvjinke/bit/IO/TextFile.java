package com.lvjinke.bit.IO;

import java.io.*;
import java.util.ArrayList;

public class TextFile extends ArrayList<String>{
    private static String filename = null;
    public TextFile(){}
    public TextFile(String name){
        this.filename = name;
    }
    //Read a file as a list
    public static String read() throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(new File(filename).getAbsoluteFile()));
            String s = null;
                while((s = in.readLine())!= null){
                    sb.append(s + "\n");
                }
        }catch (Exception e){
            throw new RuntimeException(e);

        }finally{
            in.close();
        }
        return sb.toString();
    }
    //write a file in a method
    public static void write(String filename,String text){
        PrintWriter out = null;
        try {

            out = new PrintWriter(new File(filename).getAbsoluteFile());
            out.print(text);
        }catch (Exception e){
            throw new RuntimeException(e);
        }finally {
            out.close();
        }
    }

}
