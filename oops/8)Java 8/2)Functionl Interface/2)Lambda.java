interface lol{

 void print();

    default void kin(){
        System.out.println("Anohhnmys");
}
     static void kiin(){
        System.out.println("Anohhnmys stativ");
}
}

public class LambdaUse{

    public static void main(String[] args){
        lol a = ()->{
                System.out.println("Anonmys");
            };

        lol.kiin();
        a.kin();
        a.print();

    }
}