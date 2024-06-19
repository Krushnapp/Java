import java.util.HashMap;
import java.util.Map;
///map
public class ForEachWithMapExample {
    public static void main(String[] args) {
        // Create a Map with some key-value pairs
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 85);
        scores.put("Bob", 92);
        scores.put("Charlie", 78);
        scores.put("David", 90);
        scores.put("Eva", 95);

        // Using forEach method to iterate over the map entries
        scores.forEach((name, score) -> System.out.println(name + ": " + score));
    }
}

///list
public class ForEachWithArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Using forEach method to iterate over the ArrayList elements
        numbers.forEach(num -> System.out.println("Number: " + num));
    }
}

