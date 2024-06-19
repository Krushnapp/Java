import java.util.TreeSet;

public class TreeSetExample {
public static void main(String[] args) {
// Initialization
TreeSet<Integer> set = new TreeSet<>();

csharp
Copy code
// Insertion
set.add(2);
set.add(1);
set.add(3);

// Deletion
set.remove(2);

// Other methods
set.size();
set.contains(1);
set.first();
set.last();
}
}

