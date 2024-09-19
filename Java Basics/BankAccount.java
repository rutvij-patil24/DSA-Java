// BankAccount.java
public class BankAccount {
    public String accountHolderName;  // Public: Accessible anywhere
    private double balance;           // Private: Only accessible within this class
    protected String accountType;     // Protected: Accessible within package and by child classes
    int accountNumber;                // Default (package-private): Accessible within the package

    // Constructor
    public BankAccount(String accountHolderName, int accountNumber, String accountType, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    // Public method: Accessible from anywhere
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + getBalance());  // Using private method to access balance
    }

    // Private method: Only accessible within this class
    private double getBalance() {
        return balance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
}
