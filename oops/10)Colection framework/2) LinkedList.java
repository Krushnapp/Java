import java.util.LinkedList;

public class LinkedListExample {
  public static void main(String[] args) {
    // Initialization
    LinkedList<String> list = new LinkedList<>();
    
    // Insertion
    list.add("first");
    list.add("second");
    list.add(1, "third");
    
    // Deletion
    list.remove("second");
    list.remove(0);
    
    // Other methods
    list.size();
    list.get(0);
    list.set(0, "new value");
    list.contains("first");
    list.addFirst("new first");
    list.addLast("new last");
  }
}
