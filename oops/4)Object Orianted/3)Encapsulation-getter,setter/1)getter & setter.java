encapsulation in java
Encapsulation in Java is a process of wrapping code and data together into a single unit, We can create a fully encapsulated class in Java by making all the data members of the class private. Now we can use setter and getter methods to set and get the data in it.

The Java Bean class is the example of a fully encapsulated class.

Advantage of Encapsulation in Java
By providing only a setter or getter method, you can make the class read-only or write-only. In other words, you can skip the getter or setter methods.

class Student{  

private String name;  //private data member  

public String getName(){  //getter method for name  
return name;  
}  

public void setName(String name){  //setter method for name  
this.name=name  ;
}  
}  

class Test{  
public static void main(String[] args){  
 
Student s=new Student();  //creating instance of the encapsulated class 
 
s.setName("vijay");  //setting value in the name member 

System.out.println(s.getName());  //getting value of the name member  
}  
}

/*eEncapsulation in Java is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.

encapsulation in java
We can create a fully encapsulated class in Java by making all the data members of the class private. Now we can use setter and getter methods to set and get the data in it.

The Java Bean class is the example of a fully encapsulated class.

Advantage of Encapsulation in Java
By providing only a setter or getter method, you can make the class read-only or write-only. In other words, you can skip the getter or setter methods.

It provides you the control over the data. Suppose you want to set the value of id which should be greater than 100 only, you can write the logic inside the setter method. You can write the logic not to store the negative numbers in the setter methods.

It is a way to achieve data hiding in Java because other class will not be able to access the data through the private data members.

The encapsulate class is easy to test. So, it is better for unit testing.*/

