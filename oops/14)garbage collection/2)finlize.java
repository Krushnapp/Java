// finalize() is a method in Java that is called by the garbage collector (GC) when an object is about to be garbage collected. It is a mechanism provided by Java for performing cleanup operations on an object before it is destroyed.

// Here's an example that demonstrates how finalize() works:


public class MyClass {
    public void finalize() {
        System.out.println("Object is being garbage collected");
        // Perform any necessary cleanup operations here
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj = null; // make the object eligible for garbage collection
        System.gc(); // suggest that the garbage collector run
    }
// }
// In this example, the MyClass object is created and then set to null, making it eligible for garbage collection. The System.gc() call suggests to the garbage collector that it should run, although it is not guaranteed to run immediately. When the garbage collector does run and determines that the MyClass object is eligible for garbage collection, it calls the finalize() method on the object before destroying it.

// In the finalize() method, you can perform any necessary cleanup operations on the object before it is destroyed. For example, you might use finalize() to release resources like file handles or network connections that the object has acquired during its lifetime. However, note that finalize() should not be relied upon as a primary means of resource management, as it is not guaranteed to be called in a timely manner, or even at all.

// It's also worth noting that starting from Java 9, the finalize() method is deprecated and has been removed from the Java language specification. This means that it is no longer recommended to rely on finalize() for cleanup operations, and alternative approaches should be used instead (e.g., using try-with-resources for resource management).