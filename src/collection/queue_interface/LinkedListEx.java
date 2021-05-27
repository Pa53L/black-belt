package collection.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Pavel");
        queue.add("Anna");
        queue.add("Ivan");
        queue.add("Lena");
        queue.offer("Sasha");
        queue.add("Kostya");

        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.element());
        System.out.println(queue.remove("Kostya"));
        System.out.println(queue.poll());
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue);
        
    }
}
