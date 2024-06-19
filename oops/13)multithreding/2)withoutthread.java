class MyTask1 {
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Task 1: " + i);
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

class MyTask2 {
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Task 2: " + i);
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

class MyTask3 {
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Task 3: " + i);
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

public class SingleThreadExample {
  public static void main(String[] args) {
    MyTask1 t1 = new MyTask1();
    MyTask2 t2 = new MyTask2();
    MyTask3 t3 = new MyTask3();

    t1.run();
    t2.run();
    t3.run();
  }
}
