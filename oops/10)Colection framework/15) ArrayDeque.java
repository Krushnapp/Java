import java.util.ArrayDeque;

public class ArrayDequeExample {
  public static void main(String[] args) {
    // Initialization
    ArrayDeque<Integer> deque = new ArrayDeque<>();
    
    // Insertion
    deque.addFirst(1);
    deque.addLast(2);
    deque.addFirst(3);
    
    // Deletion
    deque.removeFirst();
    
    // Other methods
    deque.size();
    deque.getFirst();
    deque.getLast();
    deque.offerFirst(4);
    deque.offerLast(5);
  }
}
