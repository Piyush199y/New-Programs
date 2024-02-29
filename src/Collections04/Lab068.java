package src.Collections04;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab068 {
    public static void main(String[] args) {
        Queue pq = new PriorityQueue();   // Priority is natural sorted
        // Boarding the plane A, B, C -> A B C

        pq.offer(10);  // offer means insert
        pq.offer(30);
        pq.offer(50);
        //pq.offer(null); // NullPointerException
        pq.offer(20);
        pq.offer(40);
        //pq.offer(78989);
//
//        pq.add(5);

        System.out.println(pq);
//        System.out.println(pq.poll());  // Print the first element
//        System.out.println(pq);
//        System.out.println(pq.peek());

    }
}
