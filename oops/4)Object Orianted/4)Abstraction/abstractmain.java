1
Abstraction in Java is a fundamental object-oriented programming (OOP) principle that focuses on hiding the implementation details of an object and exposing only essential functionalities to the user. This approach offers several benefits, including:
1)Abrstact class -(partially implemented classes)
  2)interface


abstract class cantdoresearch{//here is no implementation just name
                               //name of class and method is also abstract can be non abstract
                               //cant create the object of abstact class
    abstract void display();
     abstract void move();
        
   
}
 class B extends cantdoresearch{
    void display(){
        System.out.println("dfgh");
    }
    void move(){
      //  display();
        System.out.println("move ");
    }
}
class abstractmain{
    public static void main(String[] args) {
        B obj =new B();
        obj.display();
        obj.move();

    }
}

An abstract class can't be instantiated: This means that you can't create an object of an abstract class. You can only create an object of a concrete class that extends the abstract class.

An abstract class can have abstract and non-abstract methods: An abstract method is a method without a body. Non-abstract methods have a body and can be called directly from an instance of the concrete class.

Any class that extends an abstract class must implement all abstract methods: If a concrete class extends an abstract class, it must provide implementations for all the abstract methods declared in the abstract class. If it doesn't, it must also be declared as abstract.

An abstract class can have constructors: An abstract class can have constructors that are called when an instance of a concrete class is created.

An abstract class can have instance variables: An abstract class can have instance variables that are inherited by the concrete classes that extend it.

An abstract class can't be final: An abstract class can't be declared as final, as it is designed to be extended.

An abstract class can implement interfaces: An abstract class can implement one or more interfaces, which will be inherited by its concrete classes.