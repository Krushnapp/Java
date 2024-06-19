
Object: An object is an instance of a class, encapsulating data (properties) and behavior (methods). Objects reside in the heap memory, which is a managed memory area in the JVM. When you create an object, memory is allocated in the heap to store its state.
Reference: A reference is a variable that holds the memory address (location) of an object. References themselves are stored on the stack, which is a smaller, faster memory area used for local variables, method calls, and function call parameters.

public class Person {
    // instance variables
    private String name;
    private int age;

    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // behavior (methods)
    public void sayHello() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}


// In Java, the class keyword is used to define a class, and the public keyword can be used to specify the access level of the class.

// Here are some key differences between a class and a public class in Java:

// Access level: A class that is not declared public is only accessible within the same package. A public class, on the other hand, can be accessed from anywhere, including from other packages.

// Class naming: If a class is not declared public, it can have any name, while a public class must have the same name as the file it is defined in.

// File naming: If a class is declared public, the file name must match the class name, including the case. If a class is not declared public, the file name can be any name.

// Usage: A public class is typically used as the entry point for a Java application, and it can be instantiated and used from other classes. A non-public class is typically used as a supporting class that is not intended to be used by other classes.

// Here is an example that illustrates the difference between a class and a public class:

class MyClass {
    // code for MyClass
}

public class PublicClass {
    // code for PublicClass
}
// In this example, MyClass is a non-public class that can only be accessed from within the same package, while PublicClass is a public class that can be accessed from anywhere.

// If this code was saved in a file named MyFile.java, the name of the file would not need to match the name of MyClass, since MyClass is not declared as public. However, if PublicClass was not declared as public, the file name could be any name, and it would not need to match the name of PublicClass.

// In general, it is good practice to only declare a class as public if it needs to be accessed from outside of the package, and to use non-public classes for implementation details that are not intended to be used by other classes.


//Defining a Student class.  
class Student{  
 int id; 
 String name;  
 //creating main method inside the Student class  
 public static void main(String args[]){  
  //Creating an object or instance  
  Student s1=new Student();//creating an object of Student  
  //Printing values of the object  
  System.out.println(s1.id);//accessing member through reference variable  
  System.out.println(s1.name);  
 }  
}  

//Java Program to demonstrate having the main method in   
//another class  
//Creating Student class.  
class Student{  
 int id;  
 String name;  
}  
//Creating another class TestStudent1 which contains the main method  
class TestStudent1{  
 public static void main(String args[]){  
  Student s1=new Student();  
  System.out.println(s1.id);  
  System.out.println(s1.name);  
 }  
}  


/* By reference variable
By method
By constructor */


class Student{  
 int id;  
 String name;  
}  
class TestStudent2{  
 public static void main(String args[]){  
  Student s1=new Student();  
  s1.id=101;  
  s1.name="Sonoo";  
  System.out.println(s1.id+" "+s1.name);//printing members with a white space  
 }  
}  

//Object and Class Example: Initialization through method
class Student{  
 int rollno;  
 String name;  
 void insertRecord(int r, String n){  
  rollno=r;  
  name=n;  
 }  
 void displayInformation(){System.out.println(rollno+" "+name);}  
}  
class TestStudent4{  
 public static void main(String args[]){  
  Student s1=new Student();  
  Student s2=new Student();  
  s1.insertRecord(111,"Karan");  
  s2.insertRecord(222,"Aryan");  
  s1.displayInformation();  
  s2.displayInformation();  
 }  
}  