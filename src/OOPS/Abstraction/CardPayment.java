package OOPS.Abstraction;

public class CardPayment extends Payment{
    @Override
    void pay(double amount) {
        System.out.println("Paid $" +amount+ " using credit card.");
    }
}
