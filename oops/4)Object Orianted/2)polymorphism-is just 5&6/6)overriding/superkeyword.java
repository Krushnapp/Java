class A{
    int a=10;
    void show(){
        System.out.println("class parent");
    }
}
class B extends A{
    int a=100;
    void display(){
        System.out.println("class base");
    }
}
class C extends B{
    int a=10;
    void showing(){
        System.out.println(super.a); //super keyword will direct to the object of immidiet parent class ie B
    }
}
class superkeyword{
    public static void main(String[] args) {
        C obj =new C();
        System.out.println(obj.a);
        obj.showing();
       // System.out.println(Super.a);
    }
}

//super is just obj of parent class
like super.add() means call methdo of parent class