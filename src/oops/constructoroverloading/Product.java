package oops.constructoroverloading;

public class Product {

    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product() {
        this(0, "Unknown", 0.0, 0);
    }

    public Product(String name) {
        this(0, name, 0.0, 0);

    }

    public Product(String name, double price) {
        this(0, name, price, 0);

    }

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

}
