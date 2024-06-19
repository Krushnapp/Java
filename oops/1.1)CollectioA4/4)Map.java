import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class MapExample {
    void per(Map<String, Integer> map) {
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Four", 4);
        map.put("Three", 3);
        map.remove("Two"); // Remove the entry with key 'Two'
        boolean containsFour = map.containsValue(4); // Check if the map contains the value '4'
        System.out.println(map);
    }

    public static void main(String[] args) {
        Map<String, Integer> a = new HashMap<>(); // Nothread, hash table-based implementation, no specific order
        Map<String, Integer> b = new LinkedHashMap<>(); // Nothread, hash table-based implementation with predictable iteration order
        Map<String, Integer> c = new TreeMap<>(); // Nothread, Red-Black tree-based implementation, sorts entries based on keys

        MapExample k = new MapExample();
        k.per(a);
        k.per(b);
        k.per(c);
    


        map.put("Alice", 27); // Updating value for existing key

        // Print the original map
        System.out.println("Original " + mapName + ": " + map);

        // Using size() method to get the number of key-value pairs in the map
        System.out.println("Size of the " + mapName + ": " + map.size());

        // Using get() method to retrieve a value based on a key
        int ageOfBob = map.get("Bob");
        System.out.println("Age of Bob in " + mapName + ": " + ageOfBob);

        // Using containsKey() method to check if a key is present in the map
        boolean containsAlice = map.containsKey("Alice");
        System.out.println(mapName + " contains key 'Alice': " + containsAlice);

        // Using keySet() method to get all keys in the map
        Set<String> keys = map.keySet();
        System.out.println("Keys in " + mapName + ": " + keys);

        // Using values() method to get all values in the map
        Collection<Integer> values = map.values();
        System.out.println("Values in " + mapName + ": " + values);

        // Using remove() method to remove a key-value pair from the map
        map.remove("Charlie");
        System.out.println("Map after removing 'Charlie': " + map);

        // Using clear() method to remove all key-value pairs from the map
        map.clear();
        System.out.println("Map after clear(): " + map);

        System.out.println();
    }
}

// What is a Map in Java?

// A Map is an interface that represents a collection of key-value pairs. It associates keys with values and allows for efficient retrieval of values based on their corresponding keys.
// Common Implementations of Map in Java

// Various implementations of the Map interface in Java include HashMap, LinkedHashMap, TreeMap, and Hashtable.
// HashMap vs. TreeMap vs. LinkedHashMap

// HashMap offers fast key-based lookup using hash codes, but it does not guarantee order. TreeMap maintains keys in sorted order and allows for custom sorting, but it's slightly slower than HashMap. LinkedHashMap maintains insertion order, allowing for predictable iteration.
// How do you handle duplicate keys in a Map?

// In a standard Map, duplicate keys are not allowed. However, some implementations, like MultiMap from the Google Guava library, allow multiple values to be associated with the same key.
// Working with Map.Entry

// The Map.Entry interface allows you to work with key-value pairs directly. You can iterate over entries using the entrySet() method, which returns a Set of Map.Entry objects.
// Performance Considerations

// Understand the performance characteristics of different Map implementations for common operations like put, get, and remove. Consider time complexity, memory usage, and the specific use case.
// How to Iterate Over a Map

// There are multiple ways to iterate over a Map, including using entrySet(), keySet(), and values(). Choose the appropriate method based on your needs and performance requirements.
// Concurrent Map Implementations

// Java provides concurrent Map implementations like ConcurrentHashMap, which allow for thread-safe operations without the need for external synchronization.
// Use of null as a Key or Value

// Discuss the behavior of null keys or values in different Map implementations. Some implementations, like HashMap, allow null keys and values, while others, like TreeMap, do not.
// Real-World Use Cases

// Provide examples of real-world scenarios where you would choose one Map implementation over another based on performance, order, or thread-safety requirements.
What is a Map in Java?

A Map is an interface that represents a collection of key-value pairs. It associates keys with values and allows for efficient retrieval of values based on their corresponding keys.
Common Implementations of Map in Java

Various implementations of the Map interface in Java include HashMap, LinkedHashMap, TreeMap, and Hashtable.
HashMap vs. TreeMap vs. LinkedHashMap

HashMap offers fast key-based lookup using hash codes, but it does not guarantee order. TreeMap maintains keys in sorted order and allows for custom sorting, but it's slightly slower than HashMap. LinkedHashMap maintains insertion order, allowing for predictable iteration.
How do you handle duplicate keys in a Map?

In a standard Map, duplicate keys are not allowed. However, some implementations, like MultiMap from the Google Guava library, allow multiple values to be associated with the same key.
Working with Map.Entry

The Map.Entry interface allows you to work with key-value pairs directly. You can iterate over entries using the entrySet() method, which returns a Set of Map.Entry objects.
Performance Considerations

Understand the performance characteristics of different Map implementations for common operations like put, get, and remove. Consider time complexity, memory usage, and the specific use case.
How to Iterate Over a Map

There are multiple ways to iterate over a Map, including using entrySet(), keySet(), and values(). Choose the appropriate method based on your needs and performance requirements.
Concurrent Map Implementations

Java provides concurrent Map implementations like ConcurrentHashMap, which allow for thread-safe operations without the need for external synchronization.
Use of null as a Key or Value

Discuss the behavior of null keys or values in different Map implementations. Some implementations, like HashMap, allow null keys and values, while others, like TreeMap, do not.
Real-World Use Cases

Provide examples of real-world scenarios where you would choose one Map implementation over another based on performance, order, or thread-safety requirements.



 4) ConcurrentHashMap imple