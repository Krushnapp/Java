class A{

    A(){   //constructor 1 without parameter  constructor must have same name as class
System.out.println("khali");
    }
    A(int a){  ////constructor 2 with parameter
System.out.println(a*a);
    } 
   void dis(){
        System.out.println(a);
    }
}
class constover{
    public static void main(String[] args) {
         A obj =new A();
         A obj1 = new A(7);
obj.dis();
      obj1.dis();
    }
}
//Constructor overloading in Java refers to the use of more than one constructor in an instance class. However, each overloaded constructor must have different signatures. For the compilation to be successful, each constructor must contain a different list of arguments.
//called as run time poly