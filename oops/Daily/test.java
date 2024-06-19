package com.SpringBootPractice.SpringBootPractice.JavaCore.JavaPractice.Java8.Student;

import java.util.Comparator;

public class CombinedScoreComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        int score1 = student1.name.length() + student1.salary;
        int score2 = student2.name.length() + student2.salary;
        return score2 - score1; // Descending order by combined score
    }
}

public class Main {
    public static void main(String[] args) {
        // Same student list creation as before

        Collections.sort(students, new CombinedScoreComparator());

        System.out.println("\nSorted Students (by combined score descending):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}


public class Student {
    String name;
    int salary;
    int id;

    // Getters and setters (same as before)

    @Override
    public String toString() {
        // Same as before
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 50000, 1));
        students.add(new Student("Bob", 70000, 2));
        students.add(new Student("Charlie", 40000, 3));

        System.out.println("Unsorted Students:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort by combined score (descending) using lambda expression
        Collections.sort(students, (student1, student2) -> student2.name.length() + student2.salary - (student1.name.length() + student1.salary));

        System.out.println("\nSorted Students (by combined score descending):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
