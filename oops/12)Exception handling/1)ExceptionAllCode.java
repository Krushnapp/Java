class Inchar extends Exception {
    public Inchar(String message) {
        super(message);
    }
}

class Inchar2 extends Exception {
    public Inchar2(String message) {
        super(message);
    }
}

public class MobileNumberValidator {

    public void mobileNumberValidator() throws Inchar2,Inchar {
        // Example of an operation that might throw your custom exception
        int j = 10 / 'd';
        if(j==546){
            System.out.println(j);
        }
        else if(j==2){
             throw new Inchar2("Divided by inchar1");
        }
           else if(j==0){
             throw new Inchar2("Divided by inchar2");
        }

    }

    public static void main(String[] args) {
        MobileNumberValidator validator = new MobileNumberValidator();

        try {
            // Call the method that might throw your custom exception
            validator.mobileNumberValidator();
        } catch (Inchar2 e) {
            // Catch and handle the custom exception
            // e.setMessage("Error Message here");
            System.out.println("Error: " + e.getMessage());
            //System.out.println(10/'s');
        }
        catch (Inchar e) {
            // Catch and handle the custom exception
            // e.setMessage("Error Message here");
            System.out.println("Error: " + e.getMessage());
            //System.out.println(10/'s');
        }
    }
}
