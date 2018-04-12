package com.lvjinke.bit.Collection;

import java.util.Iterator;

public interface ICollection<T> extends Iterable<T>{

    int size();//*
    void add(T t);
    T remove(Object o);
    Object[] toArray();//
    <T> T[] toArray(T[] a);//
    boolean contains(Object o);
    void addAll(ICollection<?> c);
    void retainAll(ICollection<?> c);
    boolean isEmpty();
    Iterator iterator();
    boolean equals(Object o);
    int hashCode();
    String toString();
    void clear();

}
