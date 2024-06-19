import java.util.ArrayList;

public class ArrayListExample {
  public static void main(String[] args) {
    // Initialization
    ArrayList<String> list = new ArrayList<>();
    
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
  }
}
