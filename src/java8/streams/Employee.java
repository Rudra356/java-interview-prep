package java8.streams;

public class Employee {
    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + ", dept=" + dept + '}';
    }

    public Employee(int id, String name, double salary, Department dept) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    private int id;
    private String name;
    private double salary;
    private Department dept;
}
