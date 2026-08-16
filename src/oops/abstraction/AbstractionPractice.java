package oops.abstraction;

public class AbstractionPractice {
    public static void main(String[] args) {
        Person[] people = {
                new Student(101, "Raj", 21, "Automobile"),
                new Teacher(102, "Mike", 21, "Ai Engineering")
        };
        for(Person person : people) {
            person.displayDetails();
            person.introduce();
        }

    }
}
