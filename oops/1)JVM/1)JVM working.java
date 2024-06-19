https://medium.com/java-for-beginners/understanding-java-virtual-machine-jvm-architecture-e68d1c611026
https://www.freecodecamp.org/news/jvm-tutorial-java-virtual-machine-architecture-explained-for-beginners/
https://medium.com/@dalibor.plavcic/jvm-internals-for-the-java-job-interview-83257d038134
1)run the code ->compiler .c file -> JVM has JIT which convert into machine code by excuting line by line   


public class MyClass {

      public static String staticMessage = "This is a static message";

      public void printMessage(String message) {
          String localMessage = message + " from a method call";
          System.out.println(staticMessage + ", " + localMessage);
      }

      public static void main(String[] args) {
          MyClass obj = new MyClass(); // Create an instance
          obj.printMessage("Hello"); // Call a method with an argument
      }
  }

**JVM Architecture and Memory Management in Detail:**

****************1. Class Loading and MetaSpace in Depth:****************

    Class File Loading:

  When you run java MyClass, the JVM initiates the class loading process.
  The Class Loader is a crucial component responsible for loading .class files (compiled bytecode) into memory and preparing them for execution. It follows a hierarchical approach:
  Bootstrap Class Loader: The JVM's core class loader, responsible for loading core Java classes (like java.lang.Object) from the system libraries (rt.jar).
  Extension Class Loader: Loads classes from the extensions directory (usually jre/lib/ext) or specified by the java.ext.dirs system property.
  System Class Loader (or Application Class Loader): Loads application classes from the system classpath environment variable (CLASSPATH) or the command-line argument -classpath (or -cp). It can delegate loading requests to parent ClassLoaders.
  Class Loading Delegation:

  The Class Loader adheres to a delegation model. When a class needs to be loaded:
  The request is first delegated to the parent ClassLoader.
  If the parent cannot find the class, the requesting ClassLoader tries to load it from its own sources (e.g., system classpath for the System Class Loader).
  This delegation ensures a secure and organized way to load classes, preventing conflicts between application classes and core Java libraries.
  MetaSpace and Class Metadata:

  Once a class is loaded, the Class Loader extracts the class metadata, which includes:
  Bytecode instructions for the class's methods.
  Information about fields (including staticMessage in your example).
  Method definitions and their parameters.
  Class name, superclass, and interfaces it implements.
  This metadata is stored in MetaSpace (introduced in Java 8). MetaSpace is a non-heap memory area that grows dynamically as needed to accommodate class information for all loaded classes. It replaces the fixed-size PermGen (Permanent Generation) used in previous Java versions, eliminating potential "OutOfMemoryError" exceptions due to limited space for class metadata.
  Class Linking and Preparation:

  After the Class Loader places the metadata in MetaSpace, additional steps occur before the class is ready for execution:
  Linking: Verifies and prepares the class for use. This involves ensuring the class can be linked with its superclass, interfaces, and other referenced classes.
  Preparation: Allocates memory for static variables (like staticMessage) and performs other preparatory steps to make the class ready for object creation and method invocation.
  Execution Engine and Bytecode:

  Once a class is loaded, linked, and prepared, the JVM's Execution Engine can interact with it.
  The Execution Engine fetches and interprets the bytecode instructions for methods (stored in MetaSpace) and executes them line by line.
  It utilizes information from the class metadata to understand the methods, their parameters, and the logic they implement.
  In essence:

  The Class Loader identifies and loads .class files based on a delegation model.
  Extracted class metadata (including static variables) is stored in MetaSpace.
  Classes undergo linking and preparation before becoming available for execution.
  The Execution Engine interprets bytecode instructions from the loaded classes.
  By understanding these processes, you gain a deeper understanding of how the JVM prepares and executes Java code.


  
