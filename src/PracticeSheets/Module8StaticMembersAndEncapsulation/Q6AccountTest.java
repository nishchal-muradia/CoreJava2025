package PracticeSheets.Module8StaticMembersAndEncapsulation;

/*Create a class Account with:
        private fields accountNumber, balance
public getters and setters
validation in setter to ensure balance cannot be negative
Q: Try setting a negative balance. What happens?*/
public class Q6AccountTest {
    public static void main(String[] args) {
        Account acc = new Account();

        acc.setAccountNumber("123456789");
        acc.setBalance(5000); // valid
        acc.displayInfo();

        System.out.println("Trying to set negative balance...");
        acc.setBalance(-1000); // invalid
        acc.displayInfo();
    }
}

class Account {
    // Private fields
    private String accountNumber;
    private double balance;

    // Getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter for accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance with validation
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("❌ Error: Balance cannot be negative. Value not set.");
        }
    }

    // Method to display account info
    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}