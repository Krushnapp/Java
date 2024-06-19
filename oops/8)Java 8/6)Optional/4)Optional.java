https://medium.com/@uvrajanshuman/optional-in-java-8-ffcf45e01602
Optional: The Optional class provides a container object that may or may not contain a non-null value. It helps in avoiding null pointer exceptions and encourages more robust error handling.t

  Here's a concise summary of the Optional class in Java 8:

  What is Optional?

  - Introduced in Java 8 to handle null values safely.
  - Wraps a value (can be null) indicating its presence or absence.

  Creating Optionals:

  - `Optional.of(value)`: Creates an Optional with a non-null value (throws exception if null).
  - `Optional.ofNullable(value)`: Creates an Optional with any value (including null).
  - `Optional.empty()`: Creates an empty Optional (no value).

  Common Methods:

  - `isPresent()`: Checks if a value exists (true if present).
  - `get()`: Retrieves the value (throws exception if empty).  Use with caution!
  - `orElse(defaultValue)`: Returns the value or a default value if empty.
  - `orElseGet(supplier)`: Returns the value or the result of a supplier function if empty (more flexible than orElse).
  - `orElseThrow(exceptionSupplier)`: Returns the value or throws an exception if empty.
  - `ifPresent(consumer)`: Executes a function if a value is present.

  Benefits:

  - Reduces null checks and `NullPointerExceptions`.
  - Improves code readability and maintainability.
  - Supports functional programming style.

  Remember:

  - Avoid using `get()` directly, check for presence with `isPresent()` first.
  - Use `orElse` or `orElseGet` for default values instead of null checks.

  
  Optional is a generic class defined in the java.util package, that got introduced in Java 8.

  It facilitates the handling of potentially absent values in a more concise and expressive manner.
  It provides a container-like structure to wrap objects, indicating the possibility of a value being present or absent.

  Its primary purpose is to provide a safer alternative to handling null values, thereby reducing the risk of NullPointerException. By explicitly acknowledging the possibility of an absent value, Optional encourages developers to write more robust and error-resistant code.j

  Without Optional (custom null check):

  public String getStudentName() {
    // can be null or non-null value
    Student student = fetchStudent(); 
    if(student != null){
      return student.getName();
    }else {
      return null;
    }
  }
  With Optional:

  public Optional<String> getStudentName() {
    // can be null or non-null value
    Optional<Student> student = Optional.ofNullable(fetchStudent()); 
    if(student.isPresent()){
      return Optional.of(student.getName());
    }
    return Optional.empty();
  }
  Creating Optional Instances
  To create an Optional instance, the following methods are provided:

  1. Optional.of(T value):

  Creates an Optional object containing a non-null value.
  Throws: NullPointerException if the value provided is null.
  Example:
  String name = "John Doe"; 
  Optional<String> optionalName = Optional.of(name); 
  System.out.println("Optional Name: " + optionalName);
