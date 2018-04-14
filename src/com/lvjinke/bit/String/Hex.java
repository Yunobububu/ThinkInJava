package com.lvjinke.bit.String;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static javafx.scene.input.KeyCode.X;

public class Hex {
    private String filepath;
    public Hex(){}

    public Hex(String filepath){
        this.filepath = filepath;
    }
    public  String format() throws IOException {
        List<Byte> data = this.getFile();

        StringBuffer sb = new StringBuffer();
        int n = 0;
        for(byte b :data){
            if(n % 16 == 0){
                sb.append(String.format("%05X: ",n));
            }
            sb.append(String.format("%02X ",b));
            n++;
            if(n % 16 == 0) sb.append("\n");
        }
        sb.append("\n");
        return sb.toString();
    }
    public  List<Byte> getFile() throws IOException {
        List<Byte> bytes = new ArrayList<>();
        DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream(filepath)));
        while(in.available() != 0){
            bytes.add(in.readByte());
        }
        return bytes;
    }


}
