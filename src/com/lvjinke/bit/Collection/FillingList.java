package com.lvjinke.bit.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class StringAdress{
    private String country;
    private String province;
    private String city;
    StringAdress(){}
    StringAdress(String country,String province,String city){
        this.city = city;
        this.country = country;
        this.province = province;
    }
}
public class FillingList {
    public static void execute(){
        StringAdress adress = new StringAdress("china","hunan","shaoyang");
        List<StringAdress> adresses = new ArrayList<>(Collections.nCopies(4,adress));
        System.out.println(adresses);
        Collections.fill(adresses,adress);
        System.out.println(adresses);

    }
}
