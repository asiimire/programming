import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Initialize the queue
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements
        enqueue(queue, 1);
        enqueue(queue, 2);
        enqueue(queue, 3);

        // Print the queue
        System.out.println("Queue: " + queue);

        // Dequeue an element
        System.out.println("Dequeue: " + dequeue(queue));
        System.out.println("Queue after dequeue: " + queue);

        // Peek at the front element
        System.out.println("Peek: " + peek(queue));
        System.out.println("Queue after peek: " + queue);

        // Check if the queue is empty
        System.out.println("Is Queue Empty? " + is_empty(queue));
    }

    // Enqueue operation
    public static void enqueue(Queue<Integer> queue, int item) {
        queue.offer(item);
    }

    // Dequeue operation
    public static int dequeue(Queue<Integer> queue) {
        if (!is_empty(queue)) {
            return queue.poll();
        } else {
            System.out.println("Queue is empty");
            return -1; // You may choose to throw an exception or return a specific value
        }
    }

    // Peek operation
    public static int peek(Queue<Integer> queue) {
        if (!is_empty(queue)) {
            return queue.peek();
        } else {
            System.out.println("Queue is empty");
            return -1; // You may choose to throw an exception or return a specific value
        }
    }

    // Check if the queue is empty
    public static boolean is_empty(Queue<Integer> queue) {
        return queue.isEmpty();
    }
}
 {
    
}
