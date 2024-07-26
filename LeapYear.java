import java.util.Scanner;

// Class to determine if a given year is a leap year
class FindLeapYear {

    // Method to check if a year is a leap year
    public static void checkLeapYear(int year) {
        // Check if the year is divisible by 4 but not divisible by 100
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Year " + year + " is a Leap Year");
        }
        // Check if the year is divisible by 400
        else if (year % 400 == 0) {
            System.out.println("Year " + year + " is a Leap Year");
        }
        // If neither condition is met, it is not a leap year
        else {
            System.out.println("Year " + year + " is not a Leap Year");
        }
    }
}

// Main class to execute the leap year check
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        // Inform the user about the program's purpose
        System.out.println("This program checks if the given year is a leap year or not.");
        System.out.print("Enter the Year: ");
        int year = sc.nextInt(); // Read the user input for year
        
        // Create an instance of FindLeapYear and check if the year is a leap year
        FindLeapYear ly = new FindLeapYear();
        ly.checkLeapYear(year); // Call the method to check if the year is a leap year
    }
}
