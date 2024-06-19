import java.util.Stack;

public class StackExample {
  public static void main(String[] args) {
    // Initialization
    Stack<String> stack = new Stack<>();
    
    // Insertion
    stack.push("first");
    stack.push("second");
    
    // Deletion
    stack.pop();
    
    // Other methods
    stack.size();
    stack.peek();
    stack.search("first");
  }
}
