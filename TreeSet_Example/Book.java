// Create a Book class with bookId, bookName and authorName.Create parameterized constructor to initialize the object. Create an ArrayList of type Book and store all book objects into collections and display all book details. [Hint:Use advanced for loop to display all Books details]
import java.util.*;

class NegativeArraySizeException extends Exception{//base
    public NegativeArraySizeException(String msg){
        super(msg);
    }
}

public class Book{
    public static void main(String[] args) {
        BooksOperation bo = new BooksOperation();

        Scanner sc = new Scanner(System.in);

       try {
            System.out.print("How many books you want to add : ");
            int number = sc.nextInt();

            //Using Exceptions
            if(number <= 0){
                throw new NegativeArraySizeException("Size is less than 1 ");
            }

            System.out.println("===============-------------------------==================");

            for (int i = 0; i < number; i++) {
                bo.insertingBooks();
                System.out.println("===============-------------------------==================");
            }
        } catch (NegativeArraySizeException e) {
            // TODO: handle exception
            System.out.println(e);
        }
        catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println("Please write number not a String");
        }
        
    }
}