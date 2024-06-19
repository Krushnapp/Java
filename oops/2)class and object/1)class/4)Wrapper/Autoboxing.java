Wrapper Classes:

Wrapper classes (Integer, Double, etc.) are objects that represent primitive data types.
They store the primitive value in an internal field and provide additional functionalities through methods.
You can assign a new wrapper object to the same variable, effectively changing the associated primitive value.
The Catch:

Primitives themselves cannot be changed directly. However, when you assign a new Integer object to a variable previously holding another Integer, here's what happens:

New Object Creation: A new Integer object is created on the heap with the new value.
Variable Reassignment: The variable you're using now points to this newly created Integer object.
Old Object (Optional): The previous Integer object (if it still exists) becomes eligible for garbage collection if it's not referenced anywhere else.
Example:

Java
int primitiveValue = 10;  // Primitive variable with value 10

Integer wrapperValue = primitiveValue;  // Autoboxing - create Integer with value 10

wrapperValue = 20;  // Assigning a new Integer object with value 20

// Here, primitiveValue (10) remains unchanged.
// But wrapperValue now points to a new Integer object holding 20.
Use code with caution.
Key Points:

You cannot directly change the value of a primitive variable.
Assigning a new wrapper object effectively changes the associated primitive value indirectly.
The primitive variable itself and the wrapper objects are separate entities.
In essence, wrapper classes provide a way to work with primitive data types in an object-oriented manner, allowing for value changes through object manipulation.


  Collection frameworks in Java heavily rely on **wrapper classes** to work with primitive data types. Here's why:

  **Primitive Data Types vs. Wrapper Classes:**

  * **Primitive Data Types:** These are fundamental data types like `int`, `double`, `char`, etc. They are efficient for storing basic values but lack object-oriented features.
  * **Wrapper Classes:** These are classes (e.g., `Integer`, `Double`, `Character`) that represent primitive data types as objects. They provide functionalities beyond just storing the value.

  **Collection Frameworks and Wrapper Classes:**

  * **Requirement for Objects:** Collection frameworks like ArrayList, HashMap, etc., are designed to work with objects. They use methods like `hashCode()` and `equals()` to manage elements.
  * **Wrapper Classes Bridge the Gap:** Primitive data types don't have these methods. Wrapper classes come in to bridge this gap. They encapsulate the primitive value and provide implementations for `hashCode()` and `equals()`. This allows collections to effectively store and manage elements with primitive data.

  **Benefits of Using Wrapper Classes:**

  * **Object-Oriented Features:** Wrapper classes enable functionalities like comparison (`equals()`), hashing (`hashCode()`), and conversion to strings (`toString()`), which are essential for collection operations.
  * **Type Safety:** Wrapper classes enforce type safety by preventing incompatible data types from being stored together in a collection.
  * **Autoboxing and Unboxing:** Java provides automatic conversion between primitives and their wrapper classes (`autoboxing` and `unboxing`), making code more concise.

  **Example:**

  ```java
  // Primitive data type cannot be used as a key in HashMap
  // int key = 10; // This would cause an error

  // Wrapper class provides necessary functionalities
  Integer key = 10;
  HashMap<Integer, String> map = new HashMap<>();
  map.put(key, "Value for key 10");
  ```

  **In summary, collection frameworks leverage wrapper classes because they provide the object-oriented functionalities and type safety needed for efficient management of elements within collections, even those that hold primitive data.**