import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
        int nums[] ={1,1,2,2,3,3,3,4,5};
        
        Map<Integer,Integer> mp = new HashMap<>();
        
        for(int num : nums){
            
            int c =mp.getOrDefault(num,0);
            
            mp.put(num,c+1);
        }
        
        mp.forEach((name, c) -> System.out.println(name + ": " + c));
    }
}
///traditional iterate


while (iterator.hasNext()) {
    Map.Entry<Integer, Integer> entry = iterator.next();
    int num = entry.getKey();
    int count = entry.getValue();

    if (count == 3) {
        System.out.println("Number with frequency 3: " + num);
    }




  ////////HashMap:

Unordered: HashMap does not maintain the order of elements. It provides the best performance for basic operations like adding, getting, and removing elements, with an average time complexity of O(1).
No Duplicates: It does not allow duplicate keys. If you put a value with an existing key, it will replace the previous value.
Not Thread-Safe: HashMap is not thread-safe by default. If you need thread safety, you can use Collections.synchronizedMap or use the ConcurrentHashMap class.
LinkedHashMap:

Ordered: LinkedHashMap maintains the order of elements based on the insertion order. This means that when you iterate over a LinkedHashMap, the elements will be returned in the order they were added.
No Duplicates: Like HashMap, it does not allow duplicate keys.
Not Thread-Safe: LinkedHashMap is not thread-safe by default.
TreeMap:

Sorted: TreeMap orders elements based on their natural order (if the keys are comparable) or a custom comparator that you can provide. This makes it suitable for scenarios where you need the keys to be sorted.
No Duplicates: Like other maps, it does not allow duplicate keys.
Not Thread-Safe: TreeMap is not thread-safe by default.
In summary, you choose a map implementation based on your specific requirements:

Use HashMap for unordered maps with fast basic operations.
Use LinkedHashMap when you need to maintain insertion order.
Use TreeMap when you need the keys to be sorted, either naturally or by a custom comparator.
Remember that none of these maps are inherently thread-safe for concurrent access. If you need thread safety, consider using the appropriate synchronization mechanisms or use the concurrent versions of these maps, such as ConcurrentHashMap.