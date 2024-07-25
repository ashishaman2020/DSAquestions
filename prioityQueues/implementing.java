package prioityQueues;

import java.util.Collections;
import java.util.PriorityQueue;

public class implementing {
    public static void main(String[] args) {

//        MIN HEAP IMPLEMENTATION
//        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//        pq.add(1);
//        pq.add(3);
//        pq.add(2);
//        pq.add(7);
//        pq.add(5);
//        System.out.println("This size of the pq is : " + pq.size());
//        while (!pq.isEmpty()) {
//            System.out.print(pq.peek() + " ");
//            pq.poll();
//        }
//        System.out.println();

//        MAX HEAP IMPLEMENTATION
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(1);
        pq.add(3);
        pq.add(2);
        pq.add(7);
        pq.add(5);
        System.out.println("This size of the pq is : " + pq.size());
        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");
            pq.poll();
        }
        System.out.println();
    }
}
