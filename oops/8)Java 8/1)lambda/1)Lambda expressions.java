// Lambda expressions in Java are concise and anonymous functions that allow the representation of single-method interfaces. They simplify the code by reducing boilerplate code when implementing functional interfaces. Using a streamlined syntax (parameters) -> expression, they facilitate functional programming and enable passing behavior as arguments to methods. Lambda expressions were introduced in Java 8 and significantly enhance code readability and maintainability. They are widely used for callbacks, event handling, and parallel processing with the Stream API.
3)Lambda
  
  // Functional Interface with a single abstract method
interface MyFunction {
    int calculate(int x, int y);  //bydefalut public 
}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        // Using anonymous inner class (pre-Java 8) // anonymous function
        MyFunction addFunction = new MyFunction() { 
            @Override
            public int calculate(int x, int y) {   bydefalut private 
                return x + y;
            }
        };

        // Using lambda expression (Java 8 and later)
        MyFunction multiplyFunction = (x, y) -> x * y;

        // Calling the methods using the functional interfaces
        int sum = addFunction.calculate(5, 3);
        int product = multiplyFunction.calculate(4, 6);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}



Interfaces:

By default, methods declared in interfaces are implicitly public. This ensures that any class implementing the interface can access and implement those methods.
Anonymous Inner Classes:

Methods within anonymous inner classes do not have a default access modifier. If no access modifier is explicitly specified, they become private by default. This means they can only be accessed from within the anonymous class itself.