import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student> {
  String name;
  int id;

  public Student(String name, int id) {
    this.name = name;
    this.id = id;
  }

  public String toString() {
    return "Student(name=" + name + ", id=" + id + ")"; // More informative format
  }

  @Override
  public int compareTo(Student other) {
    return this.name.compareTo(other.name); // Natural sorting by name (ascending)
  }

  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    students.add(new Student("gog", 1));
    students.add(new Student("aam", 2));
    students.add(new Student("bham", 3));
    students.add(new Student("cum", 4));

    Collections.sort(students); // Utilizes the natural sorting defined in compareTo

    System.out.println("Natural Sorting (by name): " + students);
  }
}
