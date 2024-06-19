
String Class (5 lines):
Immutable: Once created, its content cannot be changed.
Common methods: length(), charAt(), indexOf(), equals(), substring(), etc.
Thread-safe: No need for synchronization in single-threaded environments.
Performance: Generally efficient for string operations.
Use case: Ideal for most string scenarios in single-threaded programs.
  
  String Constant Pool:

  A special memory area that stores unique and immutable string literals (fixed text values) used within your program.
  When you create a string literal using double quotes ("), the JVM checks the String Constant Pool first.
  If the same string literal already exists, the reference to the existing string object is returned.
  If it's a new string literal, a new string object is created in the heap, and a reference to that object is added to the String Constant Pool.
  
StringBuilder (5 lines):
Mutable: Content can be modified after creation.
Thread-unsafe: Not recommended for concurrent access.
Faster: Slightly faster than StringBuffer due to lack of synchronization.
Use case: Preferred choice for efficient string manipulation in single-threaded applications.

  
StringBuffer (5 lines):
Mutable: Content can be modified after creation.
Thread-safe: Methods are synchronized for safe concurrent access.
Slower: Synchronization overhead makes it slightly slower than StringBuilder.
Use case: Essential for thread-safe string manipulation in multithreaded environments.

  split(): Split/divide the string at the specified regex.
  compareTo(): Compares two strings on the basis of the Unicode value of each string character.
  compareToIgnoreCase(): Similar to compareTo, but it also ignores case differences.
  length(): Returns the length of the specified string.
  substring(): Returns the substring from the specified string.
  equalsIgnoreCase(): Compares two strings ignoring case differences.
  contains(): Checks if a string contains a substring.
  trim(): Returns the substring after removing any leading and trailing whitespace from the specified string.
  charAt(): Returns the character at specified index.
  toLowerCase(): Converts string characters to lower case.
  toUpperCase(): Converts string characters to upper case.
  concat(): Concatenates two strings.

  
3. Immutability:
Any operation that appears to modify a string actually creates a new string object.
This is important to remember when working with strings, as you might not be modifying the original object in place as you expect.
4. String Pool:
Java maintains a pool of commonly used strings. If you create a string that already exists in the pool, the same object will be referenced, saving memory.


  Stream.
String upperCaseStr = str.chars()
                         .mapToObj(c -> Character.toString((char) c)) // Convert to String
                         .map(String::toUpperCase) // Convert to uppercase
                         .collect(Collectors.joining());
System.out.println("Uppercase: " + upperCaseStr); // Output: HELLO, WORLD!



4)Here's a detailed explanation of how StringBuilder works internally in Java:

Internal Structure:

 StringBuilder maintains an internal character array to store the sequence of characters.
 This array is initially allocated with a certain capacity (default is 16 characters).
 The actual number of characters stored in the StringBuilder is represented by the `length` field.

Operations:

 Append: When you append a character or string to the StringBuilder, it checks if there's enough space in the existing character array. 
     If there's enough space (length < capacity), the character(s) are directly appended to the array.
     If there's not enough space (length >= capacity), a new character array with a larger capacity is created (usually double the original capacity). The existing characters are copied to the new array, and then the new characters are appended.

 Insert: Similar to append, insert also checks for available space. It then needs to shift existing characters if the insertion happens in the middle of the string.

 Other Operations: Methods like `reverse()` or `substring()` typically operate on the existing character array without resizing it.

Key Points:

 The internal character array is dynamically resized to accommodate growing strings, improving efficiency for frequent string modifications.
 Resizing involves creating a new array and copying existing data, which can introduce some overhead for very frequent operations.

Example:

```java
StringBuilder sb = new StringBuilder();
sb.append("Hello");  // Initial capacity might be 16

// Enough space, no resize
sb.append(", ");

// Might need resize if capacity is full
sb.append("World!");

System.out.println(sb.toString());  // Output: Hello, World!
```

Benefits of StringBuilder:

 Efficiency for Modifications: Compared to String concatenation with the `+` operator, StringBuilder avoids creating a new String object for every modification.
 Thread Safety: StringBuilder is not thread-safe, meaning it should not be concurrently modified from multiple threads without proper synchronization.

In summary, StringBuilder provides a mutable string builder that efficiently handles string manipulation with dynamic resizing of its internal character array.