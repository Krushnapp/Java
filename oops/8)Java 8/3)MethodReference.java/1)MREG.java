import java.util.Arrays;

public class MethodReferenceExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Using a method reference to print even numbers
        Arrays.stream(numbers)
              .filter(MethodReferenceExample::isEven)  
              .forEach(MethodReferenceExample::printEven);
    }

    // Custom method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Custom method to print even numbers
    public static void printEven(int number) {
        System.out.println(number);
    }
}
