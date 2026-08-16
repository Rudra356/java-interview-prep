package oops.methodoverloading;

public class Calculator {
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public void add(double a, double b) {
        System.out.println(a + b);
    }

    public void add(int[] numbers) {
        var sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }
}
