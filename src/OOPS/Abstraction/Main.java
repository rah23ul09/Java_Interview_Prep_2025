package OOPS.Abstraction;

public class Main {
    public static void main(String[] args) {
        Payment p1 = new CardPayment();
        p1.pay(1550);
        p1.receipt();

        Payment p2 = new UPIPayment();
        p2.pay(1555);
        p2.receipt();
    }
}
