
Polymorphism is the ability of objects in object-oriented programming (OOP) to respond differently to the same method call at runtime, depending on the object's actual type. This allows for flexible and dynamic behavior in your code.

  Overloading:

  Same Name: Methods within the same class share the same name.
  Different Parameters: They differ in the number of parameters, type of parameters, or order of parameters.
  Compile Time: The compiler determines which overloaded method to call based on the arguments provided at the time of the method call.
  Overriding:

  Two Classes: Occurs between a subclass and its superclass.
  Same Signature: Methods share the same name and parameter list (type and order).
  Run Time: The JVM (Java Virtual Machine) determines at runtime which method to call (superclass or subclass) based on the actual object type that the reference variable points to.

  
  In object-oriented programming, polymorphism comes in two main flavors: runtime polymorphism and compile-time polymorphism. Let's break down the differences between them:

  **Compile-Time Polymorphism (Also known as Static Polymorphism)**

  * **Decision Time:** The decision about which specific method to call is determined at **compile time** based on the type of the reference variable.
  * **Mechanism:** Achieved primarily through **method overloading**. This means having multiple methods with the same name but different parameter lists within the same class.
  * **Example:**

  ```java
  class Calculator {
      public int add(int a, int b) {
          return a + b;
      }

      public double add(double a, double b) {
          return a + b;
      }
  }
  ```

  In this example, the `add()` method is overloaded. The compiler decides whether to call the version with `int` parameters or the one with `double` parameters based on the types of arguments passed at compile time.

  **Runtime Polymorphism (Also known as Dynamic Polymorphism)**

  * **Decision Time:** The decision about which specific method to call is determined at **runtime** based on the actual **type of the object** the reference variable points to, not just the reference itself.
  * **Mechanism:** Achieved primarily through **method overriding**. This means having methods with the same signature in a subclass and its superclass. The subclass provides a specialized implementation of the inherited method. 
  * **Example:**

  ```java
  abstract class Shape {
      abstract double calculateArea();
  }

  class Circle extends Shape {
      // ...
      @Override
      double calculateArea() { /* Circle-specific calculation */ } 
  }

  class Square extends Shape {
      // ...
      @Override
      double calculateArea() { /* Square-specific calculation */ }
  }
  ```

  In this example, at runtime, the decision of whether to call `Circle.calculateArea()` or `Square.calculateArea()` depends on the actual type of object a `Shape` reference points to.

  **Key Differences**

  | Feature                | Compile-Time Polymorphism | Runtime Polymorphism |
  |------------------------|---------------------------|----------------------|
  | Method Binding         | Static binding            | Dynamic binding      |
  | Mechanism              | Method overloading        | Method overriding    |
  | Decision Time          | During compile time       | During runtime       |
  | Flexibility            | Less flexible             | More flexible        |

  **Summary**

  * **Compile-time polymorphism** is based on the type of reference variable and resolved during compilation.
  * **Runtime polymorphism** is based on the actual type of the object and resolved while the program is running.

  **In practice, both forms of polymorphism are valuable tools for building adaptable and maintainable object-oriented applications in Java.** 

