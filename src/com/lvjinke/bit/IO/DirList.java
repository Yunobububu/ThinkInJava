package com.lvjinke.bit.IO;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList {

    public DirList() {
    }

    public  static void main(String[] args){
        //"." == "/users/xxx/IdeaProjects/ThinkInJava "
        //即工程的根目录。
        String path = "./src/com/lvjinke/bit/";
        String[] list ;
        File f = new File(path);
        list = f.list(new DirFilter(".*Stream.*"));
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        for(String s: list){
            System.out.println(s);
        }

    }

}

class DirFilter implements FilenameFilter{

    private Pattern pattern;
    DirFilter(){}

    DirFilter(String regex){
        pattern = Pattern.compile(regex);
    }
    @Override
    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
}

