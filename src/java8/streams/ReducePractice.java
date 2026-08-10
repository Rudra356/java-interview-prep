package java8.streams;

import java.util.List;

public class ReducePractice {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);

        Integer reduce = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduce.intValue());

        Double r1 = employees.stream().map(Employee::getSalary).reduce(0.0, Double::sum);
        System.out.println(r1);

        numbers.stream().reduce(Integer::max).ifPresent(System.out::println);

        numbers.stream().reduce(Integer::min).ifPresent(System.out::println);

        employees.stream().map(Employee::getSalary).reduce(Double::max)
                .ifPresent(System.out::println);

        employees.stream().map(Employee::getSalary).reduce(Double::min)
                .ifPresent(System.out::println);

        employees.stream().filter(e -> e.getDept() == Department.IT)
                .map(Employee::getSalary).reduce(Double::sum)
                .ifPresent(System.out::println);

        numbers.stream().reduce((a, b) -> a * b).ifPresent(System.out::println);

        employees.stream().map(Employee::getName)
                .reduce((a, b) -> a.length() > b.length() ? a : b).ifPresent(System.out::println);

        employees.stream().map(Employee::getId).reduce(Integer::max)
                .ifPresent(System.out::println);
    }
}