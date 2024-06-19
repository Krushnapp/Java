https://www.geeksforgeeks.org/java-8-features/#streams


Feature Name	Description
1)Lambda: expression	A function that can be shared or referred to as an object.
2)Functional Interfaces: Single abstract method interface.
3)Method References:	Uses function as a parameter to invoke a method.
4)Default method:	It provides an implementation of methods within interfaces enabling 'Interface evolution' facilities.
5)Stream API:	Abstract layer that provides pipeline processing of the data.
6)Date Time API:	New improved joda-time inspired APIs to overcome the drawbacks in previous versions
7)Optional Wrapper: class to check the null values and helps in further processing based on the value.
8)Nashorn, JavaScript Engine:	An improvised version of JavaScript Engine that enables JavaScript executions in Java, to replace Rhino.
9)Concurrency API enhancements: Java 8 introduced improvements to the concurrency API, including the ForkJoinPool and CompletableFuture classes for better parallel programming support.
10)Collection API improvements: New methods like forEach and removeIf were added to the Collection interface, streamlining common operations on collections.
11)Base64 encoding and decoding: Built-in methods for encoding and decoding binary data in Base64 format were added for simpler data transformation tasks.
12)NIO.2 enhancements: Java 8 offered improvements to the Java I/O API, including the NIO.2 package for more efficient and flexible file I/O operations.



1. Functional Interfaces:

  An interface with exactly one abstract method.
  Represent a single functionality that can be implemented using a Lambda expression.
  Examples: Runnable, Predicate, Consumer, Function, Supplier, etc.

  
2. Lambda Expressions:

  Concise way to define anonymous functions (functions without a name).
  Used to implement Functional Interfaces or anonymous inner class(which is direct impl of FI withou any class) directly without creating separate classes .
  Syntax: (parameters) -> expression or (parameters) -> { statements }

public class LambdaExpressionExample {
    public static void main(String[] args) {
        // Using anonymous inner class (pre-Java 8)
        MyFunction addFunction = new MyFunction() {
            @Override
            public int calculate(int x, int y) {
                return x + y;
            }
        };

        // Using lambda expression (Java 8 and later)
        MyFunction multiplyFunction = (x, y) -> x * y;

        // Calling the methods using the functional interfaces
        int sum = addFunction.calculate(5, 3);
        int product = multiplyFunction.calculate(4, 6);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}

3. Streams:  (3.1)Collectors Class:

  Process sequences of elements in a declarative way.
  Operate on collections, arrays, or other data sources.
  Common methods: map (transforms elements), filter (selects elements), reduce (combines elements).
  Lambda expressions are often used within Stream operations for concise and focused logic.

4. Method References:

  Concise way to create Lambda expressions by referring to existing methods.
  Use the :: operator to reference a method.
  Can replace Lambda expressions when appropriate to improve readability.
  

  List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
  numbers.stream()
      .filter(n -> n % 2 == 0)
      .forEach(Integer::toString) // Method reference to toString
      .forEach(n -> System.out.println(n.toString())); // Lambda to print


5)Default methods :were indeed introduced in Java 8 as a key feature. They significantly impacted Java interfaces by allowing the addition of method implementations to existing interfaces without breaking backward compatibility.
we can use implemented method of interafce withot implemnteing it in implemenetd class

interface Vehicle {
    default void printDetails() {
        System.out.println("This is a vehicle.");
    }
}

class Car implements Vehicle {
    // No need to implement printDetails() here
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.printDetails();  // Output: This is a vehicle.
    }
}


6)Static Methods in Interfaces:

  Methods declared within an interface using the static keyword.
Allows interfaces to contain utility methods that don't require implementation in concrete classes.
Useful for helper methods or factory methods related to the interface functionality.
Enables interfaces to hold shared state and logic.
Example:
Java
interface MathUtils {
    static double factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

7)The Optional :
class provides a container object that may or may not contain a non-null value. It helps in avoiding null pointer exceptions and encourages more robust error handling.


8)ForEach() Method:

What it is: A method available on Iterable and Stream interfaces in Java 8 for iterating over elements and performing an action on each element.
Significance:
Provides a concise and readable way to iterate over collections without explicit loops.
Can be used with Lambda expressions for even more compact code.
Improves code conciseness and readability.
Example:


****************************************************************************************************************
1. Nashorn JavaScript Engine:

Replaced Rhino engine, offering improved performance and support for modern JavaScript features.
Enables seamless integration of JavaScript code within Java applications.
2. Parallel Array Sorting:

Leverages multiple cores for faster sorting of large arrays using the Arrays.parallelSort method.
Improves sorting performance on multi-core systems.
3. Type and Repating Annotations:

@Type: Provides type information for generic methods, enhancing type safety and code readability.
@Repeatable: Allows repeating annotations on elements, improving code flexibility and expressiveness.
4. IO Enhancements:

NIO.2: Introduces new APIs for asynchronous, non-blocking I/O operations, improving I/O efficiency.
Files class: Provides convenient methods for file manipulation, simplifying file operations.
5. Concurrency Enhancements:

CompletableFuture: Enables asynchronous programming and chaining of tasks, improving concurrency and responsiveness.
ForkJoinPool: Offers a framework for efficient parallel execution of tasks, improving parallel processing capabilities.
6. JDBC Enhancements:

java.sql.RowSet: Provides a lightweight, in-memory representation of JDBC result sets, improving performance and flexibility.
DataSource.getConnection: Allows passing additional arguments when obtaining connections, enhancing connection management.
  
****************************************************************************************************************

  In addition to the enhancements made to the `Comparator` interface in Java 8, there were several other improvements and enhancements to existing features in previous versions of Java:

  1. **Collections Framework Enhancements**: 
     - Introduction of the `forEach` method in collections to iterate over elements more efficiently.
     - The `removeIf` method was added to the `Collection` interface to allow for conditional removal of elements.

  2. **Stream API**:
     - The Stream API introduced in Java 8 revolutionized the way data is processed by providing a fluent and functional approach to processing collections of data.
     - Stream API methods like `filter`, `map`, `reduce`, `collect`, etc., provided powerful operations for data manipulation and transformation.

  3. **Optional Class**:
     - The `Optional` class was introduced in Java 8 to represent a nullable value. It helps in reducing NullPointerExceptions and improving code readability.
     - Methods like `orElse`, `orElseGet`, `orElseThrow`, etc., were added to handle optional values effectively.

  4. **Date and Time API**:
     - Java 8 introduced a new Date and Time API (`java.time` package) to address the shortcomings of the legacy `java.util.Date` and `java.util.Calendar` classes.
     - The new API provided classes like `LocalDate`, `LocalTime`, `LocalDateTime`, `ZonedDateTime`, `Period`, `Duration`, etc., for handling dates, times, durations, and intervals more effectively.

  5. **Lambda Expressions**:
     - Although introduced in Java 8, lambda expressions significantly enhanced the functional programming capabilities of Java.
     - Lambda expressions allowed for concise and expressive syntax for representing anonymous functions, making code more readable and maintainable.

  6. **Method References**:
     - Method references provide a shorthand syntax for invoking methods using lambda expressions.
     - They improve code readability and reduce verbosity by allowing direct reference to methods, constructor, or instance method of an object.

  These enhancements improved developer productivity, code readability, and performance while modernizing Java's core libraries and language features.