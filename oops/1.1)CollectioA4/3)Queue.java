import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    void per(Queue<Integer> queue) {
        queue.add(1);
        queue.add(2);
        queue.add(4);
        queue.add(3);
        queue.remove(2); // Remove the element '2'
        boolean containsFour = queue.contains(4);
        System.out.println(queue);
    }

    public static void main(String[] args) {
        Queue<Integer> a = new ArrayDeque<>(); // Nothread, resizable-array implementation of Deque, no specific order
       Queue<Integer> b = new LinkedList<>(); // Nothread, doubly linked list implementation of Queue, maintains insertion order
        Queue<Integer> c = new PriorityQueue<>(); // Nothread, priority-based heap implementation of Queue
//deque
      Deque<Integer> aDeque = new ArrayDeque<>(); // Nothread, resizable-array implementation of Deque, no specific order
      Deque<Integer> bDeque = new LinkedList<>(); // Nothread, doubly linked list implementation of Deque, maintains insertion order

        // PriorityQueue doesn't guarantee the order of elements like the insertion order

        QueueExample k = new QueueExample();
        k.per(a);
        k.per(b);
        k.per(c);
    }


        // Print the original queue
        System.out.println("Original " + queueName + ": " + queue);

        // Using size() method to get the number of elements in the queue
        System.out.println("Size of the " + queueName + ": " + queue.size());

        // Using poll() method to remove and retrieve the first element from the queue
        int firstElement = queue.poll();
        System.out.println("First element removed from " + queueName + ": " + firstElement);
        System.out.println("Queue after poll(): " + queue);

        // Using peek() method to retrieve the first element without removing it
        int peekElement = queue.peek();
        System.out.println("First element (peek) in " + queueName + ": " + peekElement);

        // Using clear() method to remove all elements from the queue
        queue.clear();
        System.out.println("Queue after clear(): " + queue);

        System.out.println();
    }
}

What is a Queue in Java?

Explain the concept of a Queue in Java and how it represents a data structure that follows the First-In-First-Out (FIFO) ordering of elements.
Common Implementations of Queue in Java

Discuss various implementations of the Queue interface in Java, such as LinkedList, ArrayDeque, and PriorityQueue. Explain the characteristics and use cases for each implementation.
LinkedList vs. ArrayDeque

Compare and contrast LinkedList and ArrayDeque. Discuss their underlying data structures, time complexities for common operations like enqueue and dequeue, and scenarios where one implementation might be preferred over the other.
PriorityQueue

Explain the concept of a PriorityQueue, which is an implementation of the Queue interface that orders elements based on their natural order or a custom comparator. Discuss its use cases and the scenarios where it can be beneficial.
Deque Operations

Discuss the different types of operations that can be performed on a Deque, such as adding elements to the front and rear, removing elements from the front and rear, and getting the first and last elements.
BlockingQueue

Explain the concept of a BlockingQueue, which is a type of queue that supports blocking operations when the queue is empty or full. Discuss how it can be useful in scenarios where thread coordination is required.
Priority Queue vs. Sorting

Discuss the differences between using a PriorityQueue and sorting a collection to get elements in a specific order. Explain the trade-offs between the two approaches.
Queue Interface and Collection Methods

Discuss the methods provided by the Queue interface, such as add, offer, remove, poll, element, and peek. Explain their behavior and when to use each method.
Performance Considerations

Discuss the time complexities of common operations like enqueue, dequeue, and retrieval for different Queue implementations. Compare their performance for different use cases.
Real-World Use Cases

Provide examples of real-world scenarios where you would choose one Queue implementation over another based on performance, thread-safety, or specific requirements of the application.
As with any interview preparation, understanding the concepts, practicing coding examples, and reasoning about data structures' strengths and weaknesses are essential to demonstrate proficiency during an interview.