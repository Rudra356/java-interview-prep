package oops.basics;

import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student> {
    /**
     * @param student
     * @return
     */
    @Override
    public int compareTo(Student student) {
        return this.getName().compareTo(student.getName());
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public static List<Student> getStudents() {
        return List.of(
                new Student(101, "Amit", 20),
                new Student(102, "Rahul", 22),
                new Student(103, "Priya", 19),
                new Student(104, "Sneha", 24),
                new Student(105, "Arjun", 21),
                new Student(106, "Riya", 23),
                new Student(107, "Sourav", 20),
                new Student(108, "Ananya", 25),
                new Student(109, "Vikram", 16),
                new Student(110, "Neha", 22),
                new Student(111, "Rohan", 21),
                new Student(112, "Pooja", 24)
        );
    }

    private int id;
    private String name;
    private int age;

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void birthday() {
        this.setAge(this.getAge() + 1);
    }

    public void isEligibleForAdmission() {
        if (this.getAge() >= 18) {
            System.out.println("True");
            return;
        }
        System.out.println("False");
    }

    public void introduce() {
        System.out.println("Hi, I am " + this.getName() + ". My ID is " + this.getId() + " and I am " + this.getAge() + " years old.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
