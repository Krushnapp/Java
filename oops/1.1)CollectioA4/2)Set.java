import java.util.ArrayList;
import java.util.List;

public class FlattenArrayList {
  void per(Set<Integer> s) {
    s.add(1);
    s.add(2);
    s.add(4);
    s.add(3);
    set.remove(2);
    boolean containsFour = s.contains(4);
    System.out.println(s);
  }

  public static void main(String[] args) {

Set<Integer> a = new HashSet<>();//threadS,NoOrder,Hashtable/1
Set<Integer> c = new LinkedHashSet<>(); //NoThread,InserOrder,LinkedHashMap( doubly linked list->before and after)/1
Set<Integer> b = new TreeSet<>();//NoThread, sorted,binary search tree (like Red-Black Tree)/logn

        FlattenArrayList k = new FlattenArrayList();
         k.per(c);  k.per(a);  k.per(b);



        Set<DaysOfWeek> enumSet = EnumSet.allOf(DaysOfWeek.class);
        performOperationsEnum(enumSet, "EnumSet");

        special for class.



      }

}

enum DaysOfWeek {
  MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

// Sure! Here are some interview-related topics and questions related to the Set
// interface and its implementations:

// What is a Set in Java?

// Explain the concept of a Set in Java and how it differs from other collection
// types like List and Map. Discuss the uniqueness and order of elements in a
// Set.
// Common Implementations of Set in Java

// Discuss various implementations of the Set interface in Java, such as
// HashSet, LinkedHashSet, TreeSet, and EnumSet. Explain the characteristics and
// use cases for each implementation.
// HashSet vs. TreeSet vs. LinkedHashSet

// Compare and contrast HashSet, TreeSet, and LinkedHashSet. Discuss their
// performance, ordering guarantees, and scenarios where one implementation
// might be preferred over the others.
// How to Remove Duplicates from a List using a Set

// Explain how you can use a Set to efficiently remove duplicate elements from a
// List. Discuss the steps involved in this process.
// How does the hashCode() and equals() methods influence Set behavior?

// Discuss the importance of the hashCode() and equals() methods in determining
// uniqueness and equality for objects in a Set. Explain how improper
// implementations of these methods can lead to unexpected behavior.
// Enumerations and EnumSet

// Discuss the advantages of using an EnumSet over other implementations for
// working with sets of enum constants. Explain scenarios where EnumSet is
// particularly useful.
// Set Operations

// Discuss common set operations such as union, intersection, and difference,
// and how they can be implemented using Set methods.
// Performance Considerations

// Discuss the performance characteristics of HashSet, LinkedHashSet, and
// TreeSet. Compare their time complexity for common operations like add,
// remove, and contains.
// Thread Safety

// Discuss the thread-safety aspects of different Set implementations. Explain
// why HashSet is not thread-safe but Vector is (since it's part of the legacy
// collections).
// Real-World Use Cases

// Provide examples of real-world scenarios where you would choose one Set
// implementation over another based on performance, ordering, or unique
// requirements.