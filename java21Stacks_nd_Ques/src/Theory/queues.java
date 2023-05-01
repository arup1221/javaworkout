package Theory;

import java.util.LinkedList;
import java.util.Queue;

public class queues {
    public static void main(String[] args) {
        Queue<Integer> queues = new LinkedList<>();
        // Queue is the interface  not a class like Stack and LinkedList
        queues.add(3);
        queues.add(38);
        queues.add(9);
        queues.add(0);
        queues.add(2);
//        System.out.println(queues.peek());
        System.out.println(queues.remove());
        // First in first out and Last in last out
    }
}
