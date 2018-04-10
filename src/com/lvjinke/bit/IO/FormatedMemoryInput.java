package com.lvjinke.bit.IO;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.DataInputStream;

public class FormatedMemoryInput {
    private static String path = null;

    public FormatedMemoryInput(){}
    public FormatedMemoryInput(String path){
        this.path = path;
    }

    public static void read() throws IOException {

        DataInputStream in = new DataInputStream(
                new ByteArrayInputStream(
                         BufferedInputFile.read(path

                        ).getBytes()
                )
        );
        while(in.available()!= 0){
            System.out.println((char)in.readByte());
        }
    }
}
