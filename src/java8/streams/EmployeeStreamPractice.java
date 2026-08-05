package java8.streams;

import java.util.Comparator;
import java.util.List;

public class EmployeeStreamPractice {

    public static void main(String[] args) {

        List<Employee> emp = EmployeeData.getEmployees();

        emp.forEach(System.out::println);
        emp.stream().forEach(System.out::println);

        List<Employee> salary = emp.stream().filter(x -> x.getSalary() > 50000).toList();
        List<Employee> dept = emp.stream().filter(x -> x.getDept().equals(Department.IT)).toList();
        List<Employee> startsWithR = emp.stream().filter(e -> e.getName().startsWith("R")).toList();
        long count = emp.stream().filter(e -> e.getDept().equals(Department.QA)).distinct().count();
        List<Employee> ascSalary = emp.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).toList();
        List<Employee> descSalary = emp.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).toList();
        List<Employee> ascName = emp.stream().sorted(Comparator.comparing(Employee::getName)).toList();
        List<Employee> descName = emp.stream().sorted(Comparator.comparing(Employee::getName).reversed()).toList();
        List<Employee> ascDept = emp.stream().sorted(Comparator.comparing(Employee::getDept)).toList();

        System.out.println(ascName);

    }

}
