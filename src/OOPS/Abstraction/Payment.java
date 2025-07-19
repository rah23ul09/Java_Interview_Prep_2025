package OOPS.Abstraction;

abstract class Payment {
    abstract void pay(double amount);

    void receipt() {
        System.out.println("Transaction complete. Receipt generated.");
    }
}
