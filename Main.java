import java.util.ArrayList;

// Parent Class
class Product {

    int id;
    String name;
    Double price;

    // Constructor 1
    Product() {
        id = 0;
        name = "Unknown";
        price = 0.0;
    }

    // Constructor 2
    Product(int id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(id + " - " + name + " - ₹" + price);
    }
}

// Inheritance
class Electronics extends Product {

    String brand;

    Electronics(int id, String name, Double price, String brand) {
        super(id, name, price);
        this.brand = brand;
    }

    void display() {
        System.out.println(
            id + " - " + name +
            " - ₹" + price +
            " - Brand: " + brand
        );
    }
}

class Clothing extends Product {

    String size;

    Clothing(int id, String name, Double price, String size) {
        super(id, name, price);
        this.size = size;
    }

    void display() {
        System.out.println(
            id + " - " + name +
            " - ₹" + price +
            " - Size: " + size
        );
    }
}

// Cart Class
class Cart {

    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
    }

    double calculateTotal() {

        double total = 0;

        for (Product p : products) {
            total += p.price;
        }

        return total;
    }

    void displayCart() {

        System.out.println("\n--- Shopping Cart ---");

        for (Product p : products) {
            p.display();
        }

        double total = calculateTotal();

        System.out.println("Total: ₹" + total);

        // Discount using control structure
        double discount;

        if (total >= 50000) {
            discount = 20;
        }
        else if (total >= 20000) {
            discount = 10;
        }
        else {
            discount = 5;
        }

        double discountAmount = total * discount / 100;
        double finalPrice = total - discountAmount;

        System.out.println("Discount: " + discount + "%");
        System.out.println("Discount Amount: ₹" + discountAmount);
        System.out.println("Final Price: ₹" + finalPrice);
    }
}

// User Class
class User {

    int id;
    String name;
    Cart cart;

    User(int id, String name) {
        this.id = id;
        this.name = name;
        cart = new Cart();
    }

    void displayUser() {
        System.out.println("User ID: " + id);
        System.out.println("User Name: " + name);
    }
}

// Main Class
public class Main {

    public static void main(String[] args) {

        // User
        User user = new User(101, "Maahi");

        // Products
        Electronics laptop =
            new Electronics(1, "Laptop", 50000.0, "HP");

        Clothing shirt =
            new Clothing(2, "T-Shirt", 1000.0, "L");

        Product mouse =
            new Product(3, "Mouse", 1000.0);

        // Display User
        user.displayUser();

        // Add products
        user.cart.addProduct(laptop);
        user.cart.addProduct(shirt);
        user.cart.addProduct(mouse);

        // Display Cart
        user.cart.displayCart();

        // Searching
        int searchId = 2;

        System.out.println("\n--- Searching Product ---");

        boolean found = false;

        for (Product p : user.cart.products) {

            if (p.id == searchId) {

                System.out.println("Product Found:");
                p.display();

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product Not Found.");
        }
    }
}