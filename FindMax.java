// Write a program to input two numbers and find the maximum between two numbers using the conditional/ternary operator.

import java.util.*;

class MaxNumber {

    int num1, num2, max=0;
    MaxNumber(int a, int b) {
        num1 = a;
        num2 = b;
    }
    public void comparingNumber(){
        int res =  (num1>num2)? (max = num1) : (max = num2);
    }

    public void display(){
        System.out.println("Maximum number between "+num1+" and "+num2+" is : "+max);
    }
    
}

public class FindMax{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number one is ");
        int a = sc.nextInt();
        System.out.print("Number Two is ");
        int b = sc.nextInt();

        MaxNumber m = new MaxNumber(a, b);
        m.comparingNumber();
        m.display();
    }
}
