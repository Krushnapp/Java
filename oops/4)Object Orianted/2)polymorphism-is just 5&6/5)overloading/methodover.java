class A{

  void  add(){   //method with 0 parameter
System.out.println(50+30);
    }
    void  add(int a,int b){  ////method  with 2 parameter
System.out.println(a+b);
    } 
   
}
class methodover{
    public static void main(String[] args) {
         A obj =new A();
        obj.add(10,20);
        obj.add();

    }
}
//it is implemented in single class so no need of inheritance
//called static binding
//run time polymorphism