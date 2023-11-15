import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Initialize the stack
        StackExample<Integer> stack = new StackExample<>();

        // Push elements onto the stack
        push(stack, 1);
        push(stack, 2);
        push(stack, 3);

        // Print the stack
        System.out.println("Stack: " + stack);

        // Pop an element
        System.out.println("Pop: " + pop(stack));
        System.out.println("Stack after pop: " + stack);

        // Peek at the top element
        System.out.println("Peek: " + peek(stack));
        System.out.println("Stack after peek: " + stack);

        // Check if the stack is empty
        System.out.println("Is Stack Empty? " + is_empty(stack));
    }

    // Push operation
    public static void push(StackExample<Integer> stack, int item) {
        stack.push(item);
    }

    // Pop operation
    public static int pop(StackExample<Integer> stack) {
        if (!is_empty(stack)) {
            return stack.pop();
        } else {
            System.out.println("Stack is empty");
            return -1; // You may choose to throw an exception or return a specific value
        }
    }

    // Peek operation
    public static int peek(StackExample<Integer> stack) {
        if (!is_empty(stack)) {
            return stack.peek();
        } else {
            System.out.println("Stack is empty");
            return -1; // You may choose to throw an exception or return a specific value
        }
    }

    // Check if the stack is empty
    public static boolean is_empty(StackExample<Integer> stack) {
        return stack.isEmpty();
    }
}
