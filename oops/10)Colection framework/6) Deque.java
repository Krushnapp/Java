import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
  public static void main(String[] args) {
    // Initialization
    Deque<String> deque = new ArrayDeque<>();
    
    // Insertion
    deque.add("first");
    deque.add("second");
    deque.addFirst("new first");
    deque.addLast("new last");
    
    // Deletion
    deque.remove();
    deque.removeFirst();
    deque.removeLast();
    
    // Other methods
    deque.size();
    deque.peek();
    deque.offerFirst("new first");
    deque.offerLast("new last");
  }
}
