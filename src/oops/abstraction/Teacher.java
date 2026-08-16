package oops.abstraction;

public class Teacher extends Person {
    public Teacher(int id, String name, int age, String subject) {
        super(id, name, age);
        this.subject = subject;
    }

    private String subject;

    public String getSubject() {
        return (this.subject);
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I am " + getName() + " and I teach " + getSubject() + ".");
    }
}
