class A{

  
      void  add(int a,int b){  
  System.out.println("a+b="+(a+b)); //==act as addintion 10+20=30
  System.out.println("a+b="+a+b); //==act as contaction 10+20=1020
      } 
     
  }
  class operatorover{
      public static void main(String[] args) {
           A obj =new A();
          obj.add(10,20);
         
      }
  }
  