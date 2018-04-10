package com.lvjinke.bit.innerclasses;
//hold a list of Objects
//内部类拥有对外部类所有元素的访问权
public class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size){
        items = new Object[size];
    }
    public void add(Object x){
        if(next < items.length){
            items[next++] = x;
        }
    }
    interface Selector{
        boolean end();
        Object current();
        void next();
    }
    protected class SequenceSelector implements Selector{
        private int i = 0;
        public SequenceSelector(){
        }
        @Override
        public boolean end() {
            return (i == items.length);
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if(i < items.length){
                i++;
            }
        }
    }
}
