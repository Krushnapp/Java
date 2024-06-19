import java.util.*;

public class ListPractice {
    public static void main(String[] args) {
        // Using ArrayList
        List<Integer> arrayList = new ArrayList<>();
        performOperations(arrayList);

        // Using LinkedList
        List<Integer> linkedList = new LinkedList<>();
        performOperations(linkedList);

        // Using Vector
        List<Integer> vector = new Vector<>();
        performOperations(vector);
    }

    public static void performOperations(List<Integer> list) {
        // Adding elements to the list
        list.add(4);
        list.add(2);
        list.add(4);
        list.add(4);

        // Print the original list
        System.out.println("Original List: " + list);

        // Using the set() method to replace an element at a specific index
        list.set(2, 23);
        System.out.println("List after set(2, 23): " + list);

        // Using the add() method to insert an element at a specific index
        list.add(1, 8);
        System.out.println("List after add(1, 8): " + list);

        // Using size() method to get the number of elements in the list
        System.out.println("Size of the list: " + list.size());

        // Using remove() method to remove an element at a specific index
        list.remove(1);
        System.out.println("List after remove(1): " + list);

        // Using removeAll() method to remove elements from another collection
        List<Integer> toRemove = Arrays.asList(4, 23);
        list.removeAll(toRemove);
        System.out.println("List after removeAll(toRemove): " + list);

        // Using addAll() method to add elements from another collection
        List<Integer> toAdd = Arrays.asList(10, 20, 30);
        list.addAll(toAdd);
        System.out.println("List after addAll(toAdd): " + list);

        // Using clear() method to remove all elements from the list
        list.clear();
        System.out.println("List after clear(): " + list);

        System.out.println();
    }
}
