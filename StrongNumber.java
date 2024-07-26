//Write a program to check whether a number is a Strong number or not. Strong number is a special number whose sum of factorial of digits is equal to the original number. For example: 145 is a strong number. Since, 1! + 4! + 5! = 145

import java.util.*;

// Class to determine if a number is a Strong Number
class FindStrong{

    // Method to calculate the factorial of a given number
    public int factorial(int temp){
        int calculation = 1;
        // Loop to compute factorial
        for(int i = temp; i > 0; i--){
            calculation *= i;
        }
        return calculation;
    }

    // Method to check if a number is a Strong Number
    public void SeperatingNumber(int num){
        int OriginalNumber = num; // Store the original number
        int temp = 0; // To hold the last digit of the number
        int sum = 0; // To accumulate the sum of factorials of digits

        // Loop to process each digit of the number
        while(num > 0){
            temp = num % 10; // Extract the last digit
            num /= 10; // Remove the last digit from the number
            sum += factorial(temp); // Add the factorial of the digit to sum
        }

        // Compare the sum of factorials to the original number
        if(OriginalNumber == sum){
            System.out.println("Strong Number"); // If they are equal, it's a Strong Number
        } else {
            System.out.println("Not a Strong Number"); // Otherwise, it's not a Strong Number
        }
    }
}

// Main class to run the Strong Number check
public class StrongNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        
        // Prompt the user
        System.out.println("Check whether a number is a Strong number or not.");
        System.out.print("Enter the number: ");
        int number = sc.nextInt(); // Read user input

        // Create an instance of FindStrong and check the number
        FindStrong f = new FindStrong();
        f.SeperatingNumber(number); // Call the method to check if the number is Strong
    }
}
