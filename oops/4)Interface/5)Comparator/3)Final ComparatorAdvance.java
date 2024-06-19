package com.SpringBootPractice.SpringBootPractice.PdfModule.JavaPractice.Java8.FunctionaInterfaces;

import java.util.ArrayList;
        import java.util.Comparator;
        import java.util.List;

public class ComparatorAdvance {
    public static void main(String[] args) {
        // Sample list of Person objects
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", 25));
        persons.add(new Person("Bob", 30));
        persons.add(new Person("Charlie", 20));
        persons.add(new Person("David", 25));

      Comparator<Person> customComparator = Comparator.comparingInt(
        person -> (int) person.getName().chars().filter(ch -> ch == 'a').count());

      
        // Custom comparator to sort persons by age and then by name in reverse alphabetical order
        Comparator<Person> customComparator = Comparator
                .comparingInt(Person::getAge) // First, compare by age
                .thenComparing(Person::getName, Comparator.reverseOrder()); // Then, compare by name in reverse alphabetical order

        // Sort the list of persons using the custom comparator
        persons.sort(customComparator);

        // Print the sorted list of persons
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    // Person class
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
