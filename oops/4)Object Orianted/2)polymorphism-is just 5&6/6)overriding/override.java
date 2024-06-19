class p{
    void display(){
    
        System.out.println("parent");
    }
}
class c extends p{
    void display(){
        super.display();
        System.out.println("Child");
    }
}
class override{
    public static void main(String[] args) {
        c obj =new c();
        obj.display();
    }
}
//if child method is not present parent method will be called automatically
//called as run time polymorphism 
// 