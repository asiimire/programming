import java.util.PriorityQueue;

public class Priority_Queue {

    public static void main(String[] args) {
        // Create a priority queue of integers (min-heap)
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the priority queue
        priorityQueue.add(5);
        priorityQueue.add(2);
        priorityQueue.add(8);
        priorityQueue.add(1);

        // Peek at the top element (minimum element)
        System.out.println("Top element: " + priorityQueue.peek());

        // Poll (remove) the top element
        int minElement = priorityQueue.poll();
        System.out.println("Removed element: " + minElement);

        // Peek after removal
        System.out.println("Top element after removal: " + priorityQueue.peek());

        // Add more elements
        priorityQueue.add(3);
        priorityQueue.add(7);

        // Print all elements
        System.out.print("Priority Queue elements: ");
        while (!priorityQueue.isEmpty()) {
            System.out.print(priorityQueue.poll() + " ");
        }
    }
}
