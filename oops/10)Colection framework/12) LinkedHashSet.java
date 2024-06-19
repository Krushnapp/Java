import java.util.LinkedHashSet;

public class LinkedHashSetExample {
public static void main(String[] args) {
// Initialization
LinkedHashSet<String> set = new LinkedHashSet<>();

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
set.add("new first");
}
}

