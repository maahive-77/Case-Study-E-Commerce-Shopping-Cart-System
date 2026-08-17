class Product {

    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class Main {

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", 50000),
            new Product(102, "Mobile", 25000),
            new Product(103, "Mouse", 1000),
            new Product(104, "Keyboard", 2000)
        };

        int searchId = 103;

        boolean found = false;

        for (Product p : products) {

            if (p.id == searchId) {

                System.out.println("Product Found!");
                System.out.println("ID: " + p.id);
                System.out.println("Name: " + p.name);
                System.out.println("Price: ₹" + p.price);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product Not Found.");
        }
    }
}