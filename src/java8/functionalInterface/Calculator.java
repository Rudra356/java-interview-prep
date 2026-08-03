package java8.functionalInterface;

import java.util.Date;

@FunctionalInterface
public interface Calculator {

    void operation(int a, int b);

    static void getDate() {
        System.out.println(new Date().toInstant());
    }

    default void welcome(String name) {
        System.out.println("Welcome user.");
    }

}
