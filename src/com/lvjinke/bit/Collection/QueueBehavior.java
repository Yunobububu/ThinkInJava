package com.lvjinke.bit.Collection;

import com.lvjinke.bit.Generics.Generator;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueBehavior {
    private static int count = 10;
    static <T> void test(Queue<T> queue, Generator<T> gen){
        for(int i = 0;i < count;i++){
            queue.offer(gen.next());
        }
        while(queue.peek() != null){
            System.out.print(queue.poll()+ " ");
        }
        System.out.println();
    }
    static class Gen implements Generator<String>{
        String[] s = "one,two,three,four,five,si`x,seven,eight,night,ten".split(",");
        int i = 0;
        @Override
        public String next() {
            return s[i++];
        }
    }
    public static void execute(){
        test(new LinkedList<String>(),new Gen());
        test(new PriorityQueue<String>(),new Gen());
        test(new ArrayBlockingQueue<String>(count),new Gen());
        test(new ConcurrentLinkedDeque<String>(),new Gen());
        test(new PriorityBlockingQueue<String>(),new Gen());
    }
}
