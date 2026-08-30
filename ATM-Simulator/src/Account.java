public class Account {
    private String name;
    private int pin;
    private double balance;

    public Account(String name, int pin, double balance) {
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }

    public boolean validatePin(int enteredPin) {
        return enteredPin == pin;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful!");
        } else {
            System.out.println("Invalid Amount");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance!");

        } else {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: ₹" + balance);
    }
}


