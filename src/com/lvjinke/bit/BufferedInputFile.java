package com.lvjinke.bit;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedInputFile {
    public static String read(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String s;
        StringBuilder sb = new StringBuilder();
        while((s = br.readLine())!= null){
            sb.append(s + "\n");
        }
        br.close();
        return sb.toString();
    }
}

