import java.util.*;

class Student {
    String name;
    int salary ;
    int n;
    Student(String name, int salary, int id){
        this.name = name;
        this.salary= salary;
        this.n  =id;
    }
    public String toString() {
        return "Employee{name='" + name + "', id=" + salary + "}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
public class kachra {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("aam",100,1));
        list.add(new Student("Krushna",40,2));
        list.add(new Student("shaym",500,3));
        list.add(new Student("gobu",1000,4));
        list.add(new Student("sai",10,5));
        Comparator<Student> sor = (Student s1, Student s2 )->{
            return s1.getSalary() - s2.getSalary();
        };
        Collections.sort(list,sor);
        System.out.println(list.toString() +" ");

    }
}
