package OOPS.SuperKeyword;

public class SavingAccount extends BankAccount {
    double interestRate;

    SavingAccount(String owner, double balance, double interestRate) {
        super(owner, balance);
        this.interestRate = interestRate;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Interest rate is " + interestRate + "%");
    }
}
