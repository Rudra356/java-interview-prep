package collections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSortCollectionsDemo {

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Rudra", 10000);
        Employee e2 = new Employee(102, "Raj", 20000);
        Employee e3 = new Employee(103, "A", 30000);
        Employee e4 = new Employee(104, "B", 25000);
        Employee e5 = new Employee(105, "C", 55000);

        List<Employee> emp = new ArrayList<>();
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);
        emp.add(e5);

        Collections.sort(emp, Comparator.comparingInt(Employee::getId));
        emp.sort(Comparator.comparingInt(Employee::getSalary).reversed());
        Collections.sort(emp, Comparator.comparing(Employee::getName));
        System.out.println();
        emp.forEach(System.out::println);
        Employee max = Collections.max(emp, Comparator.comparing(Employee::getSalary));
        System.out.println(max);
    }

}
