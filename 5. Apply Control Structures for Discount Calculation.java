public class Main {

    public static void main(String[] args) {

        double price = 50000;
        double discount;

        if (price >= 50000) {
            discount = 20;
        }
        else if (price >= 20000) {
            discount = 10;
        }
        else {
            discount = 5;
        }

        double discountAmount = price * discount / 100;
        double finalPrice = price - discountAmount;

        System.out.println("Original Price: ₹" + price);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Discount Amount: ₹" + discountAmount);
        System.out.println("Final Price: ₹" + finalPrice);
    }
}