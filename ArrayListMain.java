import java.util.ArrayList;
import java.util.Iterator;


class ArrayListCalculationEvenNumbers {

    // Method to calculate the sum of even numbers in the list
    public int sumOfEvenNumbers(ArrayList<Integer> list) {
        Iterator<Integer> iterator = list.iterator(); 
        int sum = 0;
        
        // Iterate through the list
        while (iterator.hasNext()) {
            try {
                Integer data = iterator.next();
                // Check if the number is even
                if ( data % 2 == 0) {
                    sum += data;
                }
            } catch (Exception e) {
                System.out.println("An error occurred in the list: " + e.getMessage());
            }
        }
        
        return sum;
    }
}


public class ArrayListMain {
    public static void main(String[] args) {
        // -----------Create an ArrayList--------------
        ArrayList<Integer> list = new ArrayList<>();
        //-------- Adding Elements in Arraylist----------------
        list.add(-2);
        list.add(3);
        list.add(-6);
        list.add(21);
        list.add(59);
        list.add(12);
        list.add(null);
        
        //------------- Print the list ---------------
        System.out.println("List: " + list);
        
        // ----------Create an instance of ArrayListCalculation-----------------
        ArrayListCalculationEvenNumbers processor = new ArrayListCalculationEvenNumbers();
        
        // ------------------Calculate and print the sum of even numbers ----------------
        System.out.println("=----------------------------=");
        System.out.println("Sum of all even numbers present in array list:");
        int sum = processor.sumOfEvenNumbers(list);
        System.out.println(sum);
    }
}
