
- **Use lambdas:** When you need to define **new anonymous methods** with custom logic on the fly.
- **Use method references:** When you want to **reuse existing methods** in a concise way and avoid creating unnecessary anonymous classes.


  public class MethodReferenceExample {

      public static int square(int number) {
          return number * number;
      }

      public static void main(String[] args) {
          // Using a lambda expression
          Function<Integer, Integer> squareLambda = number -> number * number;

          int result1 = squareLambda.apply(5);
          System.out.println("Square of 5 using lambda: " + result1); // Output: Square of 5 using lambda: 25

          // Using a method reference
          Function<Integer, Integer> squareRef = MethodReferenceExample::square;

          int result2 = squareRef.apply(10);
          System.out.println("Square of 10 using method reference: " + result2); // Output: Square of 10 using method reference: 100
      }
  }
