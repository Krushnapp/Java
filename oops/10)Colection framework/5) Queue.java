import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
  public static void main(String[] args) {
    // Initialization
    Queue<String> queue = new LinkedList<>();
    
    // Insertion
    queue.add("first");
    queue.add("second");
    
    // Deletion
    queue.remove();
    
    // Other methods
    queue.size();
    queue.peek();
    queue.offer("new element");
  }
}
