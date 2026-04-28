package CollectionFramework;
import java.util.Queue;
import java.util.LinkedList;
public class LinkedListQueue {
    static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);
        System.out.println(queue);

        // Remove
        queue.poll();
        System.out.println(queue);

        // peek
        System.out.println(queue.peek());

    }

}
