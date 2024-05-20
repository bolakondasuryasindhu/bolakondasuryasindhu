class BankAccount {
    private String accountType;
    private double balance;

    // Constructor for a general account
    public BankAccount() {
        this.accountType = "General";
        this.balance = 0.0;
    }

    // Constructor for a specified account type
    public BankAccount(String accountType) {
        this.accountType = accountType;
        this.balance = 0.0;
    }

    // Constructor for a specified account type and initial balance
    public BankAccount(String accountType, double initialBalance) {
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    // Method to deposit cash
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited cash: $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Overloaded method to deposit by check
    public void deposit(double amount, String checkNumber) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited check: $" + amount + " Check Number: " + checkNumber);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Method to withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient funds");
        }
    }

    // Method to check balance
    public double getBalance() {
        return balance;
    }

    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: $" + balance);
    }

    public static void main(String[] args) {
        // Create a general account
        BankAccount generalAccount = new BankAccount();
        generalAccount.deposit(500);
        generalAccount.deposit(300, "CHK12345");
        generalAccount.withdraw(200);
        generalAccount.displayAccountInfo();
        System.out.println();

        // Create a savings account with initial balance
        BankAccount savingsAccount = new BankAccount("Savings", 1000);
        savingsAccount.deposit(200);
        savingsAccount.withdraw(150);
        savingsAccount.displayAccountInfo();
        System.out.println();

        // Create a checking account
        BankAccount checkingAccount = new BankAccount("Checking");
        checkingAccount.deposit(400);
        checkingAccount.deposit(150, "CHK54321");
        checkingAccount.withdraw(250);
        checkingAccount.displayAccountInfo();
    }
}
