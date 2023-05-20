package MyCode.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // offer - used to add element in queue
        q.offer(12);
        q.offer(24);
        q.offer(56);
        System.out.println(q);

        // poll - used to print out element
        System.out.println(q.poll());
        System.out.println(q);

        // peek - tell what is next element ready to inline(out)
        System.out.println(q.peek());
        System.out.println(q);
    }
}
