class Product {

    int id;
    String name;
    double price;

    // Constructor 1
    Product() {
        id = 0;
        name = "Unknown";
        price = 0;
    }

    // Constructor 2
    Product(int id, String name) {
        this.id = id;
        this.name = name;
        this.price = 0;
    }

    // Constructor 3
    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(id + " " + name + " ₹" + price);
    }
}

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product(101, "Laptop");
        Product p3 = new Product(102, "Mobile", 25000);

        p1.display();
        p2.display();
        p3.display();
    }
}