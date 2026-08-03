package collections.comparator;

import java.util.Comparator;
import java.util.List;

public class EmployeeSortStreamDemo {

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Rudra", 10000);
        Employee e2 = new Employee(102, "Raj", 20000);
        Employee e3 = new Employee(103, "A", 30000);
        Employee e4 = new Employee(104, "B", 25000);
        Employee e5 = new Employee(105, "C", 55000);

        List<Employee> emp = List.of(e1, e2, e3, e4, e5);

        List<Employee> sortedEmployeeById = emp.stream()
                .sorted().toList();

        System.out.println(sortedEmployeeById);

        List<Employee> sortedEmployeeBySalary = emp.stream()
                .sorted(Comparator.comparing(Employee::getSalary)).toList();

        System.out.println(sortedEmployeeBySalary);

        List<Employee> sortedEmployeeByName = emp.stream()
                .sorted(Comparator.comparing(Employee::getName).reversed()).toList();

        System.out.println(sortedEmployeeByName);

    }

}
