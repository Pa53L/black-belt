package collection.queue_interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(1);
        dq.addFirst(8);
        dq.addLast(5);
        dq.addFirst(3);
        dq.addLast(7);
        dq.offerFirst(17);
        dq.offerLast(14);
        dq.addLast(15);

        System.out.println(dq);

        System.out.println(dq.removeFirst());
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
        System.out.println(dq.removeLast());

        System.out.println(dq);

        System.out.println(dq.getFirst());
        System.out.println(dq.peekFirst());
        System.out.println(dq.getLast());
        System.out.println(dq.peekLast());
    }
}
