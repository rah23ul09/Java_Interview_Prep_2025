package OOPS.SuperKeyword;

public class BankAccount {
    String owner;
    double balance;

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void showDetails() {
        System.out.println("Owner is : " +owner);
        System.out.println("Balance is : $" +balance);
    }
}
