import java.util.Hashtable;

public class HashTableExample {
public static void main(String[] args) {
// Initialization
Hashtable<String, Integer> table = new Hashtable<>();


Copy code
// Insertion
table.put("first", 1);
table.put("second", 2);

// Deletion
table.remove("second");

// Other methods
table.size();
table.get("first");
table.containsKey("second");
table.containsValue(1);
table.keySet();
table.values();
}
}

