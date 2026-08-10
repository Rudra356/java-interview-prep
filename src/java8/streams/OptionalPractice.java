package java8.streams;

import java.util.List;
import java.util.Optional;

public class OptionalPractice {
    public static void main(String[] args) {
        List<Employee> emp = EmployeeData.getEmployees();
        Optional<Employee> first = emp.stream().filter(e -> e.getSalary() > 30000).findFirst();
        first.ifPresent(System.out::println);

        Employee e1 = emp.stream().filter(e -> e.getSalary() > 100000)
                .findFirst().orElse(new Employee(0, "Not Found", 0, Department.HR));
        System.out.println(e1);

        Employee e2 = emp.stream().filter(e -> e.getName().startsWith("Z"))
                .findAny().orElseGet(() -> new Employee(0, "Not Found", 0, Department.HR));
        System.out.println(e2);

//        Employee e3 = emp.stream().filter(e -> e.getName().startsWith("Z"))
//                .findAny().orElseThrow(() -> new RuntimeException("USER NOT FOUND"));
//        System.out.println(e3);

        Optional<Employee> e4 = emp.stream().filter(e -> e.getId() == 108).findAny();
        Optional<String> str = e4.map(Employee::getName);
        str.ifPresent(System.out::println);

        Optional<Employee> e5 = emp.stream().filter(e -> e.getId() == 108)
                .findAny();

        e5.filter(e -> e.getSalary() > 50000).ifPresent(System.out::println);

        String s1 = emp.stream().filter(e -> e.getId() == 108)
                .findAny().map(Employee::getName).orElse("UNKNOWN EMPLOYEE");
        System.out.println(s1);
    }
}
