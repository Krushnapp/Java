1-----------> withou static we have to create its obect<-----------------------
  class wt{
    String br;
}
class lol{
    public static void main(String[] args){
        wt obj=new wt();
       
        System.out.println(obj.br);
    }
}
//


2------------> with static we dont have to craete object<--------------
class wt {
    static String br;

    public static void staticMethod() {
        System.out.println("This is a static method in the wt class.");
    }
}

class lol {
    public static void main(String[] args) {
         wt.br="ghjkl";//we can assign value to static varible with class name
        System.out.println(wt.br);

        wt.staticMethod();
    }
}





  
2) Java static method
If you apply static keyword with any method, it is known as static method.

A static method belongs to the class rather than the object of a class.
A static method can be invoked without the need for creating an instance of a class.
A static method can access static data member and can change the value of it.