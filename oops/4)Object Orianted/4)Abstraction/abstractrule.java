An abstract class is a class that cannot be instantiated, meaning you cannot create an object of it directly. It is intended to serve as a base class for other classes that will inherit its functionality. The subclasses can provide the implementation of the abstract methods in the abstract class. Here's an example code to illustrate this:

csharp
Copy code
abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    void makeSound() {
        System.out.println(name + " is barking.");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    void makeSound() {
        System.out.println(name + " is meowing.");
    }
}

class Main {
    public static void main(String[] args) {
        Animal animal = new Dog("Fido");
        animal.makeSound();
        animal.sleep();

        animal = new Cat("Whiskers");
        animal.makeSound();
        animal.sleep();
    }
}
In the above code, Animal is an abstract class which has a member variable name, an abstract method makeSound() without implementation and a concrete method sleep() with implementation. The Dog and Cat classes inherit the Animal class and provide their implementation of the makeSound() method.

Note that we cannot create an instance of the Animal class directly because it is abstract. Instead, we create objects of the Dog and Cat classes which are subclasses of Animal and can be instantiated. We can then call the makeSound() and sleep() methods on these objects.