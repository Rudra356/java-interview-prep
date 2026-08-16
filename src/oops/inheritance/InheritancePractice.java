package oops.inheritance;

public class InheritancePractice {
    public static void main(String[] args) {

        Person p1 = new Person(101, "Amit", 45);

        Student s1 = new Student(201, "Rahul", 21, "Java", 85.5);
        Student s2 = new Student(202, "ROhan", 19, "Spring Boot", 35.0);
        Student s3 = new Student(203, "Rehman", 22, "MySQL", 72.0);

        Person p2 = new Student(204, "Rudra", 22, "MySQL", 90.0);
        Person[] persons = {
                new Person(102, "Azim", 55),
                new Student(206, "Firoz", 41, "Graphics Design", 15),
                new Teacher(301, "Zaara", 28, "LLM", 51000.50)
        };

        p1.displayDetails();
        p1.introduce();

        s1.displayDetails();
        s1.introduce();

        System.out.println(s3.isPassed());

        p2.introduce();

        for (Person p : persons) {
            p.introduce();
            if (p instanceof Student) {
                Student student = (Student) p;
                System.out.println("Passed: " + student.isPassed());

            } else if (p instanceof Teacher) {
                Teacher teacher = (Teacher) p;
                System.out.println("Highly paid: " + teacher.isHighlyPaid());

            } else {
                System.out.println("This is a Person");
            }
        }
    }
}
