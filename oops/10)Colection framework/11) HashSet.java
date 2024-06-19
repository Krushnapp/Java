import java.util.HashSet;

public class HashSetExample {
public static void main(String[] args) {
// Initialization
HashSet<String> set = new HashSet<>();

csharp
Copy code
// Insertion
set.add("first");
set.add("second");

// Deletion
set.remove("second");

// Other methods
set.size();
set.contains("first");
}
}