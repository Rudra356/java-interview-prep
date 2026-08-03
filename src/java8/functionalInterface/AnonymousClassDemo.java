package java8.functionalInterface;

public class AnonymousClassDemo {

    public static void main(String[] args) {

        Calculator addition = new Calculator() {
            @Override
            public void operation(int a, int b) {
                System.out.println(a + b);
            }

            @Override
            public void welcome(String name) {
                System.out.println("Welcome " + name);
            }
        };

        Calculator multiplication = (a, b) -> System.out.println(a * b);

        Calculator division = (a, b) -> {
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                throw new RuntimeException("Divided by 0");
            }
        };

        addition.operation(5, 5);
        addition.welcome("Raj");
        division.operation(10, 2);
        Calculator.getDate();

    }

}
