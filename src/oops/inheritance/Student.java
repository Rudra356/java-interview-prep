package oops.inheritance;

public class Student extends Person {

    private String course;
    private double marks;

    public Student(int id, String name, int age, String course, double marks) {
        super(id, name, age);
        this.course = course;
        this.marks = marks;
    }

    public String getCourse() {
        return course;
    }

    public double getMarks() {
        return marks;
    }

    public boolean isPassed() {
        return marks >= 40;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I am " + getName() +
                ". I am studying " + getCourse() + " and scored " + getMarks() + " marks.");
    }
}
