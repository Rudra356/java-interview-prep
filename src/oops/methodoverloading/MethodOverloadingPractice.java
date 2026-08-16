package oops.methodoverloading;

public class MethodOverloadingPractice {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(1, 2);
        calculator.add(1, 2, 3);
        calculator.add(2.0, 400.100);
        calculator.add(new int[]{1, 5, 9, 4, 5, 6, 1, 4, 2});
    }
}
