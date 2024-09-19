// CheckingAccount.java
public class CheckingAccount extends BankAccount {

    // Constructor
    public CheckingAccount(String accountHolderName, int accountNumber, double initialBalance) {
        super(accountHolderName, accountNumber, "Checking", initialBalance);  // Call parent constructor
    }

    // Method to withdraw money (public method)
    public void withdraw(double amount) {
        // Cannot access private balance directly
        deposit(-amount);  // Use public deposit() method to simulate withdrawal
    }

    // Overriding the parent method to add extra info
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();  // Call parent method
        System.out.println("This is a Checking Account.");
    }
}
