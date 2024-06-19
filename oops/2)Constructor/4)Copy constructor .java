Copy Constructor is the constructor used when we want to initialize the value to the new object from the old object of the same class. 

class InterviewBit{
   String department;
   String service;
   InterviewBit(InterviewBit ib){
       this.departments = ib.departments;
       this.services = ib.services;
   }
}
Here we are initializing the new object value from the old object value in the constructor. Although, this can also be achieved with the help of object cloning.

