package com.lvjinke.bit.Enumerated;

import java.text.DateFormat;
import java.util.Date;

public enum ConstantsSpecificMethod {
    DATA_TIME{
      String getInfo(){
          return DateFormat.getDateInstance().format(new Date());
      }
    },
    CLASSPATH{
        String getInfo(){
            return System.getenv("CLASSPATH");
        }
    },
    VERSION{
        String getInfo(){
            return System.getProperty("java.version");
        }
    };
    abstract String getInfo();
    public static void execute(){
        for(ConstantsSpecificMethod cdf:values()){
            System.out.println(cdf.getInfo());
        }
    }
}