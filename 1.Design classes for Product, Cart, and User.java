import java.util.ArrayList;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void displayProduct() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: ₹" + price);
    }
}

class Cart {
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
        System.out.println(p.name + " added to cart.");
    }

    void displayCart() {
        System.out.println("\n--- Cart ---");

        double total = 0;

        for (Product p : products) {
            System.out.println(p.name + " - ₹" + p.price);
            total += p.price;
        }

        System.out.println("Total: ₹" + total);
    }
}

class User {
    int userId;
    String name;
    Cart cart;

    User(int userId, String name) {
        this.userId = userId;
        this.name = name;
        cart = new Cart();
    }

    void displayUser() {
        System.out.println("User ID: " + userId);
        System.out.println("User Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        User user = new User(101, "Yash");

        Product p1 = new Product(1, "Laptop", 50000);
        Product p2 = new Product(2, "Mouse", 1000);

        user.displayUser();

        user.cart.addProduct(p1);
        user.cart.addProduct(p2);

        user.cart.displayCart();
    }
}