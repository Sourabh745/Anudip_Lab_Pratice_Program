//Write a program to check whether a number is a Strong number or not. Strong number is a special number whose sum of factorial of digits is equal to the original number. For example: 145 is a strong number. Since, 1! + 4! + 5! = 145

import java.util.*;

class UsingAlgo{

    public int factorial(int temp){
        int calculation=1;
        for(int i=temp ; i>0; i--){
            calculation *= i;
        }
        return calculation;
    }
    public void SeperatingNumber(int num){
        int OriginalNumber = num;
        int temp=0;
        int sum = 0;
        while(num>0){
            temp = num%10;
            num /= 10;
            sum += factorial(temp);
        }
        if(OriginalNumber == sum){
            System.out.println("sum of factorial of digits is "+sum+" which is equal to the original number "+OriginalNumber);
        }
        else{
            System.out.println("sum of factorial of digits is "+sum+" which is not equal to the original number "+OriginalNumber);
        }
    }
}
public class StrongNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("check whether a number is a Strong number or not.");
        System.out.print("Enter the numnber: ");
        int number = sc.nextInt();

        UsingAlgo ua = new UsingAlgo();
        ua.SeperatingNumber(number);

    }
}