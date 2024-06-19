public class Main {
    public static void main(String[] args)  {
        Calculator c = new Calculator();
        try {
            int result = c.add(2, 7); // Assuming add returns the result
            System.out.println("Result: " + result);
        } catch (Exception e) { // Catch any exceptions thrown by add
            System.out.println("Error: " + e.getMessage());
        }{
          
        }

    }
}

public class Calculator {
    public int add(int num1, int num2) throws NumberOutOfRangeException , numbernoteligible,notok {

        if(num1>10){
            throw new notok("not ok");
        }
        if(num1<10){
            throw new NumberOutOfRangeException("range ke bahar");
        }
        // If neither condition is met, return the sum
        return num1 + num2;
    }
}

public class notok extends Exception {
    public notok(String notOk) { super(notOk);   }


}
public class NumberNotEligible extends Exception {
    public NumberNotEligible(String message) {
        super(message);
    }

}


public class NumberOutOfRangeException extends Exception {


    public NumberOutOfRangeException(String message) {

        super(message);
    }


}
