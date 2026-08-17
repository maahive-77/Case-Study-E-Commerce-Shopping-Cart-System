class Product {

    String name;
    Double price;

    Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(name + " - ₹" + price);
    }
}

public class Main {

    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 50000.0);
        Product p2 = new Product("Mouse", 1000.0);

        Double total = p1.price + p2.price;

        System.out.println("Product 1: " + p1.price);
        System.out.println("Product 2: " + p2.price);
        System.out.println("Total Price: ₹" + total);
    }
}