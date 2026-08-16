package oops.abstraction;

public class Student extends Person {

    public Student(int id, String name, int age, String course) {
        super(id, name, age);
        this.course = course;
    }

    private String course;

    public String getCourse() {
        return course;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I am " + getName() + " and I study " + getCourse() + ".");
    }
}
