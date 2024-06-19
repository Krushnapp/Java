import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
        // Using HashSet: Unordered set that does not allow duplicate elements.
        // Suitable when order doesn't matter and duplicates need to be removed.
        Set<Integer> hashSet = new HashSet<>();
        performOperations(hashSet, "HashSet");

        // Using LinkedHashSet: Ordered set that maintains insertion order.
        // Suitable when order of elements is important and duplicates need to be removed.
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        performOperations(linkedHashSet, "LinkedHashSet");

        // Using TreeSet: Sorted set that orders elements based on natural ordering or a comparator.
        // Suitable when elements need to be sorted and duplicates need to be removed.
        Set<Integer> treeSet = new TreeSet<>();
        performOperations(treeSet, "TreeSet");

        // Using EnumSet: Specialized set for working with sets of enum constants.
        // Suitable for efficient operations on enum constants.
        Set<DaysOfWeek> enumSet = EnumSet.allOf(DaysOfWeek.class);
        performOperationsEnum(enumSet, "EnumSet");
    }
  

    public static void performOperations(Set<Integer> set, String setName) {
        // Adding elements to the set
        set.add(4);
        set.add(2);
        set.add(4); // Duplicate, will be ignored
        set.add(7);
        set.add(1);

        // Print the original set
        System.out.println("Original " + setName + ": " + set);

        // Using size() method to get the number of elements in the set
        System.out.println("Size of the " + setName + ": " + set.size());

        // Using contains() method to check if an element is present in the set
        boolean containsFour = set.contains(4);
        System.out.println("Set contains 4: " + containsFour);

        // Using remove() method to remove an element from the set
        set.remove(2);
        System.out.println("Set after remove(2): " + set);

        // Using clear() method to remove all elements from the set
        set.clear();
        System.out.println("Set after clear(): " + set);

        System.out.println();
    }

    public static void performOperationsEnum(Set<DaysOfWeek> set, String setName) {
        // Print the original set
        System.out.println("Original " + setName + ": " + set);

        // Using size() method to get the number of elements in the set
        System.out.println("Size of the " + setName + ": " + set.size());

        // Using contains() method to check if an element is present in the set
        boolean containsMonday = set.contains(DaysOfWeek.MONDAY);
        System.out.println("Set contains Monday: " + containsMonday);

        // Using remove() method to remove an element from the set
        set.remove(DaysOfWeek.TUESDAY);
        System.out.println("Set after remove(TUESDAY): " + set);

        // Using clear() method to remove all elements from the set
        set.clear();
        System.out.println("Set after clear(): " + set);

        System.out.println();
    }
}

enum DaysOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}



// Sure! Here are some interview-related topics and questions related to the Set interface and its implementations:

// What is a Set in Java?

// Explain the concept of a Set in Java and how it differs from other collection types like List and Map. Discuss the uniqueness and order of elements in a Set.
// Common Implementations of Set in Java

// Discuss various implementations of the Set interface in Java, such as HashSet, LinkedHashSet, TreeSet, and EnumSet. Explain the characteristics and use cases for each implementation.
// HashSet vs. TreeSet vs. LinkedHashSet

// Compare and contrast HashSet, TreeSet, and LinkedHashSet. Discuss their performance, ordering guarantees, and scenarios where one implementation might be preferred over the others.
// How to Remove Duplicates from a List using a Set

// Explain how you can use a Set to efficiently remove duplicate elements from a List. Discuss the steps involved in this process.
// How does the hashCode() and equals() methods influence Set behavior?

// Discuss the importance of the hashCode() and equals() methods in determining uniqueness and equality for objects in a Set. Explain how improper implementations of these methods can lead to unexpected behavior.
// Enumerations and EnumSet

// Discuss the advantages of using an EnumSet over other implementations for working with sets of enum constants. Explain scenarios where EnumSet is particularly useful.
// Set Operations

// Discuss common set operations such as union, intersection, and difference, and how they can be implemented using Set methods.
// Performance Considerations

// Discuss the performance characteristics of HashSet, LinkedHashSet, and TreeSet. Compare their time complexity for common operations like add, remove, and contains.
// Thread Safety

// Discuss the thread-safety aspects of different Set implementations. Explain why HashSet is not thread-safe but Vector is (since it's part of the legacy collections).
// Real-World Use Cases

// Provide examples of real-world scenarios where you would choose one Set implementation over another based on performance, ordering, or unique requirements.
