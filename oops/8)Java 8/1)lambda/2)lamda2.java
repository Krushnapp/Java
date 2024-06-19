class student{

String name;
    int id;
    
    public student(String name , int id){
    this.name =name;
        this.id =id;
        
    }
    public String getName(){
return name;
    }
    public int getid(){
return id;
    }
    public String toString(){
  return "student name = " +name +"id = "+id;
    }
}

interface check{
boolean naam(String name);
}
class main{
    
    public static void main(String[] args){
        
        ArrayList<student> s = new ArrayList<>();
          s.add(new  student("Ram",4));
           s.add(new  student("Sham",3));
           s.add(new  student("Kaushal",1));
           s.add(new  student("Gogu",5));
            
        
              for(int i=0;i<s.size(); i++){
                  if( check a = (s.getName(i))->{
  if(s.getName(i)(0)=='A') return true;
            else return false;
        } ){
                      System.out.println(s.getName(i));
            }
 
              }
        
       
        
        
        
    }

}