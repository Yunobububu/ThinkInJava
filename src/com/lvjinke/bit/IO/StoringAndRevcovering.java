package com.lvjinke.bit.IO;

import java.io.*;

public class StoringAndRevcovering {
    private static String filename = null;
    public StoringAndRevcovering(){}
    public StoringAndRevcovering(String file){
        this.filename = file;
    }
    public static void out() throws IOException {
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(filename)));
        out.writeBoolean(false);
        out.writeDouble(11.2);
        out.writeUTF("hello IO");
        out.close();
        DataInputStream  in = new DataInputStream(new BufferedInputStream(new FileInputStream(filename)));
        //if the read order is wrong ,it'll throw EOFEXCEPTION
        System.out.println(in.readBoolean());
        System.out.println(in.readDouble());
        System.out.println(in.readUTF());
    }
}
