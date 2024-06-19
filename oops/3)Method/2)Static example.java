public class Main {
    public static void main(String[] args) {
        int x = 5, y = 3;
        System.out.println("x + y = " + MathUtils.add(x, y));
        System.out.println("x - y = " + MathUtils.subtract(x, y));
        System.out.println("PI = " + MathUtils.PI);
        MathUtils.lol();
        MathUtils a = new MathUtils();
        a.loll();
    }
}

class MathUtils {
    public static final double PI = 3.14159;

    public static void lol() {
        System.out.println("static");
    }

    void loll() {
        System.out.println("non static");
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }
}
//here i can call method without craeting object 
//but cant call loll because its not static