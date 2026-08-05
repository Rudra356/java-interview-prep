package java8.streams;

import java.util.Comparator;
import java.util.List;

public class StreamMapDemo {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().forEach(e -> System.out.println(e.getName()));

        employees.stream().map(Employee::getSalary).forEach(System.out::println);

        employees.stream().map(Employee::getDept).forEach(System.out::println);

        employees.stream().map(e -> e.getName().toUpperCase()).forEach(System.out::println);

        employees.stream().map(e -> e.getName().toLowerCase()).forEach(System.out::println);

        List<String> names = employees.stream().sorted(Comparator.comparing(Employee::getName))
                .map(Employee::getName).toList();

        List<Double> salary = employees.stream().sorted(Comparator.comparing(Employee::getSalary))
                .map(Employee::getSalary).toList();

        employees.stream().map(e -> e.getSalary() * 1.1).forEach(System.out::println);

        List<String> idWithName = employees.stream().sorted(Comparator.comparingInt(Employee::getId))
                .map(e -> e.getId() + " - " + e.getName()).toList();

        System.out.println(idWithName);

        List<String> nameWithDept = employees.stream().sorted(Comparator.comparingInt(Employee::getId))
                .map(e -> e.getName() + " ( " + e.getDept() + " ) ").toList();

        System.out.println(nameWithDept);

    }

}
