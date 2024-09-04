//write a program to create four threads each for displaying first 20 even natural number, square of first 20 odd natural , cube of first 20 even natural number and first 20 multiples of 10
import java.util.*;

/**
 * square extends thread 
 */
class EvenNaturalNumber extends Thread  {
    // Method to perform the calculation and display results
    private void generateEven(){
        System.out.println("First 20 Even Natural number: ");
        for (int a = 1; a <= 20; a++) {
            System.out.println(a+" Even number is :"+a*2);
    }
}

    @Override
    public void run() {
        // TODO Auto-generated method stub
        generateEven();
    }


}
class OddNaturalNumber extends Thread  {
    // Method to perform the calculation and display results
    private void generateOdd(){
        System.out.println("First 20 Odd Natural number: ");
        for (int a = 1; a <= 20; a++) {
            int oddNumber = a*2-1;
            System.out.println("Square of "+oddNumber+ " is:  " + oddNumber * oddNumber);
    }
}

    @Override
    public void run() {
        // TODO Auto-generated method stub
        generateOdd();
    }


}
class EvenNumberCube extends Thread  {
    // Method to perform the calculation and display results
    private void generateCubeOfEven(){
        System.out.println("First 20 Even Natural number: ");
        for (int a = 1; a <= 20; a++) {
            int evenNumber = a*2;
            System.out.println("Cube of "+evenNumber+" is " +evenNumber * evenNumber * evenNumber);
    }
}

    @Override
    public void run() {
        // TODO Auto-generated method stub
        generateCubeOfEven();
    }
}

class MultipleOfNumber extends Thread  {
    // Method to perform the calculation and display results
    private void MultiplyByTen(){
        System.out.println("Multiple of 10 ");
        for (int a = 1; a <= 20; a++) {
            System.out.println(a + " Number multiply by 10 is "+ (a*10));
            }
        }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        MultiplyByTen();
    }
}


public class ThreadQuestion {
    public static void main(String[] args) {
        // Create instances of each thread
        EvenNaturalNumber thread1 = new EvenNaturalNumber();
        OddNaturalNumber thread2 = new OddNaturalNumber();
        EvenNumberCube thread3 = new EvenNumberCube();
        MultipleOfNumber thread4 = new MultipleOfNumber();
         
        //Starting each thread
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
