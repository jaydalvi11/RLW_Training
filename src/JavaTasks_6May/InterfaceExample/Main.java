package JavaTasks_6May.InterfaceExample;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000);

        savingsAccount.deposit(10000);
        savingsAccount.withdraw(3597);
        System.out.println("Savings Account Balance: Rs." + savingsAccount.getBalance());

        CurrentAccount currentAccount = new CurrentAccount(2000);

        currentAccount.deposit(9500);
        currentAccount.withdraw(2469);
        System.out.println("Current Account Balance: Rs." + currentAccount.getBalance());
    }
}
