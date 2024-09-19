// BankEmployee.java
public class BankEmployee {
    
    // Method to display some account details
    public void displayBankAccountDetails(BankAccount account) {
        // Public field (Accessible)
        System.out.println("Employee Access - Account Holder: " + account.accountHolderName);

        // Default field (Accessible as it's in the same package)
        System.out.println("Employee Access - Account Number: " + account.accountNumber);

        // Protected field (Accessible as it's in the same package)
        System.out.println("Employee Access - Account Type: " + account.accountType);

        // Private field (NOT Accessible, would cause an error)
        // System.out.println("Employee Access - Balance: " + account.balance);  // ERROR!
    }
}
