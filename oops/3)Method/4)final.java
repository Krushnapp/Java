//cant change metjod or value after using final keyword
//so the error will be final method cannt be overrode
class a{
  
 final void run(){
    System.out.println("h");
  }
}
class b extends a{
  void run(){
    System.out.println("k");
  }
}
class main{
  public static void main(String[] args){
    b obj=new b();
    obj.run();
  }
}