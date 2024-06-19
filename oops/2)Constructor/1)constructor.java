class Student4{  
    int id;  
    String name;  
    //creating a parameterized constructor  just to initialize default value
    Student4(int i,String n){  
    id = i;  
    name = n;  
    }  
    //method to display the values  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    //creating objects and passing values  
    Student4 s1 = new Student4(111,"Karan");  
    Student4 s2 = new Student4(222,"Aryan");  
    //calling method to display the values of object  
    s1.display();  
    s2.display();  
   }  
}  





////constructor vs setter
public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Creating a new object of Person class using constructor
        Person person1 = new Person("John", 25);
        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");

        // Using setters to modify the values of instance variables
        person1.setName("Jane");
        person1.setAge(30);
        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
    }
}
