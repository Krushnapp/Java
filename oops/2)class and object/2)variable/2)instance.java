
public class localvariable{
    int f; //instance 
public static void main(String[] args){
  localvariable l=new localvariable();
   
  l.f=9;
    System.out.println(l.f);
}
}
    //instance is not stactic so it cannot be used inside static method
  //create object of it or make it static
//instance varible are varble which re ouTside method, block,function and inside class