try{
  
  take input a,b; divide it
    
}
  
catch( arithmetic expecption){ 
  
  //if b=0
}
catch(ioexceptio){ //error realted to input
  
}///////////////////

1) Checked Exception
The classes that directly inherit the Throwable class except RuntimeException and Error are known as checked exceptions. For example, IOException, SQLException, etc. Checked exceptions are checked at compile-time.

2) Unchecked Exception
The classes that inherit the RuntimeException are known as unchecked exceptions. For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc. Unchecked exceptions are not checked at compile-time, but they are checked at runtime.

3) Error
Error is irrecoverable. Some example of errors are OutOfMemoryError, VirtualMachineError, AssertionError etc.
  
///////////////////
  
You can catch different types of exceptions in Java, including but not limited to:
The Exception class is a general exception type in Java that acts as a superclass for all other exception types. It is used to catch any exception that may be thrown by the code in a try block.

For example:

  try {
   int result = 10 / 0;  // this line will throw an ArithmeticException
} catch (Exception e) {
   System.out.println("An exception occurred: " + e.getMessage());
}
//////////////////
throw
  