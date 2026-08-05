package java8.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamTerminalDemo {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();

        System.out.println(employees.size());

        long count = employees.stream().count();

        long count1 = employees.stream().filter(e -> e.getSalary() > 25000).count();

        Optional<Employee> maxSalary = employees.stream().max(Comparator.comparingDouble(Employee::getSalary));

        Optional<Employee> minSalary = employees.stream().min(Comparator.comparingDouble(Employee::getSalary));

        Optional<Employee> firstIT = employees.stream()
                .filter(e -> e.getDept() == Department.IT).findFirst();

        System.out.println(firstIT.get());

        Optional<Employee> anyHR = employees.stream().filter(e -> e.getDept() == Department.HR).findAny();

        System.out.println(anyHR.get());

        boolean allSalaryAbove5000 = employees.stream().allMatch(e -> e.getSalary() > 5000);

        System.out.println(allSalaryAbove5000);

        boolean anySalaryAbove50000 = employees.stream().anyMatch(e -> e.getSalary() > 50000);

        System.out.println(anySalaryAbove50000);

        boolean noSalaryAbove100000 = employees.stream().noneMatch(e -> e.getSalary() > 100000);

        System.out.println(noSalaryAbove100000);

        Optional<Employee> highestPaidITEmployee = employees.stream()
                .filter(e -> e.getDept() == Department.IT)
                .max(Comparator.comparingDouble(Employee::getSalary));

        System.out.println(highestPaidITEmployee);

        Optional<Employee> minPaidMarketingEmployee = employees.stream()
                .filter(e -> e.getDept() == Department.MARKETING)
                .max(Comparator.comparingDouble(Employee::getSalary).reversed());

        System.out.println(minPaidMarketingEmployee);

        Optional<Employee> highestPaidHREmployee = employees.stream()
                .filter(e -> e.getDept() == Department.HR)
                .max(Comparator.comparingDouble(Employee::getSalary));

        System.out.println(highestPaidHREmployee);

        Optional<Employee> startsWithG = employees.stream()
                .filter(e -> e.getName().startsWith("G")).findFirst();

        System.out.println(startsWithG.get());

        boolean startsWithZ = employees.stream().noneMatch(e -> e.getName().startsWith("Z"));

        System.out.println(startsWithZ);

        long ITCount = employees.stream().filter(e -> e.getDept() == Department.IT).count();

        System.out.println(ITCount);

    }

}
