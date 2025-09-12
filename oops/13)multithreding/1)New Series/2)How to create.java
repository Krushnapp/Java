https://www.youtube.com/watch?v=t0QLhP7VakE&list=PLBBK9G6O8MPDEeSVG17Pwya2xlUNbZn30&index=5&ab_channel=CodeWithEase-ByVarsha

public class threadtest implements Runnable{

    public void run(){
System.out.println("ruuning" + Thread.currentThread().getName());
    }


    public static void main(String[] args){
      threadtest customthread = new threadtest();
        Thread t1 =new Thread(customthread);
        t1.start();

           Thread t2 =new Thread(customthread);
        t2.start();

    }
}





public class threadtest extends Thread{

    public void run(){
System.out.println("ruuning"+ Thread.currentThread().getName());
    }


    public static void main(String[] args){
      threadtest t1 = new threadtest();
        t1.start();


         threadtest t2 = new threadtest();
        t2.start();

    }
}

In Java, there are two main ways to create threads:

1. Extending the `Thread` class: You create a subclass of `Thread` and override its `run()` method. This method defines the code that the thread will execute.

2. Implementing the `Runnable` interface: You create a class that implements the `Runnable` interface. This interface defines a single method, `run()`, which contains the threads code. Then, you create an instance of this class and pass it to a `Thread` objects constructor.

Heres a breakdown of which approach is generally preferred and why:

Benefits of `Runnable`:

- Flexibility: You can implement `Runnable` in any class, even if it already extends another class. This allows for greater code reuse and design flexibility.
- Decoupling: By separating the threads behavior from the class itself, `Runnable` promotes better object-oriented design principles.
- Inheritance Encapsulation: `Thread` already provides functionalities like thread scheduling and lifecycle management. Implementing `Runnable` allows you to focus on the specific task the thread needs to perform.

Drawbacks of `Extending Thread`:

- Limited Inheritance: You can only extend one class in Java. If your class already needs to extend another class for its functionality, extending `Thread` becomes restrictive.
- Code Mixing: Extending `Thread` can lead to mixing thread management concerns with the core functionality of the class, making the code less organized.

Recommendation:

In most cases, implementing the `Runnable` interface is the preferred approach for creating threads in Java. It offers better flexibility, cleaner design separation, and avoids inheritance limitations.

Additional Considerations:

- If your thread class doesnt need any additional methods beyond `run()`, it might be a good candidate for an anonymous inner class implementing `Runnable`.
- For simple use cases where inheritance isnt an issue and you dont need separate lifecycle management, extending `Thread` can be acceptable. However, be aware of the potential drawbacks and consider if `Runnable` would provide a more flexible and maintainable design.

Remember, the best approach depends on your specific needs and the design of your application. Choose the method that promotes code clarity, maintainability, and flexibility.