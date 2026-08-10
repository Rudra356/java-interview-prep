package java8.streams;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsPractice {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();
        List<String> names = employees.stream().map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println(names);

        Set<Department> dept = employees.stream().map(Employee::getDept)
                .collect(Collectors.toSet());

        System.out.println(dept);

        String joinedNames = employees.stream().map(Employee::getName)
                .collect(Collectors.joining(",", "<< ", " >>"));

        System.out.println(joinedNames);

        Map<Department, List<Employee>> groupedDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept));

        System.out.println(groupedDept);

        Map<Department, Long> countByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));

        System.out.println(countByDept);

        Map<Department, Double> totalSalaryByDept =
                employees.stream()
                        .collect(Collectors.groupingBy(Employee::getDept,
                                Collectors.summingDouble(Employee::getSalary)));

        System.out.println(totalSalaryByDept);

        Map<Department, Double> avgSalaryByDept =
                employees.stream()
                        .collect(Collectors.groupingBy(Employee::getDept,
                                Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(avgSalaryByDept);

        Map<Department, List<String>> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept,
                        Collectors.mapping(Employee::getName, Collectors.toList())));

        System.out.println(collect);

        Map<Boolean, List<Employee>> isHighlyPaid = employees.stream()
                .collect(Collectors.partitioningBy(e -> e.getSalary() > 30000));


        System.out.println(isHighlyPaid);

        Map<Department, Optional<Employee>> maxSalByDept =
                employees.stream()
                        .collect(Collectors.groupingBy(Employee::getDept,
                                Collectors.maxBy(Comparator
                                        .comparingDouble(Employee::getSalary))));
        System.out.println(maxSalByDept);

    }

}
