
The `Comparator` interface in Java has the following methods:

Abstract method:

 `int compare(T o1, T o2)`: This method compares two objects of type `T` and returns an integer value based on the comparison. 

Default methods (introduced in Java 8):

 `static <T> Comparator<T> naturalOrder()`: Returns a comparator that imposes the "natural ordering" on a type.
 `Comparator<T> thenComparing(Comparator<? super T> other)`: Allows chaining multiple comparators.
 `Comparator<T> thenComparingInt(ToIntFunction<? super T> keyExtractor)`: Similar to `thenComparing` but for primitive `int` values.
 `Comparator<T> reversed()`: Returns a comparator that reverses the order of this comparator.



public static void main(String[] args) {



        List<Student> list = new ArrayList<>();
        list.add(new Student("aam",100,1));
        list.add(new Student("Krushna",40,2));
        list.add(new Student("shaym",500,3));
        list.add(new Student("gobu",1000,4));
        list.add(new Student("sai",10,5));
        System.out.println(list +" ");

        //Sort by salary
        Comparator<Student> a = (Student s1,Student s2) -> {
            return s1.getSalary() - s2.getSalary();
        };
      //  Collections.sort(list,a);

        System.out.println(list +" ");
        System.out.println(" after new salary fun");
Comparator<Student> sal = Comparator.comparingInt(Student::getSalary);

        Collections.sort(list,sal);
        System.out.println(list +" ");
        //Sort By Id
        Comparator<Student> idComparator = Comparator.comparingInt(Student::getId);
        Collections.sort(list, idComparator);

        //Sorting by Name (Ascending):
        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);

       // Sorting by Salary (Descending):
        Comparator<Student> salaryComparator = Comparator.comparingInt(Student::getSalary).reversed();

     //   Multi-Level Sorting (Salary then Name):
        Comparator<Student> salaryThenNameComparator = Comparator.comparingInt(Student::getSalary).thenComparing(Student::getName);

        //   Multi-Level Sorting (Salary then Name) using compare
        Comparator<Student> salaryThenNameComparator2 = (student1, student2) -> {
            // Primary comparison based on salary
            int salaryComparison = Integer.compare(student1.getSalary(), student2.getSalary());

            // If salaries are equal, compare by name
            if (salaryComparison == 0) {
                return student1.getName().compareTo(student2.getName());
            } else {
                return salaryComparison;
            }
        };



        //  Sorting by Custom Criteria (Age if Available):
        Comparator<Student> customComparator = (student1, student2) -> {
            if (student1.getId() != 0 && student2.getId() != 0) {
                return student1.getId() - student2.getId();
            } else {
                return student1.getId() - student2.getId();
            }


        };

    }
}

