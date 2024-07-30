public class ArrayExceptionDemo {

    public static void main(String[] args) {
        // Create an array of 3 integers
        int[] numbers = new int[3];
        
        // Initialize the array with some values
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        
        // you can directly assign
        //int[] numbers = {1,2,3};

        // Print the array values
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        System.out.println("Lets try to access the index 3");
        // Attempt to access an index that is out of bounds
        try {
            // Index 3 is out of bounds since valid indices are 0, 1, 2
            System.out.println("Accessing index 3: " + numbers[3]);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
