// AccessModifierExample.java
public class AccessModifierExample {
    public static void main(String[] args) {
        // Create a CheckingAccount object
        CheckingAccount myAccount = new CheckingAccount("John Doe", 123456, 5000.0);
        
        // Accessing public and protected fields/methods
        myAccount.displayAccountDetails();  // Public method (Accessible)
        System.out.println("Public Access - Account Holder: " + myAccount.accountHolderName);  // Public field (Accessible)

        // Accessing private field (This will cause an error)
        // System.out.println("Private Access - Balance: " + myAccount.balance);  // ERROR: balance is private

        // Create a BankEmployee object
        BankEmployee employee = new BankEmployee();
        employee.displayBankAccountDetails(myAccount);  // Employee can access some fields
    }
}


// Explanation of Access Modifiers:
// Public (public):

// Accessible anywhere, even outside the package.
// Example: accountHolderName and displayAccountDetails() can be accessed 
// from any class, including in the BankEmployee and AccessModifierExample.
// Private (private):

// Accessible only within the class it is defined in.
// Example: balance and getBalance() are private, so they cannot be accessed 
// directly from CheckingAccount or BankEmployee.
// Protected (protected):

// Accessible within the same package and in subclasses, even if they are in 
// different packages.
// Example: accountType is accessible in the same package by BankEmployee 
// and also by CheckingAccount because it’s a subclass of BankAccount.
// Default (Package-private):

// If no access modifier is specified, it's accessible only within the 
// same package.
// Example: accountNumber has no explicit modifier, so it's package-private, 
// meaning it can be accessed by BankEmployee (in the same package) but 
// not from outside the package.

