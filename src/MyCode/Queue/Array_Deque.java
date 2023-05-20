package MyCode.Queue;
import java.util.ArrayDeque;

// ArrayDeque = Do operations from first + end simultaneously
// Uses: 1. Sliding Window Technique

public class Array_Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(56);
        adq.offerFirst(12);
        adq.offerLast(45);
        adq.offer(38);
        adq.offer(100);
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("poll(): " + adq);

        System.out.println(adq.pollFirst());
        System.out.println("adq.pollFirst(): " + adq);

        System.out.println(adq.pollLast());
        System.out.println("adq.pollLast(): " + adq);

        System.out.println(adq);
    }
}
