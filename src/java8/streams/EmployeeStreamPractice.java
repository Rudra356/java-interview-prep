package java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeStreamPractice {

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Aman", 10000.00, Department.HR);
        Employee e2 = new Employee(102, "Bhavesh", 20000.00, Department.IT);
        Employee e3 = new Employee(103, "Charan", 15000.00, Department.SALES);
        Employee e4 = new Employee(104, "Deepak", 30000.00, Department.MARKETING);
        Employee e5 = new Employee(105, "Esha", 25000.00, Department.DEVELOPER);
        Employee e6 = new Employee(106, "Farhan", 18000.00, Department.QA);
        Employee e7 = new Employee(107, "Gaurav", 40000.00, Department.IT);
        Employee e8 = new Employee(108, "Harsh", 52000.00, Department.HR);
        Employee e9 = new Employee(109, "Ishita", 28000.00, Department.DEVELOPER);
        Employee e10 = new Employee(110, "Jyoti", 22000.00, Department.MARKETING);

        List<Employee> emp = new ArrayList<>();
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);
        emp.add(e5);
        emp.add(e6);
        emp.add(e7);
        emp.add(e8);
        emp.add(e9);
        emp.add(e10);

//        emp.forEach(System.out::println);
//        emp.stream().forEach(System.out::println);

        List<Employee> salary = emp.stream().filter(x -> x.getSalary() > 50000).toList();
        List<Employee> dept = emp.stream().filter(x -> x.getDept().equals(Department.IT)).toList();
        List<Employee> startsWithR = emp.stream().filter(e -> e.getName().startsWith("R")).toList();
        long count = emp.stream().filter(e -> e.getDept().equals(Department.QA)).distinct().count();
        List<Employee> ascSalary = emp.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).toList();
        List<Employee> descSalary = emp.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).toList();
        List<Employee> ascName = emp.stream().sorted(Comparator.comparing(Employee::getName)).toList();
        List<Employee> descName = emp.stream().sorted(Comparator.comparing(Employee::getName).reversed()).toList();
        List<Employee> ascDept = emp.stream().sorted(Comparator.comparing(Employee::getDept)).toList();

//        System.out.println(ascName);

    }

}
