package com.lvjinke.bit.Collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Snow{}
    class Power extends Snow{}
    class Light extends Power{}
    class Heavy extends Power{}
    class Slush extends Snow{}
public class AsListInterface {
    public static void execute(){
        List<Snow> list = Arrays.asList(new Snow(),new Power(),new Heavy());
        List<Snow> list2 =Arrays.asList(new Heavy(),new Light());

    }
}


