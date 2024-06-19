## NullPointerException in Java: Your Cheat Sheet

What is it?

 A runtime exception that occurs when you try to use a reference variable that doesn't point to any valid object (it's null).

How to get it:

 Dereferencing a null variable (calling methods, accessing properties).
 Returning null from a method without proper handling in calling code.
 Using null with array indexing (null array reference or invalid index).
 Calling methods on an uninitialized object reference.

How to avoid it:

 Initialize variables with valid values before using them.
 Use null checks before dereferencing a variable (e.g., `if (name != null) { ... }`).
 Consider using Optional objects for nullable data types (Java 8+).

Example:

```java
String name = null;  // This is bad!
System.out.println(name.toUpperCase()); // Throws NullPointerException
```

Fix:

```java
if (name != null) {
  System.out.println(name.toUpperCase());
} else {
  System.out.println("name is null");
}
```

Remember: NullPointerExceptions are common but preventable. Write clean and robust code by handling null values gracefully.
