
 Lamda expresiion use to implements finctional inteface (with 1 asbtarct method)
    
Functional interface exited before but java 8 comes with annotation @functional and 
   Default methods in Java 8 interfaces let you define method implementations directly within the interface. This offers:

   1. Backward compatibility: Existing classes using the interface automatically inherit the default behavior without needing updates when new methods are added.
   2. Reduced code: No need for implementing classes to write boilerplate code for the default behavior.
   3. Flexibility: Classes can override the default implementation if they require specific behavior.
4.Static method: We define the multiply method using the static keyword. This method does not require an object of the class to be called and can be accessed directly using the interface name followed by the dot operator (Calculator.multiply).

    interface MyInterface {
        void doSomething();
    }

    public class AnonymousInnerClassExample {
        public static void main(String[] args) {
            MyInterface myInterface = new MyInterface() {
                @Override
                public void doSomething() {
                    System.out.println("Doing something!");
                }
            };

            myInterface.doSomething();
        }
    }

    //how we use inteface before
    interface MyInterface {
        void doSomething();
    }
    1)annonmous
    public class AnonymousInnerClassExample {
        public static void main(String[] args) {
            MyInterface myInterface = new MyInterface() {
                @Override
                public void doSomething() {
                    System.out.println("Doing something!");
                }
            };

            myInterface.doSomething();
        }
    }

    //2)Regular Class Implementing the Interface
    interface MyInterface {
        void doSomething();
    }

    class MyInterfaceImpl implements MyInterface {
        @Override
        public void doSomething() {
            System.out.println("Doing something!");
        }
    }

    public class RegularClassExample {
        public static void main(String[] args) {
            MyInterface myInterface = new MyInterfaceImpl();
            myInterface.doSomething();
        }
    }