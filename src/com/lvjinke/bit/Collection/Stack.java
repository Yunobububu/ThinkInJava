package com.lvjinke.bit.Collection;
//Making a Stack from a LinkedList
//https://www.mygalgame.com/cangyejiadeshuangbaotaigushi.html

import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> linkedList = new LinkedList();
    public T pop(){
        return linkedList.removeFirst();
    };
    public boolean isEmpty(){
        return linkedList.isEmpty();
    };
    public void push(T e){
        linkedList.addFirst(e);
    };
    public T peek(){
        return linkedList.getFirst();
    };

}
