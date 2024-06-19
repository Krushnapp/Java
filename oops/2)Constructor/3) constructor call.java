class a{
a(){
System.out.println("a");
}
}
class b extends a{
 b(){
System.out.println("b");
}
}
class main{
  public static void main(String[] args){
    b obj =new b();
       //   obj.aa();
    
  }
}
// here constructor will called of both calss when object is created 
//