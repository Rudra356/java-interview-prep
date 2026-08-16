package oops.inheritance;

public class Teacher extends Person {
    private String subject;
    private double salary;
    public Teacher(int id, String name, int age, String subject, Double salary){
        super(id,name,age);
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isHighlyPaid(){
        return getSalary()>=50000;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I am " + getName() +
                ". I am teaching " + getSubject() + " and ear " + getSalary() + " inr.");
    }
}
