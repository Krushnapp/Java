//The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method //body. It is used to achieve abstraction and multiple inheritance in Java.
//In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body.
//Interface declaration: by first user  
interface Drawable{  
void draw();  
}  
//Implementation: by second user  
class Rectangle implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  
}  
class Circle implements Drawable{  
public void draw(){System.out.println("drawing circle");}  
}  
//Using interface: by third user  
class TestInterface1{  
public static void main(String args[]){  
Drawable d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()  
d.draw();  
}}  