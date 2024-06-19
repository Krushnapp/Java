Java generics provide a way to create classes, interfaces, and methods that operate on various types without the need to define the type explicitly. Here's the syntax for Java generics:

Generic Class:

public class ClassName<T> {
    // T represents the type parameter
    // Class implementation
}


Generic Interface:

public interface InterfaceName<T> {
    // T represents the type parameter
    // Interface methods
}


Generic Method:

public <T> ReturnType methodName(T parameter) {
    // T represents the type parameter
    // Method implementation
}


import java.util.List;

public class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static <T> void printList(List<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>(10);
        Box<String> stringBox = new Box<>("Hello");

        System.out.println("Integer Value: " + integerBox.getValue());
        System.out.println("String Value: " + stringBox.getValue());

        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        printList(integers);
    }
}
