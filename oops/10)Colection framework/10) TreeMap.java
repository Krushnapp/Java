import java.util.TreeMap;

public class TreeMapExample {
public static void main(String[] args) {
// Initialization
TreeMap<String, Integer> map = new TreeMap<>();

arduino
Copy code
// Insertion
map.put("first", 1);
map.put("second", 2);

// Deletion
map.remove("second");

// Other methods
map.size();
map.get("first");
map.containsKey("second");
map.containsValue(1);
map.keySet();
map.values();
}
}