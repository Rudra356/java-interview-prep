package oops.constructoroverloading;

public class ConstructorPractice {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Mouse");
        Product p3 = new Product("Keyboard", 1500);
        Product p4 = new Product(101, "Laptop", 50000, 2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
