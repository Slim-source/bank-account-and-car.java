//main classs Bank account
 class BankAccount {
    private double balance;

    // Constructor to initialize the balance
    public BankAccount() {
        this.balance = 0.0;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money from the account, ensuring it does not exceed the available balance
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else if (amount > balance) {
            System.out.println("Withdrawal amount exceeds available balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Getter method to check the current balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // Creating an instance of BankAccount
        BankAccount account = new BankAccount();

        // Demonstrating encapsulation
        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        // Attempting to withdraw more than the available balance
        account.withdraw(400.0);
        System.out.println("Balance after attempting to overdraw: " + account.getBalance());
    }
}
