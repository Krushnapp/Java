// we need type safty in means we declare varible with data type
//   eg int a=6; not a= 6; hat means type saftey 


//   now we can have have our defined data type for class

  class Container<T>{
    T value;


    public void setvalue(T value){
      this.value=value;
        System.out.println(value);
    }
    public T getvalue(){
      return value;
    }
  }

  class demon{
    public static void main(String[] args){

      Container<Integer> a = new Container<>();  //now T can be assigner as Integer
        a.setvalue(5);
      System.out.println(a.getvalue());

    }

  }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Interveiew questions
  What are generics in Java, and why are they used?

  Generics in Java allow you to create classes, interfaces, and methods that operate on a type parameter, enabling you to design classes and methods that are type-safe and reusable. They provide compile-time type checking, which helps in detecting errors at compile time rather than at runtime. Generics also promote code reusability by allowing you to write generic algorithms that can work with different types.

  Explain the syntax of generics in Java.

  Generics in Java are represented using angle brackets <>. They can be used with classes, interfaces, and methods. Here's a basic syntax example:

  java
  Copy code
  public class Box<T> {
      private T value;

      public void setValue(T value) {
          this.value = value;
      }

      public T getValue() {
          return value;
      }
  }
  In this example, T is the type parameter, and it can be replaced with any reference type at the time of instantiation.

  What is a bounded wildcard in Java generics?

  A bounded wildcard in Java generics allows you to restrict the types that can be used as arguments in a generic type. There are two types of bounded wildcards: upper bounded wildcard (<? extends T>) and lower bounded wildcard (<? super T>).

  Upper bounded wildcard (<? extends T>): It allows any type that is a subtype of T.
  Lower bounded wildcard (<? super T>): It allows any type that is a supertype of T.
  When would you use a wildcard in Java generics?

  Wildcards in Java generics are useful when you want to write methods or classes that can operate on collections of different types, without being specific about the type. They are particularly handy in scenarios where you need flexibility in accepting different types of collections as arguments or return types.

  What is the difference between <? extends T> and <? super T> in Java generics?

  <? extends T> is an upper bounded wildcard, allowing any subtype of T.
  <? super T> is a lower bounded wildcard, allowing any supertype of T.
  In general, you should use <? extends T> when you only need to read from a generic collection, and <? super T> when you only need to write to the collection.

  These questions cover some fundamental aspects of Java generics that are often discussed in interviews. Understanding generics is crucial for writing clean, type-safe, and reusable code in Java.





