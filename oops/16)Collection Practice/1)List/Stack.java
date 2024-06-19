import java.util.ArrayDeque;

public class StackExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(1); // Equivalent to addFirst()
        stack.push(2);
        stack.push(3);

        System.out.println("Stack: " + stack);

        int topElement = stack.peek(); // Equivalent to peekFirst()
        System.out.println("Top element: " + topElement);

        while (!stack.isEmpty()) {
            int poppedElement = stack.pop(); // Equivalent to removeFirst()
            System.out.println("Popped element: " + poppedElement);
        }
    }
}

// Stack is a data structure that is part of the Java Collections Framework and is related to the List interface. The Stack class extends the Vector class, which, as we discussed earlier, is a legacy class that is synchronized but not recommended for new code.

// Since the Stack class is built on top of Vector, it inherits the methods from the Vector class and implements the List interface. However, it is important to note that using Stack is not recommended in modern Java development, mainly because:

// Inheritance from Vector: As mentioned before, Vector is a legacy class that provides synchronized methods, but it also carries performance overhead due to synchronization, which might not be necessary in many scenarios.

// Deque Interface: Java provides a more modern alternative to the Stack class, which is the Deque interface (Double-ended queue). The Deque interface offers stack-like behavior with additional methods for insertion and removal at both ends of the queue. It is recommended to use the Deque implementations like ArrayDeque for stack-like operations.

