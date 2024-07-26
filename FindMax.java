// Write a program to input two numbers and find the maximum between two numbers using the conditional/ternary operator.

import java.util.*;

// Class to find the maximum of two numbers
class MaxNumber {

    int num1, num2, max = 0; // Variables to store two numbers and the maximum number

    // Constructor to initialize the two numbers
    MaxNumber(int a, int b) {
        num1 = a;
        num2 = b;
    }

    // Method to compare the two numbers and determine the maximum
    public void comparingNumber() {
        // Use a ternary operator to compare the two numbers and set 'max'
        int res = (num1 > num2) ? (max = num1) : (max = num2);
    }

    // Method to display the maximum number
    public void display() {
        System.out.println("Maximum number between " + num1 + " and " + num2 + " is: " + max);
    }
}

// Main class to execute the maximum number finding process
public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter the first number
        System.out.print("Number one is: ");
        int a = sc.nextInt(); // Read the first number

        // Prompt the user to enter the second number
        System.out.print("Number Two is: ");
        int b = sc.nextInt(); // Read the second number

        // Create an instance of MaxNumber with the two numbers
        MaxNumber m = new MaxNumber(a, b);

        // Compare the two numbers to determine the maximum
        m.comparingNumber();

        // Display the maximum number
        m.display();
    }
}
