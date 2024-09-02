package Ex_24082024.CollectionFramework.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab01 {
    public static void main(String[] args) {
        //Queue -- LILO FIFO

        Queue q = new PriorityQueue();
        q.offer("Neeru");
        q.add("U");
        q.offer(10);
        q.add(20);

        //both offer and add can be used to add the elements in Queue
        System.out.println(q);
        System.out.println(q.size());
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q);
    }
}