******************2. Heap and Object Creation:

  Heap as the Memory Stage:

  The heap is a dynamic memory area within the JVM. It's the primary workspace for storing all your program's objects and their data members (instance variables).
  The heap is not pre-defined with a fixed size. It grows and shrinks at runtime as needed to accommodate the objects your program creates and releases.
  Object Creation with new Keyword:

  In your main method, the line MyClass obj = new MyClass() triggers object creation.
  The new keyword is a fundamental mechanism in Java for allocating memory for objects in the heap.
  When you use new MyClass(), the following steps occur:
  Memory is allocated in the heap to store the new MyClass object.
  A constructor (usually the default no-argument constructor) of the MyClass class is invoked to initialize the object's instance variables (if any are defined in MyClass).
  A reference variable obj is created on the stack. This variable stores the memory address of the newly created object in the heap. It acts like a pointer to the object.
  Instance Variables and Object Data:

  Any instance variables defined within the MyClass class will be part of the object's memory allocation in the heap.
  These instance variables can hold various data types (e.g., integers, strings, references to other objects).
  The obj reference variable on the stack doesn't store the entire object itself, just the memory address where the object resides in the heap.
  Example Breakdown:

  If MyClass has an instance variable int value = 10;, the object created in the heap will have a designated memory space to store the integer value 10.
  The obj reference variable on the stack will hold the memory address pointing to this specific object's location in the heap.
  Key Points:

  The heap is the primary memory area for object data.
  The new keyword allocates memory for objects in the heap.
  Reference variables on the stack store memory addresses of objects in the heap.
  Instance variables are part of the object's data stored in the heap.
  Understanding these concepts is crucial for effective object-oriented programming in Java. By creating objects with well-defined instance variables and managing references appropriately, you can design efficient and organized programs.

  Runtime Data Area (RTDA):

  The RTDA is the memory space managed by the JVM during program execution. It consists of several sub-sections:

  Heap: Stores dynamically allocated objects created during runtime using the new keyword. The Garbage Collector (GC) automatically manages memory allocation and reclaims unused objects in the heap to prevent memory leaks.

  Method Area: Holds information about loaded classes, including methods, fields, constant pools, and their metadata. This information is essential for the JVM to understand the structure and behavior of loaded classes. (Stored in MetaSpace since Java 8)

  Java Virtual Machine Stack (JVMS): Each thread in the JVM has its own JVMS. It stores local variables, method arguments, and return addresses for method calls. As methods are invoked and return, frames are pushed and popped from the stack, ensuring proper execution flow.

  Program Counter (PC): Keeps track of the currently executing instruction within a thread. It acts like a pointer, indicating which line of bytecode is being processed within the currently running method.

**3. Static Variable and Heap:**

- The static variable `staticMessage` is a class-level variable, not specific to any instance. Unlike the object itself, `staticMessage` is not stored within the object's memory allocation in the heap.
- There's a single copy of `staticMessage` stored in a special **static area** within the heap. This area is accessible to all instances of the `MyClass` class.

**4. Stack and Method Calls:**

- When `obj.printMessage("Hello")` is called:
  - A new **stack frame** is created on the **stack** for the `printMessage` method execution.
  - This stack frame stores:
    - Reference to the `obj` instance (on the heap).
    - Local variable `message` holding the value "Hello" passed as an argument.
    - Local variable `localMessage`.
    - Information about the method call and return address.
- The **PC Register** points to the first instruction of the `printMessage` method.

**5. Execution Engine and Bytecode Interpretation:**

- The **Execution Engine** fetches and interprets bytecode instructions from `printMessage` (stored in **MetaSpace**, not directly from the `.class` file).
  - It might access `staticMessage` directly using its class reference (not from the stack).
  - It creates a new object for `localMessage` in the heap (separate from the object instance and the static variable).
  - Finally, it concatenates the strings and calls the `println` method (potentially involving the NMI) to print the message.

**6. Garbage Collection:**

- After the `printMessage` method finishes, its stack frame is removed from the stack.
  - The local variables (`message` and `localMessage`) become eligible for garbage collection if no other parts of the program reference them.
- The `MyClass` object (`obj`) remains in the heap as long as it's referenced somewhere in the program.
- The static variable `staticMessage` remains in the static area of the heap for the entire program execution as it's a class-level variable.

**Additional Considerations:**

- **Method Area (Pre-Java 8):** In Java versions before 8, the class metadata was stored in a memory area called the PermGen (Permanent Generation) within the heap. However, PermGen had a fixed size, which could lead to "OutOfMemoryError" exceptions for applications using a large number of classes.
- **Runtime Constant Pool:** Within the Method Area (or MetaSpace), there's a sub-area called the Runtime Constant Pool. This pool stores literals (like strings) and references used by the program, ensuring efficient access during execution.

**Understanding these details empowers you to write efficient Java code.** By being mindful of memory usage patterns (object creation, static variables, method calls), you can optimize your program's performance and avoid memory leaks. The automatic garbage collection helps in this process, but it's always beneficial to write code that minimizes unnecessary object creation and memory consumption.