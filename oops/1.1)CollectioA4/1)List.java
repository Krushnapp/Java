import java.util.ArrayList;
import java.util.List;

public class FlattenArrayList {
  void per(List<Integer> list) {
    list.add(1);
    list.add(2);
    list.add(4);
    list.add(3);
    list.remove(Integer.valueOf(2));
    boolean containsFour = list.contains(4);
    System.out.println(list);
  }

  public static void main(String[] args) {
    List<Integer> a = new ArrayList<>(); // Nothread ,Dynamic array(resize by copy), no specific order,
    List<Integer> b = new LinkedList<>(); // Nothread ,node with value and next ref, Doubly linked list, insertion order//
    https://www.geeksforgeeks.org/linked-list-in-java/
    List<Integer> c = new Vector<>(); // thread safe ,not recommnded Synchronized, dynamic array
    Vector<String> names = new Vector<String>();  //recommended ,legacy
    List<Integer> d = new Stack<>(); // Threadsafe, Synchronized, vector ,
   List<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();//Ideal Use Cases:

    When thread-safety is crucial for concurrent access and iteration.
    When frequent reads and infrequent modifications are expected.
    When iterating over the list while modifications might occur safely.
    When the list is expected to be modified frequently and the performance of the list is critical.

    FlattenArrayList k = new FlattenArrayList();
    k.per(a);
    k.per(b);
    k.per(c);
    k.per(d);
  }
}
CopyOnWriteArrayList:

Thread-Safe: Modifications are safe for concurrent access by multiple threads. When a modification is requested, CopyOnWriteArrayList creates a copy of the existing array, performs the modification on the copy, and then replaces the original array with the modified one.
Slower for Frequent Modifications: Creating a new array copy for each modification can incur some overhead, making it less efficient for scenarios with heavy modifications in multithreaded environments.
Efficient for Iterating: Since modifications involve creating a new copy, iterators created before the modification will continue to iterate over the original data without encountering concurrent modification exceptions.
ArrayList:
  import java.util.ArrayList;
  import java.util.concurrent.CopyOnWriteArrayList;

  public class ListComparison {

      public static void main(String[] args) throws InterruptedException {
          // Standard ArrayList - Not thread-safe
          ArrayList<Integer> arrayList = new ArrayList<>();
          arrayList.add(1);
          arrayList.add(2);

          Thread thread1 = new Thread(() -> {
              for (int num : arrayList) {
                  System.out.println(Thread.currentThread().getName() + " (ArrayList): " + num);
              }
          });

          Thread thread2 = new Thread(() -> {
              arrayList.add(3); // Concurrent modification exception might occur
          });

          thread1.start();
          thread2.start();

          thread1.join();
          thread2.join();

          // CopyOnWriteArrayList - Thread-safe
          CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
          copyFromWriteArrayList.add(4);
          copyFromWriteArrayList.add(5);

          thread1 = new Thread(() -> {
              for (int num : copyOnWriteArrayList) {
                  System.out.println(Thread.currentThread().getName() + " (CopyOnWriteArrayList): " + num);
              }
          });

          thread2 = new Thread(() -> {
              copyFromWriteArrayList.add(6); // Safe to add concurrently
          });

          thread1.start();
          thread2.start();

          thread1.join();
          thread2.join();
      }
  }


Implementation:
ArrayList is implemented as a dynamic array.It can dynamically resize itself when elements are added or removed.Performance: Access Time: ArrayList provides fast access to elements by index since it uses an array under the hood. Retrieving an element by index is


an O(1) operation.
Insertion/Deletion: Insertion and deletion of elements in the middle or end of the list are slower because elements may need to be shifted.
Thread Safety: ArrayList is not thread-safe, meaning it is not safe for concurrent access from multiple threads without external synchronization.
Use Case: Use ArrayList when you need fast random access to elements, and the list size doesn't change frequently.

  
LinkedList:

Implementation: LinkedList is implemented as a doubly-linked list. Each element is stored as a node with references to the previous and next elements.
Performance:
Access Time: Accessing elements by index

is slower (O(n)) because you must traverse the list from the beginning or end to reach the desired position.
Insertion/Deletion: LinkedList excels at insertion and deletion operations (O(1)) because you can easily update references to neighboring nodes.
Thread Safety: LinkedList is not thread-safe, similar to ArrayList.
Use Case: Use LinkedList when you need efficient insertion and deletion operations in the middle of the list and random access is not a primary concern.

  
Vector:

Implementation: Vector is similar to ArrayList but is thread-safe by default. It also dynamically resizes itself.
Performance:
Access Time: Similar to ArrayList, Vector provides fast access to elements

by index (O(1)).
Insertion/Deletion: Insertion and deletion performance is similar to ArrayList but with the added overhead of synchronization, making them slower in a multi-threaded environment.
Thread Safety: Vector is thread-safe, meaning it can be safely accessed and modified by multiple threads without external synchronization. However, this can come with a performance cost due to synchronization overhead.
Use Case: Use Vector when you need a thread-safe dynamic array. However, consider using ArrayList or LinkedList if thread safety is not a requirement, as they may provide better performance in single-threaded scenarios.
In summary, the choice between ArrayList, LinkedList, and Vector depends on your specific requirements. If you need fast random access, ArrayList is a good choice. If you need efficient insertions and deletions, especially in a single-threaded environment, LinkedList may be more suitable. If you require thread safety, Vector provides it, but be aware of potential performance implications in multi-threaded scenarios.