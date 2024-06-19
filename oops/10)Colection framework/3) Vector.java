import java.util.Vector;

public class VectorExample {
  public static void main(String[] args) {
    // Initialization
    Vector<String> vector = new Vector<>();
    
    // Insertion
    vector.add("first");
    vector.add("second");
    vector.add(1, "third");
    
    // Deletion
    vector.remove("second");
    vector.remove(0);
    
    // Other methods
    vector.size();
    vector.get(0);
    vector.set(0, "new value");
    vector.contains("first");
  }
}
