package java8.streams;

import java.util.List;

public class EmployeeData {

    public static List<Employee> getEmployees() {

        return List.of(
                new Employee(101, "Aman", 10000.00, Department.HR),
                new Employee(102, "Bhavesh", 20000.00, Department.IT),
                new Employee(103, "Charan", 15000.00, Department.SALES),
                new Employee(104, "Deepak", 30000.00, Department.MARKETING),
                new Employee(105, "Esha", 25000.00, Department.DEVELOPER),
                new Employee(106, "Farhan", 18000.00, Department.QA),
                new Employee(107, "Gaurav", 40000.00, Department.IT),
                new Employee(108, "Harsh", 52000.00, Department.HR),
                new Employee(109, "Ishita", 28000.00, Department.DEVELOPER),
                new Employee(110, "Jyoti", 22000.00, Department.MARKETING)
        );
    }

}
