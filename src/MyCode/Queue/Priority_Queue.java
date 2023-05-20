package MyCode.Queue;
import java.util.*;
public class Priority_Queue {
    public static void main(String[] args) {

        // comparator = tells which element has highest priority

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // Comparator.reverseOrder() = convert min heap to max heap

        pq.offer(92);
        pq.offer(24);
        pq.offer(56);
        pq.offer(124);
        pq.offer(16);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
