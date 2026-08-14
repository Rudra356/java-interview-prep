package oops.basics;

import java.util.List;
import java.util.Optional;

public class StudentPractice {
    public static void main(String[] args) {
        List<Student> students = Student.getStudents();
        students.stream().map(Student::getName).forEach(System.out::println);
        students.stream().map(Student::getId).forEach(System.out::println);
        students.stream().map(s -> s.getName() + " - " + s.getAge())
                .forEach(System.out::println);
        System.out.println(
                students.size()
        );
        students.stream().filter(s -> s.getAge() > 21)
                .forEach(System.out::println);
        long count = students.stream().filter(s -> s.getAge() >= 21).count();
        System.out.println(count);
        Optional<Student> any = students.stream().filter(s -> s.getId() == 105).findAny();
        any.ifPresentOrElse(System.out::println, () -> System.out.println("No student found"));
        boolean anyMatch = students.stream().anyMatch(s -> s.getName().equals("Priya"));
        students.stream().filter(Student::isAdult).forEach(System.out::println);

        Student s1 = new Student(210,"Raj",60);
        s1.setAge(30);
        s1.setName("Rudra");
        System.out.println(s1);
        s1.birthday();
        s1.isEligibleForAdmission();
    }
}
