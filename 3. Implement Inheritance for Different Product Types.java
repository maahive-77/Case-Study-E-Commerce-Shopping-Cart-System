class Product {

    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(name + " - ₹" + price);
    }
}

class Electronics extends Product {

    String brand;

    Electronics(int id, String name, double price, String brand) {
        super(id, name, price);
        this.brand = brand;
    }

    void display() {
        System.out.println("Electronics: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Price: ₹" + price);
    }
}

class Clothing extends Product {

    String size;

    Clothing(int id, String name, double price, String size) {
        super(id, name, price);
        this.size = size;
    }

    void display() {
        System.out.println("Clothing: " + name);
        System.out.println("Size: " + size);
        System.out.println("Price: ₹" + price);
    }
}

class Book extends Product {

    String author;

    Book(int id, String name, double price, String author) {
        super(id, name, price);
        this.author = author;
    }

    void display() {
        System.out.println("Book: " + name);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
    }
}

public class Main {
    public static void main(String[] args) {

        Electronics e = new Electronics(
            1, "Laptop", 50000, "HP"
        );

        Clothing c = new Clothing(
            2, "T-Shirt", 999, "L"
        );

        Book b = new Book(
            3, "Java Programming", 599, "James Gosling"
        );

        e.display();
        System.out.println();

        c.display();
        System.out.println();

        b.display();
    }
}