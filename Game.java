import java.util.*;

class Gamer{
    public int number;
    public int noOfGuess=0;
    public int inputNumber; 

    public int getNoOfGuess() {
        return noOfGuess;
    }

    public void setNoOfGuess(int noOfGuess) {
        this.noOfGuess = noOfGuess;
    }

    Gamer(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    int takeInputNumber(){
        System.out.print("Put your number ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
        return inputNumber;
    }
    boolean isCorrectNumber(){
        noOfGuess++;
        System.out.println("Guess the number ");
        if(inputNumber == number){
            //System.out.println("Your Number "+inputNumber+ " is equal to "+ this.number);
            System.out.format("Yes you guessed it right, it was %d\n You guessed it in %d attempts ", number,noOfGuess);
            return true;
        }
        else if(inputNumber < number){
           // System.out.println("Your Number "+inputNumber+ " is less than "+ this.number);
            System.out.println("Too less ...");
        }
        else if(inputNumber > number){
            //System.out.println("Your Number "+inputNumber+ " is higher than "+ this.number);
            System.out.println("Too high ...");
        }
        
            return false; 
    }

}

public class Game{
    public static void main(String[] args) {
        Gamer g = new Gamer();
        boolean b = false;
        while (!b) { 
            g.takeInputNumber();
            b = g.isCorrectNumber();
            System.out.println(b);
        }
    }
}