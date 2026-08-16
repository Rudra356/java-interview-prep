package oops.interfaces;

public class Employee implements Payable {

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public double calculatePayment() {
        return getSalary();
    }

    private int id;
    private String name;
    private double salary;
}
