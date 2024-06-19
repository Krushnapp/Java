// Step 1: Define the functional interface
@FunctionalInterface
interface NumberProcessor {
    int process(int number);
}

public class Main {
    public static void main(String[] args) {
        // Step 2: Create a lambda expression
        NumberProcessor s = (a)->(a*a);

        // Step 3: Prompt the user to enter an integer
        // You can use Scanner for input
   System.out.println(s.process(5));
        // Step 4: Calculate and print the square using the lambda expression
    }
}
