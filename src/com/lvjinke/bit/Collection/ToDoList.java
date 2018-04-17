package com.lvjinke.bit.Collection;

import java.util.PriorityQueue;

public class ToDoList extends PriorityQueue<ToDoList.ToDoItem>{
    static class ToDoItem implements Comparable<ToDoItem>{
        private char primary;
        private int secondary;
        private String item;

        ToDoItem(char pri,int sec,String td){
            this.primary = pri;
            this.secondary = sec;
            this.item = td;
        }
        @Override
        public int compareTo(ToDoItem o) {
            if(primary > o.primary) {
                return 1;
            }
            if(primary == o.primary){
                if(secondary > o.secondary){
                    return 1;
                }else if(secondary == o.secondary){
                    return 0;
                }
            }
            return -1;
        }
        public String toString(){
            return ""+Character.toString(primary) + secondary + ":" + item;
        }
    }
    public void add(String td,char pri,int sec){
        super.add(new ToDoItem(pri,sec,td));
    }
    public static void execute(){
        ToDoList toDoList = new ToDoList();
        toDoList.add("CHINA",'C',10);
        toDoList.add("JPA",'J',5);
        toDoList.add("KRO",'K',7);
        toDoList.add("SIGN",'S',3);
        while(!toDoList.isEmpty()){
            System.out.println(toDoList.remove());
        }

    }


}
