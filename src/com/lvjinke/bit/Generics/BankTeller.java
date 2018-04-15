package com.lvjinke.bit.Generics;

import java.util.*;

class Customer{
    private static int id = 0;
    private final int count = id++;

    private Customer(){
//        System.out.println("第"+ count + "个客户");
    }
    public static Generator<Customer> generator(){
        return new Generator<Customer>() {
            @Override
            public Customer next() {
                return new Customer();
            }
        };
    }
    public String toString(){
        return "Customer" + count;
    }
}
class Teller{
    private static int id = 0;
    private final int count = id++;
    private Teller(){
//        System.out.println("第" + count + "个窗口");
    }

    public static Generator<Teller> generator(){
        return new Generator<Teller>() {
            @Override
            public Teller next() {
                return new Teller();
            }
        };
    }
    public String toString(){
        return "teller" + count;
    }

}
public class BankTeller {
    public static void serve(Teller teller,Customer customer){
        System.out.println(teller +" serves "+ customer);
    }

    public static void execute(){
        Random random = new Random(47);
        Queue<Customer> line = new LinkedList<>();
        Generators.fill(line,Customer.generator(),15);
        List<Teller> tellers = new ArrayList<>();
        Generators.fill(tellers,Teller.generator(),4);
        for(Customer c: line){
            serve(tellers.get(random.nextInt(tellers.size())),c);
        }
    }
}
