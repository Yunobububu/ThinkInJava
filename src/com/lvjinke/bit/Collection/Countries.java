package com.lvjinke.bit.Collection;

import com.sun.xml.internal.ws.server.UnsupportedMediaException;

import java.util.*;

public class Countries {
    public final static String[][] DATA = {
            {"CHINA","Beijing"},{"JAPAN","Tokye"},
            {"KOREA","Soul"},{"TAILAND","Mangu"},
            {"QATAR","DOHA"},{"SINGAPORE","Singapore"}
    };
    private static class FlightweightMap extends AbstractMap<String,String>{

        private static class Entry implements Map.Entry<String,String>{
            int index;
            Entry(int index){
                this.index = index;
            }
            @Override
            public String getKey() {
                return DATA[index][0];
            }

            @Override
            public String getValue() {
                return DATA[index][1];
            }

            @Override
            public String setValue(String value) {
                throw new UnsupportedOperationException();
            }
            public boolean equals(Object o){
                return DATA[index][0].equals(o);
            }
            public int hashCode(){
                return DATA[index][1].hashCode();
            }
        }
        static class EntrySet extends AbstractSet<Map.Entry<String, String>>{
            private int size;
            EntrySet(int size){
                if(size < 0){
                    this.size = 0;
                }else if(size > DATA.length){
                    this.size = DATA.length;
                }else
                this.size = size;
            }

            @Override
            public Iterator<Map.Entry<String, String>> iterator() {
                return new Itr();
            }

            @Override
             public int size(){return size;}
             private class Itr implements Iterator<Map.Entry<String,String>> {
                 private Entry entry = new Entry(-1);

                 public boolean hasNext() {
                     return entry.index < size - 1;
                 }

                 public Map.Entry<String, String> next() {
                     entry.index++;
                     return entry;
                 }

                 public void remove() {
                     throw new UnsupportedOperationException();
                 }

             }


        }
        private static Set<Map.Entry<String,String>> entries = new EntrySet(DATA.length);
        @Override
        public Set<Map.Entry<String, String>> entrySet() {
            return entries;
        }

    }
    static Map<String,String> select(int size){
        return new FlightweightMap(){
            public Set<Map.Entry<String,String>> entrySet(){
                return new EntrySet(size);
            }
        };
    }
    static Map<String,String> map  = new FlightweightMap();
    public static Map<String,String> capitals(){
        return map;
    }
    public static Map<String,String> capitals(int size){
        return select(size);
    }
    static List<String> names = new ArrayList<>(map.keySet());
    public static List<String> names(int size){
        return new ArrayList<>(select(size).keySet());
    }

    public static void execute(){
        System.out.println(capitals());
        System.out.println(capitals(2));
    }
}
