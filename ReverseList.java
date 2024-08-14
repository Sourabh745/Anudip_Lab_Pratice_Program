//Write a program to reverse a given List of strings.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ReversingTheGivenList {

    //=----------Reversing using Recurssion------------------=
    public static void TruelyReverse(List<String> list){
        try {
        //=------Base condition when list is 0 ----------=
            if(list.size() <= 1 || list == null)
                return ;
    
            //=--------Removing a first element of a list------------=
            String value = list.remove(0);
            //=--------Reversing a list until list is less than 1---------------=
            TruelyReverse(list);
    
            //=---------Adding a first at the end ---------------=
            list.add(value);
        }catch (Exception e) {
            System.out.println("An error occurred during the reversal process: " + e.getMessage());
        }
    }


    // Method call by a main method
    public static void Reverse(List<String> list){
        try {
            if (list == null) {
                throw new IllegalArgumentException("The list cannot be null.");
            }

            System.out.print("List Before Reversing: ");
            System.out.println(list);
            System.out.println("==---------------------------------------==");

            TruelyReverse(list);
            
            System.out.print("List After Reversing: ");
            System.out.println(list);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

//----------Main Class---------------
public class ReverseList {
    public static void main(String[] args) {
        
        //=---------Creating a list-----------=
        List<String> list = new ArrayList<>(
            Arrays.asList("America","Europe","India", "Oman", "UK") 
        );

        //List<String> list2 = null; if we pass this list then an exception throw error message

        //=----------Creating a object of different class --------------------=
        ReversingTheGivenList RL = new ReversingTheGivenList();
        RL.Reverse(list);//Calling a method
        //RL.Reverse(list2);//Calling a method
    }
}

