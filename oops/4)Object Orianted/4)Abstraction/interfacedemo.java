//inteface we cannot achive multiple inheritance directly in java so we use interface 
//acheive multiple inheritance
//if child calss want to inheritance of 2 base classe i is not possible by inheritance 
//it requires interface
//two keyword 1)interface 2)impliments
//only have abstract method->writing only method declaration not method defination

interface A{
    void Adisplay();
}
interface B{
    void Bdisplay();
}
class AB implements A,B{
    public void Adisplay() {
        System.out.println("A display");
    }
    public void Bdisplay() {
        System.out.println("B display");
    }
}
class interfacedemo{
    public static void main(String[] args) {
        AB obj =new AB();
        obj.Adisplay();
        obj.Bdisplay();
        
    }
}