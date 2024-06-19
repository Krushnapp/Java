
Inheritance is a fundamental object-oriented programming (OOP) concept that allows you to create new classes (subclasses) based on existing classes (superclasses). This enables code reuse, promotes maintainability, and helps define relationships between objects.

class P{
    int a=10;
    void display(){
        System.out.println("parent");
    }
}
class C extends P{
    int b=30;
    void show(){ 
        System.out.println("child");
    }
}
 class inheritdemo{
     public static void main(String[] args) {
        C obj =new C();    //by creating the object of child class
         System.out.println(obj.b);
         obj.show();
         System.out.println(obj.a); //we have printed the obj of parent/base class
         obj.display();
         
     }
 }






class Employee{  
 float salary=40000;  
}  
class Programmer extends Employee{  
 int bonus=10000;  
}
class lo{
     public static void main(String args[]){  
   Programmer p=new Programmer();  
   System.out.println("Programmer salary is:"+p.salary);  
   System.out.println("Bonus of Programmer is:"+p.bonus);  
}  

}
