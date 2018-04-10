package com.lvjinke.bit.innerclasses;

//Creating inner classes
public class Parcel1 {

    class Contents{
        private int i = 1;
        public int execute(){
            System.out.println("inner contests");
            return i;
        }
    }
    class Destination{
        private String local = "Howaii";

        public void execute(){
            System.out.println("Welcome to "+ local);
        }
    }
    //外围类方法返回指向内部类的引用
    Contents c = new Contents();
    public  Contents testThis(){
        return  c;
    }



    public static void main(String[] args){
        Parcel1 p = new Parcel1();
        Contents contents = p.testThis();
        System.out.println(contents.execute());
        Destination destination = p.new Destination();
        destination.execute();

        Sequence sequence = new Sequence(10);
        Sequence.SequenceSelector seletor = sequence.new SequenceSelector();
        for(int i =0;i < 10;i++){
            sequence.add(Integer.toString(i));
        }
        while(!(seletor.end())){
            System.out.println(seletor.current());
            seletor.next();
        }
        //factories test
        Factories factories = new Factories();
        factories.serviceConsumer(Implentation1.factory);
        factories.serviceConsumer(Implentation2.factory);
    }

}
