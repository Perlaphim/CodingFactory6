package gr.aueb.cf.ch2.xmpls;

public class Output2App {
    public static void main(String[] args) {
        int price = 100;
        int quantity = 500;
        int totalPrice = 0;

        totalPrice = price + quantity;

        System.out.printf("Quantity: %3d, Price: %d, Total Price: %d\n", price, quantity, totalPrice);
    }
}
