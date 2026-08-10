package java8.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToMapPractice {

    public static void main(String[] args) {

        List<Employee> emp = EmployeeData.getEmployees();
        Map<Integer, String> idName = emp.stream()
                .collect(Collectors.toMap(Employee::getId, Employee::getName));
        System.out.println(idName);

        Map<Integer, Double> idSalary = emp.stream()
                .collect(Collectors.toMap(Employee::getId, Employee::getSalary));
        System.out.println(idSalary);

        Map<Integer, String> idNameDept = emp.stream()
                .collect(Collectors.toMap(Employee::getId,
                        e -> e.getName() + " - " + e.getDept()));

        System.out.println(idNameDept);

        Map<Department, String> deptWithName = emp.stream()
                .collect(Collectors.toMap(Employee::getDept, Employee::getName,
                        (a, b) -> b));
        System.out.println(deptWithName);
    }

}
