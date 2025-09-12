package ExceptionHandling;

// Custom checked exception 1
class Inchar extends Exception {
    public Inchar(String message) {
        super(message);
    }
}

// Custom checked exception 2
class Inchar2 extends Exception {
    public Inchar2(String message) {
        super(message);
    }
}

public class MobileNumberValidator {

    // Method that may throw custom exceptions
    public void mobileNumberValidator() throws Inchar, Inchar2 {
        int j = 0;
        try {
            // Example operation that may throw RuntimeException
            j = 10 / 2; // Replace with any risky operation
            System.out.println("Value: " + j);

            // Example custom exception logic
            if (j == 2) {
                throw new Inchar2("Custom Exception: Inchar2 triggered");
            } else if (j == 0) {
                throw new Inchar("Custom Exception: Inchar triggered");
            }

        } catch (ArithmeticException e) {
            // Handle runtime exception here if needed
            System.out.println("Arithmetic Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        MobileNumberValidator validator = new MobileNumberValidator();

        try {
            validator.mobileNumberValidator();

        } catch (Inchar2 e) {
            System.out.println("Caught Inchar2: " + e.getMessage());

        } catch (Inchar e) {
            System.out.println("Caught Inchar: " + e.getMessage());

        } catch (Exception e) {
            // Catch-all for any other exceptions
            System.out.println("Caught General Exception: " + e);
        }

        System.out.println("Program completed successfully.");
    }
}
