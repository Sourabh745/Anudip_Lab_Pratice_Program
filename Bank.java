import java.util.*;

// Class to handle banking operations such as deposit and withdrawal
class CalculateAmount {
    double amount; // Variable to store the current balance

    // Constructor to initialize the balance with the initial amount
    CalculateAmount(int a) {
        amount = a;
    }

    // Method to withdraw a specified amount from the balance
    public void withdraw(double withdrawalAmount) {
        // Check if the withdrawal amount is greater than the current balance
        if (withdrawalAmount > amount) {
            System.out.println("Balance insufficient"); // Inform the user of insufficient balance
        } else {
            amount -= withdrawalAmount; // Deduct the withdrawal amount from the balance
            System.out.println("Withdraw Successfully"); // Confirm successful withdrawal
        }
    }

    // Method to deposit a specified amount into the balance
    public void deposit(double depositAmount) {
        amount += depositAmount; // Add the deposit amount to the balance
    }

    // Method to display the remaining balance
    public void displayRemainingAmount() {
        System.out.println("Remaining amount: " + amount); // Print the current balance
    }
}

// Main class to execute banking operations
public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter the amount they want to deposit
        System.out.print("Amount you want to deposit: ");
        int amount = sc.nextInt(); // Read the deposit amount

        // Initialize a CalculateAmount object with the deposited amount
        CalculateAmount ca = new CalculateAmount(amount);

        // Prompt the user to enter the amount they want to withdraw
        System.out.print("Amount you want to withdraw: ");
        double withdrawalAmount = sc.nextDouble(); // Read the withdrawal amount
        ca.withdraw(withdrawalAmount); // Perform the withdrawal

        // Display the remaining balance after the withdrawal
        ca.displayRemainingAmount();

        // Prompt the user to enter the amount they want to deposit
        System.out.print("Amount you want to deposit: ");
        double depositAmount = sc.nextDouble(); // Read the deposit amount
        ca.deposit(depositAmount); // Perform the deposit

        // Display the remaining balance after the deposit
        ca.displayRemainingAmount();
    }
}
