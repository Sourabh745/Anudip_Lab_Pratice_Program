import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        
        //=---------Creating a list-----------=
        List<String> list = new ArrayList<>(
            Arrays.asList("America","Europe","India", "Oman", "UK") 
        );

        //=----------Creating a object of different class --------------------=
        ReversingTheGivenList RL = new ReversingTheGivenList();
        RL.Reverse(list);//Calling a method
    }
}

//import java.util.List;

class ReversingTheGivenList {

    //=----------Reversing using Recurssion------------------=
    public static <T> void TruelyReverse(List<T> list){
        //=------Base condition when list is 0 ----------=
        if(list.size() <= 1 || list == null)
            return ;

        //=--------Removing a first element of a list------------=
        T value = list.remove(0);
        //=--------Reversing a list until list is less than 1---------------=
        TruelyReverse(list);

        //=---------Adding a first at the end ---------------=
        list.add(value);
    }

    // Method call by a main method
    public <T> void Reverse(List<T> list){
        System.out.print("List Before Reversing: ");
        System.out.println(list);
        System.out.println("==---------------------------------------==");

        TruelyReverse(list);
        System.out.print("List After Reversing: ");
        System.out.println(list);
    }
}
