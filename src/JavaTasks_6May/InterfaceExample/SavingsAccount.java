package JavaTasks_6May.InterfaceExample;

public class SavingsAccount implements BankAccount{
    private double balance;

    public SavingsAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Rs." + amount + " into Savings Account.");
        } else {
            System.out.println("Unable to deposit specified amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn Rs." + amount + " from Savings Account.");
        } else {
            System.out.println("Insufficient balance..");
        }
    }

    public double getBalance() {
        return balance;
    }

}
